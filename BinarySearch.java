//import java.util.Arrays;
//import java.util.Collections;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
int[] random = { 6, -4, 12, 0, -10 };
int x = 12;
int y = Arrays.binarySearch(random, x);
System.out.println(y);

List<Integer> list = Arrays.asList(10, 4, -1, 5); //Creates a fixed-size list containing the elements [10, 4, -1, 5]
Collections.sort(list); // 1. Sorts the list in ascending natural order. The list elements become [-1, 4, 5, 10].
 Integer array[] = list.toArray(new Integer[4]); //Converts the sorted list back into a standard Integer array.
 System.out.println(array[0]); // Prints the first element (index 0) of the sorted array, which is -1.
   

 List<String> hex = Arrays.asList("30", "8", "3A", "FF");
Collections.sort(hex); // Strings are sorted lexicographically (alphabetically/by character codes), and numbers sort before letters.
//["30", "3A", "8", "FF"] after calling Collections.sort(hex)
int a = Collections.binarySearch(hex, "8"); //hex[2]
int b = Collections.binarySearch(hex, "3A"); //hex[1]
int z = Collections.binarySearch(hex, "4F"); //"4F" is not in the list. In a sorted order, it would be inserted at index 2 (between "3A" and "8").
// When binarySearch does not find an element, it returns -(insertion point) - 1.
// Calculation: -(2) - 1 = -3. Therefore, z = -3 //just add points after the negative sign eg. -3
System.out.println(a + " " + b + " " + z);


 List<Integer> ages = new ArrayList<>();
 ages.add(Integer.parseInt("5"));
 ages.add(Integer.valueOf("6"));
 ages.add(7);
 ages.add(4);
 for (int age : ages) System.out.print(age);
 System.out.println();


List<String> one = new ArrayList<String>();
one.add("abc");
List<String> two = new ArrayList<>();
two.add("abc");
if (one == two)
System.out.println("A");
else if (one.equals(two))
System.out.println("B");
else
System.out.println("C");

LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
date.plusDays(2);
//date.plusHours(3); // throws exception: LocalDate deals only with dates , not hours, hours for LocalTime
System.out.println(date.getYear() + " " + date.getMonth() + " "
+ date.getDayOfMonth());
System.out.println(date);

    }
}
