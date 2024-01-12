import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;

        do {
            System.out.println("Napisz program, który wyświetli na ekranie liczby z zakresu 1 – 100 podzielne przez 4, ale\n" +
                    "niepodzielne przez 8 i przez 10. Wykorzystaj instrukcję continue.\n");

            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0 || i % 8 == 0 || i % 10 == 0){
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
