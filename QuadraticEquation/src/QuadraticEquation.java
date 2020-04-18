import java.util.concurrent.*;
import java.util.Random;

public class QuadraticEquation {
    public static void main(String[] args) throws Exception {
        int i = 0;
        ExecutorService executor = Executors.newFixedThreadPool(100);
        for (; i < 100; ++i) {
            Solver equation = executor.submit(new MyCallable()).get();
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
        executor.shutdown();
    }

    static class MyCallable implements Callable<Solver> {
        @Override
        public Solver call() {
            Random random = new Random();
            Solver equation = new Solver(random.nextInt(), random.nextInt(), random.nextInt());
            return equation;
        }
    }
}
