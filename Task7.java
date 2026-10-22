import java.util.Scanner;
public class Task7 {

    double a, b, c, d;
    double add(double a, double b){
        this.a = a + b;
        return a;
    }
    double multiply(double a, double b){
        this.b = a * b;
        return b;
    }
    double subtruct(double a, double b){
        c = a - b;
        return c;
    }
    double devide(double a,double b){
        d = a / b;
        return d;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput two integers!\nYour first integer here: ");
        int x = scanner.nextInt();
        System.out.print("Your second integer here: ");
        int y = scanner.nextInt();
        Task7 task7 = new Task7();
        System.out.println("\nAddition: \t" + x + " + " + y + " = " + task7.add(x, y) + "\nMultiplication: " + x + " * " + y + " = " + task7.multiply(x, y) + 
        "\nSubtraction: \t" + x + " - " + y + " = " + task7.subtruct(x, y) + "\nDevision: \t"+ x + " / " + y +  " = " + task7.devide(x, y));
        scanner.close();

        
    }

}
