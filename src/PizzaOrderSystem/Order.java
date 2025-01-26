package PizzaOrderSystem;
public class Order {

}

public enum PizzaSize {
    SMAll(8),
    MEDIUM(10),
    LARGE(12);

    final int basePrice;
    PizzaSize(int basePrice) {
        this.basePrice = basePrice;
    }

    int getBasePrice() {
        return basePrice;
    }
}

public enum Toppings {
    CHEESE(5),
    PEPPERONI(7),
    VEGGIES(8);

    final int cost;

    Toppings(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
