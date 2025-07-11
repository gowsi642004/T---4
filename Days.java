
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Days {

    public static void main(String[] args) {
        
        // Initializing the array with day names
  
        List<String> dayList = new ArrayList<>();

        dayList.add("Sunday");
        dayList.add("Monday");
        dayList.add("Tuesday");
        dayList.add("Wednesday");
        dayList.add("Thursday");
        dayList.add("Friday");
        dayList.add("Saturday");

    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day index (0-6): ");

        int index = scanner.nextInt();

        try {
           
            if (index > 6 || index < 0) {

                throw new IndexOutOfBoundsException("Index out of bounds: " + index);
            }
            System.out.println("Day: " + dayList.get(index));

        } catch (IndexOutOfBoundsException e) {

         
            System.out.println("Error: " + e.getMessage());
            
        }


    scanner.close();
}
}


        

