import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class ModernCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year (e.g. 2025): ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstOfMonth = yearMonth.atDay(1);
        int daysInMonth = yearMonth.lengthOfMonth();

        // Print the month and year header
        System.out.println("\n     " + firstOfMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Calculate the position of the first day of the month
        int valueOfFirstDay = firstOfMonth.getDayOfWeek().getValue(); 
        // Adjusting because Java's DayOfWeek is Monday=1 ... Sunday=7, but calendar starts Sunday=0
        int dayIndex = valueOfFirstDay % 7;

        // Print initial spaces for the first week
        for (int i = 0; i < dayIndex; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);

            if ((day + dayIndex) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        scanner.close();
    }
}
