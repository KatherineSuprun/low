import MenuRestaurant.Drink;
import MenuRestaurant.Menu;
import MenuRestaurant.Price;

import java.util.Scanner;

public class Barmen  {

    public static int quantity;
    public static void offerDrink() {

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        String upper = choice.toUpperCase();
        Drink drinks = Drink.valueOf(upper);
        System.out.println("Please choose the amount of drink");
        quantity = scanner.nextInt();

        switch (drinks) {
            case MILKSHAKE:

                System.out.println("*************");
                System.out.println("To pay " + Price.MILKSHAKE + " UAH");
                System.out.println("Wait " + Menu.getTime(10) * quantity + " min.");

                break;
            case COFFEE:

                System.out.println("*************");
                System.out.println("To pay " + Price.COFFEE + " UAH");
                System.out.println("Wait " + Menu.getTime(3) * quantity + " min.");
                break;
            case TEA:

                System.out.println("*************");
                System.out.println("To pay " + Price.TEA + " UAH");
                System.out.println("Wait " + Menu.getTime(5) * quantity + " min.");
                break;
            default:
                System.out.println("Thank you for order.");
        }
    }
}
