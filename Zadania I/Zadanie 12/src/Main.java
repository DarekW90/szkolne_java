import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;
        do {
            System.out.print("Podaj liczbę do sprawdzenia:");
            int number = scan.nextInt();

            switch (number) {
                case 1, 4, 8:
                    System.out.println("zmienna ma wartość 1, 4, 8");
                    break;
                case 2, 3, 7:
                    System.out.println("zmienna ma wartość 2, 3, 7");
                    break;
                default:
                    System.out.println("Wszystkie inne przypadki");
                    break;
            }
            System.out.println();
            System.out.print("Czy wykonać program jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);

        }
        while (repeatProgram == 'T' || repeatProgram == 't') ;

        System.out.println("Koniec programu.");
        scan.close();
    }
}

