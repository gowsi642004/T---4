
    class NameNotValidException extends Exception {

    public NameNotValidException(String message) {

        super(message);
    }
}

class AgeNotWithinRangeException extends Exception {

    public AgeNotWithinRangeException (String message) {

        super(message);
    }
}


class Student {
    int rollNo;
    String name;
    int age;
    String course;

    
    public Student(int rollNo, String name, int age, String course)

            throws AgeNotWithinRangeException, NameNotValidException {

        // Name validation: Only letters and spaces allowed
        if (!name.matches("[a-zA-Z\\s]+")) {

            throw new NameNotValidException("Name contains invalid characters: " + name);
        }

        // Age validation
        if (age < 15 || age > 21) {

            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21: " + age);
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display () {

        System.out.println("roll no: " + rollNo);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("course: " + course);

    }
}


public class Management{
    public static void main(String[] args) {

        try {
            Student s1 = new Student(101, "Alice", 18, "Computer Science");

            s1.display();

            Student s2 = new Student(102, "Bob123", 19, "Mathematics"); // Invalid name

            s2.display();

        } catch (AgeNotWithinRangeException | NameNotValidException e) {

            System.out.println("Exception: " + e.getMessage());
        }


    }
}

