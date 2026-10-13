package Task4;
import  java.util.Scanner;

public class Task4 {

    
       static String inputWord;
    public static void main(String[] args) {

        // taking an input word
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\tPLease enter a word.  ");
        inputWord = scan.nextLine();

        
        // creating a StringBuilder object from the input word
        StringBuilder str = new StringBuilder(inputWord);
 
        // reversing the StringBuilder object in-place
        str.reverse();
        

    // print the input word and its reverse
        System.out.println("\n\tInput word:  " + inputWord);
        System.out.println("\tReversed word: " + str);
       
        // converting str back to a String
        String reversed = str.toString();

        // identifying if the input word is a palindrome or not
        if (inputWord.equals(reversed)) 
            System.out.println("\n\tOutput: It is a palindrome!\n");
         else 
            System.out.println("\n\tOutput: It is not a palindrome.\n");
    scan.close();
    }
}

