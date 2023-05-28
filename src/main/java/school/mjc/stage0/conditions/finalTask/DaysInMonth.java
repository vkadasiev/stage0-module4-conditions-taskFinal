package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month < 1 || month > 12 || year < 0) {
            System.out.println("invalid date");
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(31);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(30);
        } else if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(29);
        } else if (month == 2) {
            System.out.println(28);
        } else {
            System.out.println("invalid date");
        }
    }

    public static void main(String[] args) {
        DaysInMonth printer = new DaysInMonth();
        printer.printDays(2004, 2);
    }
}


// Create a program that will consume a year and a month (validation is required)
// and will print amount of days in this month considering also if a year is leap or not.
// (prints amount of days or else "invalid date", negative years are not accepted)

