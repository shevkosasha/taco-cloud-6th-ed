package tacos.db.jdbc.repository;

import tacos.models.Ingredient;

import java.util.List;
import java.util.Optional;

public interface IngredientRepositoryJdbc {
    List<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
