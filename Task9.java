package Task;
import static java.lang.Math.*;

import java.util.Scanner;

public class Task9 {


    public static int add(int a, int b) {
        int z = a+b;
        return z;
    }

    public static int subtract(int a, int b) {
        int z = a-b;
        return z;
    }

    public static int multiply(int a, int b) {
        int z = a*b;
        return z;
    }

    public static float divide(int a, int b) {
         int z = a/b;
        return z;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nPlease inter two sets of numbers below.\nYour number 'a' here: ");
        int x = scan.nextInt();
        System.out.print("Your number 'b' here: ");
        int y = scan.nextInt();  
        System.out.println();

       System.out.println("number a + number b = " + add(x, y));// calling the method with two input parameters from the user
       System.out.println("number a - number b = " + subtract(x, y));
       System.out.println("number a * number b = " + multiply(x, y));
       System.out.println("number a / number b = " + divide(x, y) +"\n");

        int sum = addExact(x, y); //Math.addExact(x,y), the prefix Math. is not needed 
        int dif = subtractExact(x, y); //because the Math class has been imported
        int pro = multiplyExact(x, y); 
        int quo = floorDiv(x, y); 

        System.out.println("The sum of your inputs are " + sum);
        System.out.println("The differnce of your inputs are " + dif);
        System.out.println("The product of your inputs are " + pro);
        System.out.println("The quotient of your inputs are " + quo);
        System.out.println();

        scan.close();
    }
}

