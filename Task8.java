package Task;

import java.util.Scanner;;

public class Task8 {
   int y=0, m=0, h, x;
   int[] var;

    int[] cumulative(int... var) {
        this.var=var; //placing the content of cumulative array to var[] class variable
        runner();
        return null;
    }
    void runner(){ //method that calls a method. only to shorten the program
        for(h=0;h < var.length; h++ ) {
        setter();
        }
    }

    void setter(){
        int[] loop = new int[var.length];
            for( x =1; x <= var[h]; x++) {
                 loop[h]=(y = y+ x); //performing addition and saving it into array
             }
             System.out.println("The commulative sum of the parameter at index " + h + " is " + loop[h]);
            var[h] = loop[h]; //replacing the value of var[] by the value of loop[]
             y=0;
    }

    void sum() {
        for(int sum=0; sum < var.length; sum++) {
            m = m+var[sum]; //perform the addition
        }
        System.out.println("The sum of all parameters is " + m + "\n"); //prints the sum
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); //used for user`s input
        System.out.print("\nHow many sets of number do you want to enter? : ");
        int input = scan.nextInt(); //recieving the input
        System.out.println(); //just space

        int[] num = new int[input]; //container of inputs in array
        for(int i=0; i< num.length; i++) { //loop upon input
            System.out.print("Please enter the value for the element " +  (i+1) +": ");
            num[i]=scan.nextInt(); //saving input to an array
        }
        System.out.println();//creating space on terminal

        Task8 task8 = new Task8(); //new object to be used for calling a non static to static method
        task8.cumulative(num);  //calling tis method for execution
        task8.sum();  //calling tis method for execution
       scan.close();
    }
}