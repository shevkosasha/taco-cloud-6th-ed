package tacos.db.springdata.jpa;

import org.springframework.data.repository.CrudRepository;
import tacos.models.h2.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
