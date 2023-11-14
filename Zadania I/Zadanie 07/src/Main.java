import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;
        char selectOption;
        do {
            System.out.println("Wybierz opcje:");
            System.out.println("1: Operator pierwszy (liczba dodatnia czy ujemna)") ;
            System.out.println("2: Operator drugi (czy liczba a = b)");
            System.out.println("3: Operator trzeci (operator logiczny)");
            System.out.print("Wybierz opcje 1-3: ");
            selectOption = scan.next().charAt(0);


            if (selectOption == '1') {
                System.out.print("Podaj liczbę całkowitą: ");
                int x = scan.nextInt();

                String liczba = (x > 0) ? x + " jest liczbą dodatnia" : x + " jest liczbą ujemna";
                System.out.println(liczba);

            } if (selectOption == '2') {
                System.out.print("Podaj liczbę całkowitą A: ");
                int a = scan.nextInt();

                System.out.print("Podaj liczbę całkowitą B: ");
                int b = scan.nextInt();

                boolean isEqual = (a == b);
                System.out.println("Czy A jest równe B? : " + isEqual);

            } if (selectOption == '3') {
                System.out.print("Podaj liczbę całkowitą X: ");
                int x = scan.nextInt();

                System.out.print("Podaj liczbę całkowitą Y: ");
                int y = scan.nextInt();

                boolean warunek1 = (x > 0) && (y > 0);
                boolean warunek2 = (x > 0) || (y > 0);
                boolean warunek3 = !(x == y);

                System.out.println("Czy obie liczby podane są dodatnie? : " + warunek1);
                System.out.println("Czy przynajmniej jedna liczba jest dodatnia? : " + warunek2);
                System.out.println("Czy x nie jest równe y? : " + warunek3);

            }
            System.out.println();
            System.out.print("Czy wykonać program jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);

        } while (repeatProgram == 'T' || repeatProgram == 't');

        System.out.println("Koniec programu.");
        scan.close();
    }
}