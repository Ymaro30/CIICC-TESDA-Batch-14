public class Task3 {
    
    public static void main(String[] args) {
      
     String a = new String("Wow");
     String d = "Wow!";
     String c = a;
     String b = c;

     boolean b1 = a == b; // if strings point to the exact same memory reference, use ==
     boolean b2 = d.equals(b + "!"); //if two String variables contain the exact same characters, use .equals()
     boolean b3 = c.equals(a);

     if (b1 && b2 && b3) { //all variables must be true, since && logical operator is used
        System.out.println("Success"); //Print "Success"
    }
}
}
