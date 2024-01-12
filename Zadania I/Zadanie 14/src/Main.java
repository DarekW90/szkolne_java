import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;

        do {
            System.out.println("Zadanie 14. Wybierz miesiąc.");
            System.out.print("Wybierz miesiąc: ");
            int number = scan.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Styczeń");
                    break;
                case 2:
                    System.out.println("Luty");
                    break;
                case 3:
                    System.out.println("Marzec");
                    break;
                case 4:
                    System.out.println("Kwiecień");
                    break;
                case 5:
                    System.out.println("Maj");
                    break;
                case 6:
                    System.out.println("Czerwiec");
                    break;
                case 7:
                    System.out.println("Lipiec");
                    break;
                case 8:
                    System.out.println("Sierpień");
                    break;
                case 9:
                    System.out.println("Wrzesień");
                    break;
                case 10:
                    System.out.println("Październik");
                    break;
                case 11:
                    System.out.println("Listopad");
                    break;
                case 12:
                    System.out.println("Grudzień");
                    break;

                default:
                    System.out.println("Błędny miesiąc, proszę podać w zakresie od 1 do 12");
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
