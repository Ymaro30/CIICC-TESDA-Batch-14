
package Task4;
import  java.util.Scanner;

public class Task4 {

    
       static String inputWord;
    public static void main(String[] args) {

        // taking an input word
        Scanner scan = new Scanner(System.in);
        System.out.print("\t\nPLease enter a word.\t");
        inputWord = scan.nextLine();

        
        // creating a StringBuilder object from the input word
        StringBuilder str = new StringBuilder(inputWord);
 
        // reversing the StringBuilder object in-place
        str.reverse();
        

    // print the input wor and its reverse
        System.out.println("\n\tFirst word: " + inputWord);
        System.out.println("\tReversed word: " + str);
       
        // converting str back to a String
        String reversed = str.toString();

        // identifying if the input word is a palindrome or not
        if (inputWord.equals(reversed)) 
            System.out.println("\n\tThe input word is a palindrome!");
         else 
            System.out.println("\tThe input word is not a palindrome.");
    scan.close();
    }
}
