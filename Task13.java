package Task;
import java.util.Scanner;

class Vehicle {
    int yearMade;
    String make, model;

     Vehicle(String make, String model, int yearMade){
        this.make = make;
        this.model = model;
        this.yearMade = yearMade;
     }

     public void displayDetails(){
        System.out.println("\n--Car Details--");
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year Manufactured : " + yearMade);
     }
}

class Car extends Vehicle{
    int numberOfDoors;

    public Car(String make, String model, int yearMade, int numberOfDoors){
        super(make, model, yearMade);
       this.numberOfDoors = numberOfDoors;
    }   
    @Override 
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Numbers of doors : " + numberOfDoors);
    }
}

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease fill-up the followings:");
        System.out.print("\nEnter the Car`s Company: ");
        String company = scan.nextLine();
        System.out.print("Enter the Car`s Model: ");
        String model = scan.nextLine();
        System.out.print("Enter the Car`s Year Made: ");
        int yearMade = scan.nextInt();
        System.out.print("Enter the Car`s numbers of doors: ");
        int doors = scan.nextInt();

        Vehicle vehicle = new Car(company, model, yearMade, doors);
        vehicle.displayDetails();

        scan.close();
    }
}