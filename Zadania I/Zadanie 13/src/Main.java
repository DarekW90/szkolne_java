import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;

        do {
            System.out.println("Kalkulator opłat bankowych:");
            System.out.print("Podaj saldo konta bankowego: ");
            double accountBalance = scan.nextDouble();
            double fee = 0.1 * accountBalance;
            System.out.println("Opłata za prowadzenie konta wynosi: " + fee);

            System.out.println();
            System.out.print("Czy wykonać program jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);

        } while (repeatProgram == 'T' || repeatProgram == 't');

        System.out.println("Koniec programu.");
        scan.close();
    }
}
