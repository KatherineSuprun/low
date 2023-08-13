package MenuRestaurant;
import java.util.*;
public class Food {
    private static String name;
    private Integer price;
    private List<String> ingredients;
    private List<States> states;


    public Food(Integer price, List<String> ingredients, List<States> states) {
        this.price = price;
        this.ingredients = ingredients;
        this.states = states;
    }

    private Map<String, Food> orderedDishes;

    public static String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public List<States> getStates() {
        return states;
    }

    public Map<String, Food> getOrderedDishes() {
        return orderedDishes;
    }
}