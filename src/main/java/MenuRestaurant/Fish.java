package MenuRestaurant;

import java.util.List;

public class Fish extends Food {
    String name;
    List<String> ingredients;
    boolean isReady;

    public Fish(Integer price, List<String> ingredients, List<States> states) {
        super(price, ingredients, states);
    }
}