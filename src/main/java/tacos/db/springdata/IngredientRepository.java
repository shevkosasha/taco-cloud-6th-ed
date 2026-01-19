package tacos.db.springdata;

import org.springframework.data.repository.CrudRepository;
import tacos.models.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
