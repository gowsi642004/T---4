 class Student {

    String name;
    String course;
    int age;
    int rollno;

     public Student (String name, String course, int age, int rollno){
     
     
        this.name = name;
        this.course = course;
        this.age = age;
        this.rollno = rollno;

        try {
            // age is between 15 to 21

            if (age >15 || age <21) {

                throw new Exception("AgeNotWithinRangeException");
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    

        try {
            // Only letters (upper/lower) and spaces allowed

            if (!name.matches("[a-zA-Z ]+")) {

                throw new Exception("NameNotValidException");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    @Override

    public String toString () {

        return "{name=" + name + ",course=" + course + ",age=" + age + ",rollno=" + rollno + "}" ;
    }

    
}

public class ManagementSystem {

    public static void main(String[] args) {
        
        Student one = new Student("234", "model", 23, 1245);

        
        System.out.println(one);
    }
}