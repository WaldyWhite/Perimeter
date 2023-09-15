public class Main {
    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter();

        System.out.println(perimeter.getTriangle(5,6,7));
        System.out.println(perimeter.getSquare(5,6));
        System.out.printf("%.2f",perimeter.getCircle(15));
    }
}