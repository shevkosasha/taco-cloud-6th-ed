package tacos.db.springdatajdbc;

import org.springframework.data.repository.CrudRepository;
import tacos.models.Ingredient;

public interface IngredientRepositorySpringJDBC
        extends CrudRepository<Ingredient, String> {
}
