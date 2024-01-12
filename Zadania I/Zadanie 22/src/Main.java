import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram = 'T';

        do {
            System.out.println("Zadanie 22. Napisz program który przyjmie dwie wartości od użytkownika oraz informację o działaniu\n" +
                    "arytmetycznym, które ma wykonać program (np.. +, -, *, /).");
            // Pobieranie dwóch wartości od użytkownika

            System.out.print("Podaj pierwszą liczbę: ");
            double liczba1 = scan.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double liczba2 = scan.nextDouble();

            // Pobieranie operatora od użytkownika
            System.out.print("Wybierz operator (+, -, *, /): ");
            char operator = scan.next().charAt(0);

            // Wykonanie operacji arytmetycznej
            double wynik = 0.0;

            switch (operator) {
                case '+':
                    wynik = liczba1 + liczba2;
                    break;
                case '-':
                    wynik = liczba1 - liczba2;
                    break;
                case '*':
                    wynik = liczba1 * liczba2;
                    break;
                case '/':
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                    } else {
                        System.out.println("Nie można dzielić przez zero!");
                        continue; // Powrót do początku pętli
                    }
                    break;
                default:
                    System.out.println("Nieznany operator!");
                    continue; // Powrót do początku pętli
            }


            // Wyświetlenie wyniku operacji
            System.out.println("Wynik: " + wynik);

            System.out.println();
            System.out.print("Czy wykonać program jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);

        } while (repeatProgram == 'T' || repeatProgram == 't');

        System.out.println("Koniec programu.");
        scan.close();
    }
}
