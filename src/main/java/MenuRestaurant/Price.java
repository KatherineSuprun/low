package MenuRestaurant;

public enum Price  {;

    public static final int FISH = 30 * Order.quantity1;
    public static final int MEAT = 12 * Order.quantity1;
    public static final int BURGER = 20 * Order.quantity1;
    public static final int PIZZA = 70 * Order.quantity1;
    public static final int MILKSHAKE = 10 * Order.quantity1;
    public static final int TEA = 7 * Order.quantity1;
    public static final int COFFEE = 9 * Order.quantity1;
    private final int price;

    Price(int price) {
        this.price = price;
    }

    public static int getPrice(int price) {
        return price;
    }
}
