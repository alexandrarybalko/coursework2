import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Введите коффициенты a, b, с квадратного уравнения");
        Scanner in = new Scanner(System.in);
        double a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        double d = b * b - 4 * a * c, x1, x2;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Корень - любое число");
                } else {
                    System.out.println("Корней нет");
                }
            } else {
                x1 = -c / b;
                System.out.println("Один корень - " + x1);
            }
        } else {
            if (d < 0) {
                System.out.println("Вещественных корней нет");
            } else {
                x1 = (b - Math.sqrt(d)) / (2 * a);
                if (d == 0) {
                    System.out.println("Кратный корень - " + x1);
                } else {
                    x2 = (b + Math.sqrt(d)) / (2 * a);
                    System.out.println("Два корня - " + x1 + " и " + x2);
                }
            }
        }
    }
}
