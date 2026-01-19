package tacos.db.mongodb;

import org.springframework.data.repository.CrudRepository;
import tacos.models.mongodb.TacoOrder;

public interface OrderRepositoryMongo extends CrudRepository<TacoOrder, String> {

}
