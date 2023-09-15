public class Perimeter {
    double PI;
    public Perimeter() {
        this.PI = 3.14159265359;
    }

    public double getTriangle (double a, double b,double c) {
        return a + b + c;
    }

    public double getSquare (double a, double b) {
        return  2 * (a+b);
    }

    public double getCircle (double radius) {
        return 2 * radius * PI;
    }
}
