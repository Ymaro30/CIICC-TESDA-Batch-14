package Task;

public class Student {
    
    private String firstName;
    private String lastName;
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
   
    void printFullName(){
        System.out.println(firstName.concat(" " + lastName));
    }   // (firstName + " " + lastName) also work here
        // (this.firstName + " " + this.lastName) also work here, to avoid confusion
        //this. always point to the class variable

    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
        };
        for (Student s : students) {
            s.printFullName();
        }
    }
}


