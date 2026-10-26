package Task;

public class Task11 {

    public static void main(String[] args) {
        Book[] details = new Book[]{
        new Book("Probensyano", "Coco Martin", 2020, 1000 ),
        new Book("Lastic Man", "Vic Sotto", 2015, 800),
        new Book("Panday", "Fernando Poe Jr.", 2005, 500) 
        };
        System.out.println();
     for(Book x: details) { //calling in a loop of the output of Book
        System.out.println(x + "\n"); // printing the output in loop
     }
    }
}

 class Book{
    String title; //upon compile time, variables and constructor have been initialized
    String author; //due to the new Book[] statement in the main method
    int yearPublished;
    double price;

    Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Title \t\t: " + title + "\nAuthor \t\t: " + author +
        "\nYear Published \t: " + yearPublished + "\nPrice \t\t: " + price;
    } //prints the entire string as an output
}
