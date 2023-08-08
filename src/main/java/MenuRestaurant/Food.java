package MenuRestaurant;
import java.util.*;

public class Food {
    private static String name;
    private Integer price;
    private List<String> ingredients;
    //private List<States> states;
    private boolean isReady;

   // private List<States> states;

    public Food(Integer price, List<String> ingredients, boolean isReady, Map<String, Food> orderedDishes) {
        this.price = price;
        this.ingredients = ingredients;
        this.isReady = isReady;
        this.orderedDishes = orderedDishes;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Food.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    private Map<String, Food> orderedDishes;

    public Food(Map<String, Food> orderedDishes) {
        this.orderedDishes = orderedDishes;
    }

    public Map<String, Food> getOrderedDishes() {
        return orderedDishes;
    }

    public void setOrderedDishes(Map<String, Food> orderedDishes) {
        this.orderedDishes = orderedDishes;
    }

//    public boolean isFinished() {
//        return isFinished;
//    }
//
//    public void setFinished(boolean finished) {
//        isFinished = finished;
//    }

//    public List<States> getStates() {
//        return states;
//    }
//
//    public void setStates(List<States> states) {
//        this.states = states;


}