public class Solver {
    public double a;
    public double b;
    public double c;
    public double x1;
    public double x2;
    public int count;

    public Solver(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        double d = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    this.count = 3;
                } else {
                    this.count = 0;
                }
            } else {
                this.x1 = -c / b;
                this.count = 1;
            }
        } else {
            if (d < 0) {
                this.count = 0;
            } else {
                this.x1 = (-b - Math.sqrt(d)) / (2 * a);
                this.x2 = (-b + Math.sqrt(d)) / (2 * a);
                this.count = 2;
            }
        }

    }


}
