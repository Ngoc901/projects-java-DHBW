package PizzaOrderSystem;

public enum PizzaSize {
    SMAll(8),
    MEDIUM(10),
    LARGE(12);

    private final int basePrice;
    PizzaSize(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getBasePrice() {
        return basePrice;
    }
}

public enum Toppings {
    CHEESE,
    PEPPERONI,
    VEGGIES;

    private final int cost;

    Toppings(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
