package EmployeeManagementSystem;
import jdk.jshell.Snippet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*public class EmployeeManager {
    HashMap<Integer, Employee> employees = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    int choice;

    do{
        System.out.println("\n--- Employee Management System ---");
        System.out.println("1. Add Employee");
        System.out.println("2. View All Employees");
        System.out.println("3. Search Employee by ID");
        System.out.println("4. Filter Employees by Salary");
        System.out.println("5. Delete Employee");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addEmployee(employees, scanner);
                break;
            case 2:
                viewAllEmployees(employees);
                break;
            case 3:
                searchEmployeeById(employees, scanner);
                break;
            case 4:
                filterEmployeeById(employees, scanner);
                break;
            case 5:
                deleteEmployeeById(employees, scanner);
                break;
            case 6:
                System.out.println("Existing System...");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }while(choice!=6);


}

    //1. Add Employee
    public static void addEmployee(HashMap<Integer, Employee> employees, Scanner scanner) {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, department, salary);
        employees.put(id, employee);
        System.out.println("Employee Added Successfully");
    }

    //2. View All Employees
    public static void viewAllEmployees(HashMap<Integer, Employee> employees) {
        if(employees.isEmpty()){
            System.out.println("No Employee to Display");
            return;
        }

        System.out.println("\nEmployees Sorted by Name");
        employees.values().stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

        System.out.println("\nEmployees Sorted by Salary");
        employees.values().stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
    }

    //3. Search Employee by ID
    public static void searchEmployeeById(HashMap<Integer, Employee> employees, Scanner scanner) {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        Employee employee = employees.get(id);

        if (employee != null) {
            System.out.println("Employee Found: " + employee.toString());
        }else{
            System.out.println("Employee with"+ id +" ID Not Found");
        }

    }

    //4.Filter Employees by Salary
    public static void filterEmployeeById(HashMap<Integer, Employee> employees, Scanner scanner) {
        System.out.print("Enter minimum salary to filter: ");
        double salaryThreshold = scanner.nextDouble();

        List<Employee> filteredEmployees = employees.values().stream()
                .filter(employee -> employee.getSalary() > salaryThreshold)
                .collect(Collectors.toList());

    }

    //5. Delete Employee
    public static void deleteEmployeeById(HashMap<Integer, Employee> employees, Scanner scanner) {
        System.out.print("Enter Employee ID to Delete: ");
        int id = scanner.nextInt();
        if (employees.remove(id)!= null) {
            System.out.println("Employee with"+ id +" ID Deleted Successfully");
        }else{
            System.out.println("Employee with"+ id +" ID Not Found");
        }
    }
}
*/