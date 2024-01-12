import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;
        int tablica[] = {1, 2, 3, 4, 5, 6};

        do {
            System.out.println("Zadanie 23. Proszę wypisać w pętli taką tablicę:\n");

            for (int j : tablica) {
                System.out.println(j);
            }

            System.out.println();
            System.out.print("Czy wykonać program jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);

        } while (repeatProgram == 'T' || repeatProgram == 't');

        System.out.println("Koniec programu.");
        scan.close();
    }
}
