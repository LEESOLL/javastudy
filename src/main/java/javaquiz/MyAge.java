package javaquiz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MyAge {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate birthDay = LocalDate.of(1997, 7, 5);
        long myAge = ChronoUnit.DAYS.between(birthDay, today);

        System.out.println(myAge);
    }
}
