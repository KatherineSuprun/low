package MenuRestaurant;

import java.util.List;
import java.util.Map;

public class Pizza extends Food {
    String name;
    List<String> ingredients;
    boolean isReady;
    private boolean isPizza;


    public Pizza(Integer price, List<String> ingredients, boolean isReady, Map<String, Food> orderedDishes) {
        super(price, ingredients, isReady, orderedDishes);
    }
}
