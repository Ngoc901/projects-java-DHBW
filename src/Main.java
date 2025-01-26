import AirQualityProject.AirQuality;
import Matrices.MatrixOperations;
import Matrices.MatrixShapes;
import Name.Name;
import PizzaOrderSystem.Pizza;
import PizzaOrderSystem.PizzaSize;
import PizzaOrderSystem.Toppings;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Matrix Shapes
        /*System.out.println("Welcome to Matrix shapes");
        Scanner scanner = new Scanner(System.in);
        MatrixShapes.square(scanner);
        MatrixShapes.diamond();
        MatrixShapes.triangle();
        MatrixShapes.christmasTree(scanner);
        System.out.println("-------------");*/

        // Matrix Operations
        /*System.out.println("Welcome to Matrix Operations");
        MatrixOperations.matrixAddition();
        MatrixOperations.matrixMultiplication();
        MatrixOperations.matrixTranspose();
        System.out.println("-------------");*/

        Pizza pizza = new Pizza(PizzaSize.MEDIUM, List.of(Toppings.CHEESE, Toppings.PEPPERONI));
        System.out.println("Total Price: $" + pizza.calculatePrice());





    }
}