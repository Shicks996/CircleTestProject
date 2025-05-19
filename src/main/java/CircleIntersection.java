import java.util.Scanner;

public class CircleIntersection {

    public static int getCommonPointsCount(int x1, int r1, int x2, int r2) {
        int distance = Math.abs(x1 - x2);
        int rSum = r1 + r2;
        int rDiff = Math.abs(r1 - r2);

        if (x1 == x2 && r1 == r2) {
            return -1; // бесконечно много точек
        } else if (distance > rSum) {
            return 0; // не пересекаются, далеко
        } else if (distance < rDiff) {
            return 0; // одна окружность внутри другой
        } else if (distance == rSum || distance == rDiff) {
            return 1; // касаются в одной точке
        } else {
            return 2; // пересекаются в двух точках
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x1, r1, x2, r2 через пробел: ");
        int x1 = scanner.nextInt();
        int r1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int r2 = scanner.nextInt();

        int result = getCommonPointsCount(x1, r1, x2, r2);
        if (result == -1) {
            System.out.println("Окружности совпадают — бесконечно много общих точек.");
        } else {
            System.out.println("Количество общих точек: " + result);
        }
    }
}