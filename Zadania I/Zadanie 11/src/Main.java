import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;
        do {
            System.out.println("Podaj liczbę ujemną:");
            int number = scan.nextInt();

            number = (number < 0) ? Math.abs(number) : number;

            System.out.println("Liczba po zamianie znaków: " + number);

            System.out.println();
            System.out.print("Czy wykonać program jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);
        }
        while (repeatProgram == 'T' || repeatProgram == 't') ;

        System.out.println("Koniec programu.");
        scan.close();

    }
}

