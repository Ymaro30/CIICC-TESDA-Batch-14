package Discussion;

import java.time.*;
import java.util.Date;

public class DatesTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now() + "\n");

        LocalDate date1 = LocalDate.of(1990, Month.DECEMBER, 30);
        LocalDate date2 = LocalDate.of(2026, 10, 17);
        LocalTime time1 = LocalTime.of(6, 30);
        LocalTime time2 = LocalTime.of(6, 30, 40);
        LocalDateTime datetime1 = LocalDateTime.of(2026,Month.DECEMBER,30, 12,30,00);

        LocalDateTime ldt1 = LocalDateTime.of(2026,12, 30, 4, 9, 7 );
        LocalDateTime ldt2 = LocalDateTime.of(2026,12, 30, 4, 9, 7 );
        Date date = new Date(); //import java.util.Date is required
        System.out.println(date);


        System.out.println(date1.plusDays(1) + "the");
        System.out.println(date2 + "these");
        System.out.println(time1 + "those");
        System.out.println(time2 + "there");
        System.out.println(datetime1 + "there`s\n");

        
        System.out.println(ldt1 + "on");
        System.out.println(ldt1 + "off");
        System.out.println(date + " you");
        System.out.println(ldt1.equals(ldt2));
        System.out.println(ldt1 == ldt2);
        
        Period age = Period.between(date1, LocalDate.now());
        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
    
    }
}

