
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Weekdays {

    public static void main(String[] args) {
        
        
      String [] days = new String [7];
        // Initializing the array with day names
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day index (0-6): ");

        int index = scanner.nextInt();

        try {
            System.out.println("Day: " + days[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid index! Please enter a value between 0 and 6.");
        }
    

    scanner.close();
}
}

        

