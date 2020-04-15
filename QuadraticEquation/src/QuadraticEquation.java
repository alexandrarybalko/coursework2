import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Введите коффициенты a, b, с квадратного уравнения");
        Scanner in = new Scanner(System.in);
        double a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        Solver equation = new Solver(a, b, c);
        switch (equation.count) {
            case 0:
                System.out.println("Корней нет");
                break;
            case 1:
                System.out.println("Один корень - " + equation.x1);
                break;
            case 2:
                System.out.println("Два корня - " + equation.x1 + " " + equation.x2);
                break;
            default:
                System.out.println("Корень - любое вещественное число");
                break;
        }
    }
}
