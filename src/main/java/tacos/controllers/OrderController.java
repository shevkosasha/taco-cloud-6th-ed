package tacos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.support.SessionStatus;
import tacos.db.springdata.jpa.OrderRepository;
import tacos.models.h2.TacoOrder;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    private OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/current")
    public String orderForm(Model model) {

        if (!model.containsAttribute("tacoOrder")) {
            TacoOrder tacoOrder = new TacoOrder();

//             Set default values
            tacoOrder.setDeliveryName("John Doe");
            tacoOrder.setDeliveryStreet("123 Main St");
            tacoOrder.setDeliveryCity("San Diego");
            tacoOrder.setDeliveryState("CA");
            tacoOrder.setDeliveryZip("92101");
            tacoOrder.setCcNumber("4242424242424242");
            tacoOrder.setCcExpiration("02/32");
            tacoOrder.setCcCVV(String.valueOf(123));

            model.addAttribute("tacoOrder", tacoOrder);
        }
        return "orderForm";
    }
    @PostMapping
    public String processOrder(@Valid TacoOrder order, Errors errors, SessionStatus sessionStatus) {
        if (errors.hasErrors()) {
            log.info(String.valueOf(errors.getFieldErrors()));
            return "orderForm";
        }
        log.info("Order submitted: " + order);

        var savedOrder = orderRepository.save(order);
        log.info("Order saved: " + savedOrder);

        sessionStatus.setComplete();
        return "redirect:/";
    }
}