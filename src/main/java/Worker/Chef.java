package Worker;
import MenuRestaurant.Food;
import java.util.Map;


public class Chef extends Cook implements Сooking {
    public Chef(String name, String surname, String contactNumber) {
        super(name, surname, contactNumber);
    }

    @Override
    public boolean cookItem(Food food) {
        return false;
    }

    @Override
    public boolean cookItem(String nameOfDish, Map<String, Food> dishesToChose) {

        return false;
    }

}
