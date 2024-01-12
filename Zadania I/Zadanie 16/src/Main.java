import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;

        do {
            System.out.println("Zadanie 16. Wybierz sezon.");
            System.out.print("Podaj numer miesiąca\n1:Styczen ... 12:Grudzień: ");
            int season = scan.nextInt();

            switch (season) {
                case 1,2,12:
                    System.out.println("Zima");
                    break;
                case 3,4,5:
                    System.out.println("Wiosna");
                    break;
                case 6,7,8:
                    System.out.println("Lato");
                    break;
                case 9,10,11:
                    System.out.println("Jesień");
                    break;


                default:
                    System.out.println("Błędna wartość, podaj cyfrę od 1 do 12");
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
