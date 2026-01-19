package tacos.utils;

import tacos.models.cassandra.Ingredient;
import tacos.models.cassandra.IngredientUDT;

public class TacoUDRUtils {

    public static IngredientUDT toIngredientUDT(Ingredient ingredient) {
        return new IngredientUDT(ingredient.getName(), ingredient.getType());
    }
}
