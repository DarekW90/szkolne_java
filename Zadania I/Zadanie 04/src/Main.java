public class Main {
    public static void main(String[] args) {

        int a = -1, b = 3, c = 16;

        //float delta = (float)Math.pow(b,2) - 4*a*c;
        // biblioteka Math rząda typu Double
        double delta = Math.pow(b,2) - 4*a*c;

        System.out.println(delta);

        if (delta < 0) {
            System.out.println("Brak pierwiastków");

        } else if (delta == 0) {
            double x0 = -b / (2*a);
            System.out.println("Jedno miejsce zerowe, x0 wynosi " + x0);

        } else if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta))/(2*a);
            double x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("Dwa miejsca zerowe: \n\tx1 wnosi: " + x1 + "\n\tx2 wynosi: " + x2);
        }
    }
}