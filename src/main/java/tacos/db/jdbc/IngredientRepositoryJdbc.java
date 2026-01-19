package tacos.db.jdbc;

import tacos.models.h2.Ingredient;

import java.util.List;
import java.util.Optional;

public interface IngredientRepositoryJdbc {
    List<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
