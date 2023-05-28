package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("first");
        } else if (x < 0 && y > 0) {
            System.out.println("second");
        } else if (x < 0 && y < 0) {
            System.out.println("third");
        } else if (x > 0 && y < 0) {
            System.out.println("fourth");
        } else
            System.out.println("zero");

    }
    public static void main(String[] Args) {
        CoordinatePane quadrantDeterminer = new CoordinatePane();
        quadrantDeterminer.printQuadrant(1,1);

    }
}


// Если значение x и y положительные, то точка находится в первом квадранте.
// Если значение x отрицательное, а значение y положительное, то точка находится во втором квадранте.
// Если значение x и y отрицательные, то точка находится в третьем квадранте.
// Если значение x положительное, а значение y отрицательное, то точка находится в четвертом квадранте.
// Если значение x и y равны нулю, то точка находится в начале координат и считается "нулевой" точкой.