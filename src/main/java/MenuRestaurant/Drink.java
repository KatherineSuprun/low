package MenuRestaurant;

public enum Drink {
    MILKSHAKE(10), TEA(3), COFFEE(5);

    private int time;

    Drink(int time) {
        this.time = time;
    }
}