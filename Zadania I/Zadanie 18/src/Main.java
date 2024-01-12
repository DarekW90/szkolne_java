import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;

        do {
            System.out.println("Zadanie 18. Kalkulator podatku dochodowego:");
            System.out.print("Podaj swój roczny dochód: ");
            double income = scan.nextDouble();

            if (income <= 12000 && income > 0) {
                System.out.print("Twój podatek dochdowy wynosi: "+ (0.18 * income));
            }
            else {
                System.out.println("Twój podatek dochdowy wynosi: " + (0.32 * income));
            }

            System.out.println();
            System.out.print("Czy wykonać program jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);

        } while (repeatProgram == 'T' || repeatProgram == 't');

        System.out.println("Koniec programu.");
        scan.close();
    }
}
