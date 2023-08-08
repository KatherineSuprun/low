package MenuRestaurant;

public enum Menu {
    FISH(40), MEAT(20), BURGER(15), PIZZA(5);

    private int time;

    Menu(int time) {
        this.time = time;
    }

    public static int getTime(int time) {
        return time;
    }
}