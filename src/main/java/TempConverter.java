import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running)
        {
            System.out.println("\n");
            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("\nEnter temperature in Fahrenheit: ");
                    double F1 = sc.nextDouble();
                    double C1 = (F1 - 32) * (5/9);
                    System.out.println("\nConversion Results:");
                    System.out.println("Fahrenheit: " + F1);
                    System.out.println("Celsius: " + C1);
                    break;
                case 2:
                    System.out.print("\nEnter temperature in Celsius: ");
                    double C2 = sc.nextDouble();
                    double F2 = C2 * 9/5 + 32;
                    System.out.println("\nConversion Results:");
                    System.out.println("Celsius: " + C2);
                    System.out.println("Fahrenheit: " + F2);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid menu choice.");
            }
        }
    }
}
