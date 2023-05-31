package DATE_and_TIME;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate obj =  LocalDate.now();
        System.out.println("Current Date is : "+obj);

        LocalTime obj1 = LocalTime.now();
        System.out.println("Current Time is : "+obj1);

        LocalDateTime obj2 = LocalDateTime.now();
        System.out.println("Mixed of date and Time : "+obj2);

    }
}
