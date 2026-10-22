public class Task8 {
   int y;
   int m =1;
   int z = 1;
     int commulative( int a, int b, int c) {
        switch (commulative(1, 2, 3)) {
            case 1: y = a;
            break;
            case 2: y = b;
            break;
            case 3: y = c;
            break;
        }
        z++;
        for(int x=0; y > x; x++) {
           m= x+m;
        }
         return m;
    }
    public static void main(String[] args) {
        Task8 task8 = new Task8();
       task8.commulative(5, 6, 7);
        
    }
}
