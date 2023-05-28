package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if ((firstSide + secondSide + thirdSide) == 180 && ((firstSide + secondSide) > thirdSide) && ((secondSide + thirdSide) > firstSide) && ((thirdSide + firstSide) > secondSide))  {
            System.out.println("this is a valid triangle");
        } else {
                System.out.println("it's not a triangle");
            }
        }
    public static void main(String[] Args) {
        TriangleSidesValidator validator = new TriangleSidesValidator();
        validator.validate(100.0, 15.0, 65.0);

    }
}


