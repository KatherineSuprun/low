import java.util.*;
import java.util.stream.Stream;

public class MenuSort implements Comparable<MenuSort> {

    String name;
    String ingredients;
    int price;

    public MenuSort(String name, String ingredients, int price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", ingredients: " + ingredients +
                ". price: " + price + "\n";
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(MenuSort o) {
        return this.price - o.
                getPrice();
    }

    public static void filter() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Specify the desired price range from 30 to 71 and " +
                "we will recommend what you choose:");
        System.out.println("To...");

        int b = scann.nextInt();
        System.out.println("Thank`s. We recommended this: ");

        Stream<MenuSort> streams = Stream.of(
                new MenuSort("Fish", "mullet, greens," +
                        " lemon, spices", 30),
                new MenuSort("Meat", "veal, rosemary, oil," +
                        " salt", 12),
                new MenuSort("Burger ", "bun, meat, cheese, " +
                        "greens, mayonnaise", 20),
                new MenuSort("Pizza ", "dough, sausages, cheddar," +
                        " tomato, ham, arugula", 70));

        streams.filter(p -> p.getPrice() < b).forEach(p -> System.out.println(p.getName()));

    }
}