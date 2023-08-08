import Hall.ClientsQueue;
import MenuRestaurant.*;

import java.util.*;

public class Restaurant {
    public static void main(String[] args) {


        System.out.println("Welcome to restaurant!");
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(1, "Viktor Barinov");
        passportsAndNames.put(2, "Maksim Lavrov");
        passportsAndNames.put(3, "James Bond");

        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println("Hall.Table: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Guests: " + values);

        List<MenuSort> menuPrices = new ArrayList<>(Arrays.asList(

                new MenuSort("Fish", "mullet, greens," +
                        " lemon, spices", 30),
                new MenuSort("Meat", "veal, rosemary, oil," +
                        " salt", 12),
                new MenuSort("Burger ", "bun, meat, cheese, " +
                        "greens, mayonnaise", 20),
                new MenuSort("Pizza ", "dough, sausages, cheddar," +
                        " tomato, ham, arugula", 70)));

        System.out.println("Hello, it`s our menu, choose:");

        Collections.sort(menuPrices);
        for (MenuSort s : menuPrices) {
            System.out.println(s);
        }
        Order.createOrder();
        MenuSort.filter();

//        Kitchen kitchen = new Kitchen();
//        Map<String, Food> ordered = Map.of("Fish", new Food("Fish"),
//                "Meat", new Food("Meat"), "Burger", new Food("Burger"),
//                "Pizza", new Food("Pizza"));
//        Food food = new Food(ordered);
//        kitchen.startCookingProcess((Food) ordered);

//        Map<String, ? super Food> kitchenMenu = Map.of(
//                "Beef steak", new MeatDish("Beaf",
//                        12.000, List.of(""), false));
//    public static final Map<String, ? super Drink> barMenu = Map.of("Vodka",
//            new AlcoDrink(), "Sok", new NonAlcoDrink());

//Map<String, Dish> ordered = new HashMap<>();
//        ordered.put("Puree", new Dish("Puree", List.of("Potato", "Cream", "Salt"),
//                List.of( States.CHOPPED, States.BOLED, States.WITH_SPICES)));
////        ordered.put("Apple Tart", new Dish("Apple Tart", List.of("Base", "Cream", "Lemons","Sugar"),
////                List.of(States.CHOPPED, States.BAKED)));


//        List<MenuSort> duplicates = menuPrices.stream()
//                .collect(Collectors.groupingBy(Function.identity()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue().size() > 1)
//                .map(Map.Entry::getKey)
//                .toList();

        System.out.println("Ohh, and what about drinks? ");
        Map<String, String> menuDrink = new HashMap<>();
        menuDrink.put("Milkshake ", " milk, strawberry");
        menuDrink.put("Coffee ", " milk, syrup, arabika");
        menuDrink.put("Tea ", " green tea");
        for (Map.Entry entry : menuDrink.entrySet()) {
            String k = String.valueOf(entry.getKey());
            String v = String.valueOf(entry.getValue());
            System.out.println("Drink: " + k + ", Ingredients: " + v);
        }

        Barmen.offerDrink();
        Order.createOrder2();

        Thread t1 = new Thread(new ClientsQueue());
        t1.start();

        try {
            Thread.sleep(10_0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        Thread t2 = new Thread(new Hall.EnoughFun());
//        t2.start();
//
//        try {
//            Thread.sleep(15_0);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        t1.interrupt();
//        t2.interrupt();
//    }
    }
}
