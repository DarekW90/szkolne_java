import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;
        char selectOption;
        do {
            System.out.print("Podaj liczbę do sprawdzenia:");
            int number = scan.nextInt();

            boolean isModuloZero = ( number % 2 == 0);
            System.out.println(isModuloZero);

            System.out.println();
            System.out.print("Czy wykonać program jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);

        }
        while (repeatProgram == 'T' || repeatProgram == 't') ;

        System.out.println("Koniec programu.");
        scan.close();

    }
}

