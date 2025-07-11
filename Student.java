import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {

        public static void main(String[] args) {
            
            //  keys are NAMES (string) and integers are GRADES (integer)
            
            Map<String, Integer> students = new HashMap<>();
            
            
            addStudent(students, "Alice", 90);
            addStudent(students, "Bob", 85);

            displayGrade(students, "Alice");

            removeStudent(students, "Bob");
            
        }
    
        // method to add a new student

        public static void addStudent(Map<String, Integer> students, String name, Integer grade) {

            students.put(name, grade);

            System.out.println("new student =" + name + ",grade=" + grade);
        }
    
        // method to remove students

        public static void removeStudent(Map<String, Integer> students, String name) {

            if (students.containsKey(name)) {

                students.remove(name);

                System.out.println("removed name =" + name);

            } else {

                System.out.println("error : name not found");
            }
        }
    
        // display student's grade using name

        public static void displayGrade(Map<String, Integer> students, String name) {

            if (students.containsKey(name)) {

                Integer grade = students.get(name);

                System.out.println("student grade=" + grade);

            } else {
                
                System.out.println("error :name not found");
            }
        }
    }

    

