package TransactionTracker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class transactionTracker {

    public static void main(String[] args) {
        ArrayList<String> transactions = new ArrayList<String>();

        transactions.add(addTransaction());
        transactions.add("Sales, 100.00, 17-01-2025");
        transactions.add("Purchase, 50.00, 16-01-2025");
        transactions.add("Sales, 10.00, 16-01-2025");
        transactions.add("Purchase, 80.00, 16-01-2025");
        transactions.add("Sales, 40.00, 17-01-2025");


        for(String i : transactions) {
            System.out.println(i);
        }
    }

    public static String addTransaction(){
        boolean valid = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Add your the type of your transaction: ");
        String type = scanner.nextLine();

        System.out.print("Add your the amount of your transaction: ");
        double amount = Double.parseDouble(scanner.nextLine());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.print("Add your the date of your transaction: ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);


        return type + ", " + amount + ", " + date;
    }
}
