import java.io.UncheckedIOException;
class CheckedException extends Exception {

    public CheckedException(String message) {

        super(message);
    }
}
class Voter {

    String name;
    int age;
    int voterId;

    public Voter (String name, int age, int voterId)  throws CheckedException{

        this.name = name;
        this.age = age;
        this.voterId = voterId;

        
            // Age must be greater than 18

            if (age < 18 ) {

                throw new CheckedException ("InvalidAgeException: Age must be at least 18, but was " + age);
            }
        
    }

   public void display() {

    System.out.println("name: " + name);
    System.out.println("age: " + age);
    System.out.println("voterId: " + voterId);

   }
}

public class VotingSystem {

    public static void main(String[] args) {

        try {
        
        Voter one = new Voter("arun", 20, 1245);
        one.display();


        Voter two = new Voter("ajay", 03, 03456);
        two.display();

        } catch (CheckedException e ) {

            System.out.println(e.getMessage());
        }

        
    }
}
