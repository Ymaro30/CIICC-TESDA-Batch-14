package Task;


class Point {
    private double x;
    private double y;
   
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void scale(){
         // Multiplies x and y by the 5th root of 0.5 each iteration
        double holder= Math.pow(.5,.2); 
        x *= holder;
        y *= holder;
    }
   
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
   
    // Your code goes here
}

public class Tasks12 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}