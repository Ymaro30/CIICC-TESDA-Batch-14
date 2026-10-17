
import java.util.Scanner; 
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] num = new int[3]; //creating an object of integer tpye array of variable num
        String[] str = {"first", "second", "third"} ; //creating a holder of string array of variable str
        
        Scanner scan = new Scanner(System.in); // declaring a scanner object scan 
        System.out.println("\n\tPlease inter three numbers.");
        for (int i=1;i <= num.length;i++) {     //to create a loop of inputs from the user
            System.out.print("\n\tWhat`s your " + str[i-1] + " number?\t: ");
            num[i-1]=scan.nextInt(); //inputs are being saved to int arrays of variable num
        }

        Arrays.sort(num); //sorting the inputs 
        System.out.println("\n\t" + "The largest number is " + num[num.length - 1]+ ".");

       // System.out.println("\n\tSorted input: " + Arrays.toString(num)); //in order to print the object input as string, it needs to convert to string
            if (num[num.length -1] == num[0] ){ //to identify whether the first element and last element is having a same value
                System.out.println("\tAll numbers are equal.\n");
            } else{
                System.out.println("\tYour inputs are not equal.\n"); 
            }
            scan.close();//close method is always invoked appending after the scanner variable once the scanner method is called
    }
}
