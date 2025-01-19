package EarthquakeDetector;

import java.util.Scanner;

public class EarthquakeCategorization {
    public static void  method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the magnitude: ");
        double magnitude = scanner.nextDouble();

        int category;

        category = (magnitude < 2.0) ? 1 : (magnitude < 4.0) ? 2 : (magnitude < 5.0) ? 3 : (magnitude < 6.0) ? 4
                : (magnitude < 7.0) ? 5 : (magnitude < 8.0) ? 6 : 7;

        switch (category) {
            case 1:
                System.out.println("Category: Micro \nStay calm. Most minor earthquakes go unnoticed or cause no damage.");
                break;
            case 2:
                System.out.println("Category: Minor \nBe alert for mild shaking. Secure any unstable objects.");
                break;
            case 3:
                System.out.println("Category: Light \nTake cover under sturdy furniture if indoors; stay away from windows.");
                break;
            case 4:
                System.out.println("Category: Moderate \nDrop, Cover, and Hold On! Avoid exits until shaking stops.");
                break;
            case 5:
                System.out.println("Category: Strong \nProtect yourself under a sturdy structure. Stay calm but act quickly.");
                break;
            case 6:
                System.out.println("Category: Major \nDrop, Cover, and Hold On! Expect prolonged shaking.");
                break;
            case 7:
                System.out.println("Category: Great \nBe prepared for significant damage. Follow official guidance for safety and evacuation.");
                break;
            default:
                System.out.println("Unknown category. Please check the input.");
        }
        scanner.close(); // Always close the scanner to release resources
    }
}
