package tacos.db.cassandra;

import org.springframework.data.repository.CrudRepository;
import tacos.models.cassandra.TacoOrder;

import java.util.UUID;

public interface OrderRepositoryCassandra extends CrudRepository<TacoOrder, UUID> {
}
