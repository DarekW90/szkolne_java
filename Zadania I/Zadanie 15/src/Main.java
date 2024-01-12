import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;

        do {
            System.out.println("Zadanie 15. Wybierz kolor.");
            System.out.print("Podaj symbol koloru R/G/B: ");
            String colorCode = scan.next();

            switch (colorCode.toUpperCase()) {
                case "R":
                    System.out.println("Red - czerowny");
                    break;
                case "G":
                    System.out.println("Green - zielony");
                    break;
                case "B":
                    System.out.println("Blue - niebieski");
                    break;


                default:
                    System.out.println("Błędny symbol koloru, proszę podać R/G/B");
                    break;
            }
            System.out.println();
            System.out.print("Czy wykonać program jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);

        } while (repeatProgram == 'T' || repeatProgram == 't');

        System.out.println("Koniec programu.");
        scan.close();
    }
}
