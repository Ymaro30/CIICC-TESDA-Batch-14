public class ConcatPrimitives {
     public static void main(String[] args) { //H3110 world 2.0 true
    byte zero = 3;
    short s = 1;
    int i = 10;
    float f = 2.0f;
    char c = 'H';
    boolean b = true;
    String output = ("\t" + c + zero + s + i + " " + "world " + f + " " + b);
    System.out.println(output);
    }
}
