package tacos.db.mongodb;

import org.springframework.data.repository.CrudRepository;
import tacos.models.mongodb.Ingredient;

public interface IngredientRepositoryMongo extends CrudRepository<Ingredient, String> {
}
