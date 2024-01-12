import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;

        do {
            System.out.println("Zadanie 19. Napisz program, który wyświetli na ekranie nieparzyste liczby z zakresu 1 – 20");
            System.out.println("Wykorzystaj pętlę for i instrukcję continue.");

            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.print(i + ",");
            }

            System.out.println();
            System.out.print("Czy wykonać program jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);

        } while (repeatProgram == 'T' || repeatProgram == 't');

        System.out.println("Koniec programu.");
        scan.close();
    }
}
