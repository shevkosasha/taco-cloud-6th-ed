package tacos.db.cassandra;

import org.springframework.data.repository.CrudRepository;
import tacos.models.cassandra.Ingredient;

public interface IngredientRepositoryCassandra extends CrudRepository<Ingredient, String> {
}
