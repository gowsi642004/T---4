import java.util.HashMap;
import java.util.Map;

public class Student {
    

    public static void main(String[] args) {

        //  keys are NAMES (string) and integers are GRADES (integer)
        
        Map<String, Integer> studentone = new HashMap<>();

        studentone.put("rahul", 67);
        studentone.put("loki", 89);

        // method to add a new student

        Map<String, Integer> newStudent = new HashMap<>();

        newStudent.put("niki", 89);

        studentone.putAll(newStudent);

        // print grade by using student's name

        int grade = studentone.get("rahul");

    
        System.out.println("rahul grade=" + grade);

        // to remove a student

        studentone.remove("loki");

        System.out.println(studentone);



    }
}
