package tacos.db.springdata.jdbc;

import org.springframework.data.repository.CrudRepository;
import tacos.models.h2.TacoOrder;

public interface OrderRepositorySpringJDBC extends CrudRepository<TacoOrder, Long> {
}

