class Voter {

    String name;
    int age;
    int voterId;

    public Voter (String name, int age, int voterId) {

        this.name = name;
        this.age = age;
        this.voterId = voterId;

        try {
            // Age must be between 18 and 120
            if (age < 18 ) {

                throw new Exception("InvalidAgeException: Age must be at least 18");
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString () {

        return "{name=" + name + ",age=" + age + ",voterId=" + voterId + "}" ;
    }
}

public class VotingSystem {

    public static void main(String[] args) {
        
        Voter one = new Voter("arun", 20, 1245);
        Voter two = new Voter("ajay", 03, 03456);

        System.out.println(one);
        System.out.println(two);
    }
}
