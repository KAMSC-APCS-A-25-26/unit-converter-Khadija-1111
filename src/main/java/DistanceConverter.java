import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // TODO: Implement distance converter
        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        final double MILES_TO_KM = 1.60935;
        while(running){
            System.out.println("\nChoose conversion direction: ");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice){
                default:
                    System.out.println("Invalid choice");
                    break;
                case 1:
                    System.out.print("\nEnter distance in miles: ");
                    double miles1 = scan.nextDouble();
                    double kilometers1 = miles1 * MILES_TO_KM;
                    if (miles1 == 0){
                       System.out.println("Distance is zero. Conversion result will also be zero.");
                    }
                    else {
                        System.out.println("\nConversion result:");
                        System.out.printf("Miles: %.5f\n", miles1);
                        System.out.printf("Kilometers: %.5f\n", kilometers1);
                    }
                    break;
                case 2:
                    System.out.print("\nEnter distance in kilometers: ");
                    double miles2 = scan.nextDouble();
                    double kilometers2 = miles2 / MILES_TO_KM;
                    if (miles2 == 0) {
                        System.out.println("Distance is zero. Conversion result will also be zero.");
                    }
                    else {
                        System.out.println("\nConversion result:");
                        System.out.printf("Kilometers: %.5f\n", kilometers2);
                        System.out.printf("Miles: %.5f\n", miles2);
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running = false;
            }
        }
    }
}