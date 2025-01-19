package ProgrammingPractice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //sout tab
        System.out.println();
        //with strings to check if they are equal we use the .equals()

    Car mycar = new Car("Chevrolet", "Corvette", 2020, "green", 50000.00);
    mycar.drive();
    Pizza pizza = new Pizza("Thick crust", "Tomato", "Mozzarella");
    System.out.println("Here are the ingredients:");
    System.out.println(pizza.toString());

    Food[] refrigirator = new Food[3];
    Food food1 = new Food("Pizza");
    Food food2 = new Food("Pizza");
    Food food3 = new Food("Pizza");
    Food[] refrigirator2 = {food1, food2, food3};
    refrigirator[0] = food1;
    refrigirator[1] = food2;
    refrigirator[2] = food3;
    System.out.println(refrigirator[0].name);

    Cars car1 = new Cars("BMW");
    Garage garage = new Garage();
    garage.park(car1);
    Friend friend1 = new Friend("Niki");
    Friend friend2 = new Friend("Bob");
    System.out.println(Friend.numberOfFriends);
    Friend.displayNumberOfFriends();

    Scooter scooter = new Scooter();
    scooter.go();


    Bicycle bicycle = new Bicycle();
    bicycle.stop();
    System.out.println(bicycle.pedals);
    bicycle.go();
    Vehicle vehicle = new Vehicle();
    vehicle.go();

    Hero hero1 = new Hero("Batman",42 ,"Money");
    System.out.println(hero1.name);
    System.out.println(hero1.power);
    System.out.println(hero1.toString());





    }
    public static  void OOP(){

    }

    public static void GUI() {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

    }
    public static void Random() {
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        boolean randomBool = rand.nextBoolean();
        double randomDouble = rand.nextDouble();
    }

    public static void SwitchCase() {
        String day = "Friday";
        switch (day) {
            case "Monday": System.out.println("Monday");
            break;
            case "Tuesday": System.out.println("Tuesday");
            break;
            case "Wednesday": System.out.println("Wednesday");
            break;
            case "Thursday": System.out.println("Thursday");
            break;
            case "Friday": System.out.println("Friday");
            break;
            case "Saturday": System.out.println("Saturday");
            break;
            case "Sunday": System.out.println("Sunday");
            break;
            default: System.out.println("That is not a valid day");
        }
    }
    public static void stringMethods() {
        String name = "John  ";
        char letter = name.charAt(0);
        boolean result = name.equalsIgnoreCase("John");
        int resultInt = name.indexOf("o");
        boolean resultBoolean = name.isEmpty();
        String trim = name.trim();
        String replace = name.replace("o", "a");
    }

    public static void wrapperClasses() {
        //autoboxing
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "hello";

        //unboxing
        if (a == true) { //its a reference data type, but will still act as a primitive data type because of unboxing
            System.out.println("This is true");
        }


    }

    public static void arrayList() {
        //only reference data types
        //would have to use the Wrapper class

        ArrayList<String> list = new ArrayList<String>();
        list.add("Pizza");
        list.add("Burger");

        list.set(0, "Sushi");
        list.remove(1);
        list.clear();

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //2D Arraylists
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Donut");
        bakeryList.add("Pudding knot");

        ArrayList<String> drinkList = new ArrayList<>();
        bakeryList.add("Tea");
        bakeryList.add("Coffee");

        ArrayList<String> vegetableList = new ArrayList<>();
        bakeryList.add("Tomato");
        bakeryList.add("Peppers");

        groceryList.add(bakeryList);
        groceryList.add(drinkList);
        groceryList.add(vegetableList);

        System.out.println(groceryList);
    }

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i< nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == target - nums[i]){

                    return new int[] {i, j};
                }
            }
        }

        return new int[0];
    }


}