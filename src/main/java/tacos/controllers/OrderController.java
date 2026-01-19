package tacos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.support.SessionStatus;
import tacos.db.repository.OrderRepository;
import tacos.models.TacoOrder;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    private OrderRepository orderRepo;
    public OrderController(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("tacoOrder", new TacoOrder());
        return "orderForm";
    }

//    @PostMapping
//    public String processOrder(@Valid TacoOrder order, Errors errors) {
//        if (errors.hasErrors()) {
//            log.info(String.valueOf(errors.getFieldErrors()));
//            return "orderForm";
//        }
//        log.info("Order submitted: " + order);
//        return "redirect:/";
//    }
    @PostMapping
    public String processOrder(@Valid TacoOrder order, Errors errors, SessionStatus sessionStatus) {
        if (errors.hasErrors()) {
            log.info(String.valueOf(errors.getFieldErrors()));
            return "orderForm";
        }
        orderRepo.save(order);
        sessionStatus.setComplete();
        log.info("Order submitted: " + order);
        return "redirect:/";
    }
}