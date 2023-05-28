package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        double dividerToDouble = divider;
        double dividendToDouble = dividend;
        double division = (dividendToDouble / dividerToDouble);
        int multiple = (int) division * divider;
        if ((multiple == dividend) && divider != 0) {
            System.out.println("can be divided completely");
        } else if (dividerToDouble == 0.0) {
            System.out.println("division by zero");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
        public static void main(String[] Args) {
            IntegerDivider dividerPrinter = new IntegerDivider();
            dividerPrinter.printCompletelyDivided(4,3);
        }

    }





// Create a program that will consume 2 integers from method args (dividend and divider)
// and will perform integer division of dividend be divider,
// save the value,
// and then will multiply result by divider
// and will if:
//      - got value is equal to dividend will print:"can be divided completely",
//      - otherwise "cannot be divided completely" or "division by zero".

