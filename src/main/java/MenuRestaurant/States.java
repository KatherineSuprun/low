package MenuRestaurant;

public enum States {

    PREPARING("Prepare", 1),
    SAUCE("Add sauce", 2),
    SPICES("Add spices", 3),
    ADD_INGREDIENTS("Add ingredients", 4),
    CUT("Cut", 5),
    FRY("Fry", 6),
    BAKE("Bake", 7),
    PACKING("Packing", 8);

    public final int number;
    public final String state;

    States(String state, int number) {
        this.number = number;
        this.state = state;
    }
}
