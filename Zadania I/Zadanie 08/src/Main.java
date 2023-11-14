import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;
        char selectOption;
        do {
            System.out.println("Wybierz opcje:");
            System.out.println("1: Instrukcja warunkowa pierwsza (Czy liczba jest dodatnia i nieparzysta?)");
            System.out.println("2: Instrukcja warunkowa druga (Czy osoba może prowadzić samochód?)");
            System.out.println("3: Instrukcja warunkowa trzecia (Czy rok jest przestępny?)");
            System.out.println("4: Instrukcja warunkowa czwarta (Czy podana liczba mieści się w przedziale 10-20?)");
            System.out.println("5: Instrukcja warunkowa piąta (Czy podana wartość jest znakiem?)");
            System.out.print("Wybierz opcje 1-5: ");
            selectOption = scan.next().charAt(0);


            if (selectOption == '1') {
                System.out.print("Podaj liczbę całkowitą: ");
                int x = scan.nextInt();

                if (x > 0 && x % 2 != 0) {
                    System.out.println("Liczba jest dodatnia i nieparzysta");
                } else {
                    System.out.println("Liczba nie spełnia warunków");
                }

            }
            if (selectOption == '2') {
                System.out.print("Podaj wiek: ");
                int dob = scan.nextInt();

                System.out.print("Czy osoba ma prawo jazdy? T/N");
                String licence = scan.next();

                boolean gotLicence = licence.equalsIgnoreCase("t");

                if (gotLicence && dob > 18) {
                    System.out.println("Osoba może prowadzić samochód, ma prawo jazdy i jest pełnoletnia.");
                } else {
                    System.out.println("Osoba nie może prwadzić samochodu, nie ma prawa jazdy lub nie jest pełnoletnia");
                }

            }
            if (selectOption == '3') {

                System.out.print("Podaj dowolny rok: ");
                int year = scan.nextInt();

                LocalDate today = LocalDate.now();
                LocalDate yearDiff = LocalDate.of(year, 1, 1);

                Period diff = Period.between(yearDiff, today);

                int personYears = diff.getYears();

                System.out.println("Ilość lat " + personYears);

                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println("Osoba urodziła się w roku przestępnym, a jej wiek to: " + personYears);
                } else {
                    System.out.println("Osoba urodziła się w roku nie przestępnym, a jej wiek to: " + personYears);
                }
            }
            if (selectOption == '4') {

                System.out.print("Podaj liczbę: ");
                int number = scan.nextInt();

                if (number >= 10 && number <= 20) {
                    System.out.println("Liczba mieści się w przedziale 10-20");
                } else {
                    System.out.println("Liczba nie spełnia warunków");
                }
            }
            if (selectOption == '5') {

                //char znak = 1;
                System.out.print("Podaj znak: ");
                String input = scan.next();

                char letter = input.charAt(0);

                if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') && !(letter >= '0' && letter <= '9')) {
                    System.out.println("Podany znak jest literą i nie jest cyfrą.");
                } else {
                    System.out.println("Podany znak nie spełnia warunków.");
                }
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

