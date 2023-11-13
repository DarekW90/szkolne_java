import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;

        do {
            System.out.print("Podaj liczbę do sprawdzenia: ");
            int data = scan.nextInt();
            System.out.println(data % 2 == 0 ? "Liczba: " + data + " jest parzysta." : "Liczba: " + data + " jest nieparzysta.");

            System.out.print("Czy wykonać obliczenia jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);

        } while (repeatProgram == 'T' || repeatProgram == 't');

        System.out.println("Koniec programu.");
        scan.close();
    }
}