package tacos.db.springdata;

import org.springframework.data.repository.CrudRepository;
import tacos.models.TacoOrder;

public interface OrderRepositorySpringJDBC
        extends CrudRepository<TacoOrder, Long> {
}

