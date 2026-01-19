package tacos.db.springdata.jdbc;

import org.springframework.data.repository.CrudRepository;
import tacos.models.h2.Ingredient;

public interface IngredientRepositorySpringJDBC extends CrudRepository<Ingredient, String> {
}
