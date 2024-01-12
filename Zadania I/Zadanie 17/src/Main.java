import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;

        do {
            System.out.println("Zadanie 17. Kalkulator BMI:");
            System.out.print("Podaj mase: ");
            double mass = scan.nextDouble();

            System.out.print("Podaj wzrost: ");
            double height = scan.nextDouble();

            double bmi = (mass / (height*height));
            System.out.println("BMI wynosi: " +bmi);

            if (bmi < 18.5) {
                System.out.print("Niedowaga");
            }
            else if (bmi >= 18.5 && bmi < 24.9) {
                System.out.print("Waga prawidłowa");
            }
            else if (bmi >= 25 && bmi < 29.9) {
                System.out.print("Otyłość");
            }
            else {
                System.out.println("Nadwaga");
            }

            System.out.println();
            System.out.print("Czy wykonać program jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);

        } while (repeatProgram == 'T' || repeatProgram == 't');

        System.out.println("Koniec programu.");
        scan.close();
    }
}
