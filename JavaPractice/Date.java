import java.time.*;

public class Date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime current_time = LocalTime.now();
        System.out.println("Today is: " + today);
        System.out.println("Current time is: " + current_time);
    }
}
