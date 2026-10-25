package Task;

import java.util.Scanner;;

public class Task8 {
   int y=0, m=0, h, x;
   int[] var;
   //int[] loop2= new int[num.length];
   //int[] loop2 = new int[loop.length];
   

    int[] commulative(int... var) {
        this.var=var;
      
        runner();
        return null;
    }
    void runner(){
        for(h=0;h < var.length; h++ ) {
        setter();
        }
    }

    void setter(){
        int[] loop = new int[var.length];
        //this.loop=loop;
            for( x =1; x <= var[h]; x++) {
                 loop[h]=(y = y+ x);
             }
             System.out.println("The commulative sum of the parameter at index " + h + " is " + loop[h]);
            var[h] = loop[h];
             //loop2[h] = loop[h]; 
             //System.out.println(loop2[h]);
             y=0;
    }

    void sum() {
        for(int sum=0; sum < var.length; sum++) {
            m = m+var[sum];
        }
        System.out.println("The sum of all parameters is " + m + "\n");
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many sets of number do you want to enter? : ");
        int input = scan.nextInt();
        System.out.println();
        int[] num = new int[input];

        for(int i=0; i< num.length; i++) {
            System.out.print("Please enter the value for the element " +  (i+1) +": ");
            num[i]=scan.nextInt();
        }
        System.out.println();

        Task8 task8 = new Task8();
        task8.commulative(num);
        task8.sum();
       scan.close();
    }
}