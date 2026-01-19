package tacos.db.springdatajdbc;

import org.springframework.data.repository.CrudRepository;
import tacos.models.TacoOrder;

public interface OrderRepositorySpringJDBC
        extends CrudRepository<TacoOrder, Long> {
}
