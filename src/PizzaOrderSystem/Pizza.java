/*package PizzaOrderSystem;

import java.util.List;

public class Pizza {
    private PizzaSize size;
    private List<Toppings> toppings;

    public Pizza(PizzaSize size, List<Toppings> toppings) {
        this.size = size;
        this.toppings = toppings;
    }

    public int calculatePrice() {
        int toppingsCosts = toppings.stream().mapToInt(Toppings::getCost).sum();
        return size.getBasePrice() + toppingsCosts;
    }
}
*/