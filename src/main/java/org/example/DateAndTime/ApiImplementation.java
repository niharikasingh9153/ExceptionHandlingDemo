package org.example.DateAndTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class ApiImplementation {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Todays Date "+date);
//        Calendar cal = Calendar.getInstance();
//        cal.set(2025, Calendar.AUGUST,14);
//        System.out.println(cal.getTime());

        LocalDate cal = LocalDate.of(2025, 7, 14);
        System.out.println("Specific date "+cal);

        LocalDate date1 = LocalDate.now();
        LocalDate newDate = date1.plusDays(5);
        System.out.println("Add Date : "+newDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String dateStr = LocalDate.now().format(formatter);
        System.out.println(dateStr);
//        LocalDate date2 =LocalDate.parse("08/08/2025",formatter);
//        System.out.println(date2);
    }
}
