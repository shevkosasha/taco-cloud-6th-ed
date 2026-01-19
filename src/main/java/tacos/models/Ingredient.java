package tacos.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
//@Table
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient {

    @Id
    private String id;
    private String name;
    private Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

    // Helper method to handle string to enum conversion
    public static Type getTypeFromString(String typeStr) {
        try {
            return Type.valueOf(typeStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            // Handle numeric values from old database
            switch (typeStr) {
                case "0": case "WRAP": return Type.WRAP;
                case "1": case "PROTEIN": return Type.PROTEIN;
                case "2": case "VEGGIES": return Type.VEGGIES;
                case "3": case "CHEESE": return Type.CHEESE;
                case "4": case "SAUCE": return Type.SAUCE;
                default: throw new IllegalArgumentException("Unknown ingredient type: " + typeStr);
            }
        }
    }
}
