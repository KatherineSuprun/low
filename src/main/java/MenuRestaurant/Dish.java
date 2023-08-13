package MenuRestaurant;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Dish {


    private List<String> ingredients;
    private String name;
    private boolean isFinished;
    private List<States> states;

    public Dish(String name, List<String> ingredients, List<States> states) {
        this.ingredients = ingredients;
        this.name = name;
        this.states = states;
    }

}

