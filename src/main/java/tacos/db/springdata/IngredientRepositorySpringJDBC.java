package tacos.db.springdata;

import org.springframework.data.repository.CrudRepository;
import tacos.models.Ingredient;

public interface IngredientRepositorySpringJDBC
        extends CrudRepository<Ingredient, String> {
}
