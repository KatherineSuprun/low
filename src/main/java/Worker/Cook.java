package Worker;

import MenuRestaurant.Food;

public class Cook {
    private String name;
    private String surname;
    private String contactNumber;
    private Food dishToCook;

    public Cook(String name, String surname, String contactNumber) {
        this.name = name;
        this.surname = surname;
        this.contactNumber = contactNumber;
    }

    public Cook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void prepareTheProduct() {
        System.out.println(Food.getName() + ": preparing product..");
    }

    public void cut() {
        System.out.println(Food.getName() + ": cut.. ");
    }

    public void addSpecies() {
        System.out.println(Food.getName() + ": spices are added.. ");
    }

    public void addIngredients() {
        System.out.println(Food.getName() + ": ingredients are added.. ");
    }

    public void addSauce() {
        System.out.println(Food.getName() + ": adding sauce.. ");
    }

    public void fry() { // жарить
        System.out.println(Food.getName() + ": frying.. ");
    }

    public void bake() { // выпекать
        System.out.println(Food.getName() + ": baking.. ");
    }

    public void packing() {
        System.out.println(Food.getName() + ": pack..");
    }

    public Food getDishToCook() {
        return dishToCook;
    }

    public void setDishToCook(Food dishToCook) {
        this.dishToCook = dishToCook;
    }
}