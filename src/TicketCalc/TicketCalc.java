package TicketCalc;

import java.util.Random;
import java.util.Scanner;

public class TicketCalc {
    public static int calculateDiscountedPrice(int discount, int price){
        return Math.round(price * (1-(discount/100.0f)));
    }

    public static void ticketCalculator(){
        /*Write a program that calculates ticket prices for a theme park based on age and whether the visitor is a student or senior. Student must be under the age of 30 to be a student.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        Random random = new Random();
        System.out.println("Please show your student ID ");
        boolean isStudent = random.nextBoolean();

        int finalPrice;
        int price = 100;

        if(age < 10){
            System.out.println("Yor are quite young. You will fall out of one of the chairs, and may never get older, but you are free to enter.");
        } else if( age >= 10 && age < 30 && isStudent){
            finalPrice = calculateDiscountedPrice(30, price);
            System.out.println("Your ticket is "+ finalPrice + "Euros" );
        }else if( age >= 30 && isStudent){
            finalPrice = calculateDiscountedPrice(30, price);
            System.out.println("Your ticket is "+ finalPrice + "Euros" );
        }
        scanner.close();

    }
}
