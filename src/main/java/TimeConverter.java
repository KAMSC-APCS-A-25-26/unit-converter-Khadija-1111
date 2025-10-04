import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("\nConvert time to total seconds ");
            System.out.print("Enter hours: ");
            int hours = sc.nextInt();
            System.out.print("Enter minutes: ");
            int minutes = sc.nextInt();
            System.out.print("Enter seconds: ");
            int seconds = sc.nextInt();
            int hourstoSeconds = hours * 3600;
            int minutestoSeconds = minutes * 60;
            int totalseconds = hourstoSeconds + minutestoSeconds + seconds;
            System.out.println("\nTime conversion:");
            System.out.printf("Input: %d hour, %d minute, %d seconds\n", hours, minutes, seconds);
            System.out.printf("Total seconds: %d\n", totalseconds);
            System.out.println("\nCalculation:");
            System.out.printf("%d hours x 3600 = %d seconds\n", hours, hourstoSeconds);
            System.out.printf("%d minutes x 60 = %d seconds\n", minutes, minutestoSeconds);
            System.out.printf("%d seconds = %d seconds\n", seconds, seconds);
            System.out.printf("Total: %d seconds\n", totalseconds);
            System.out.print("\nDo you want to convert time? (y/n): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));
    }
}