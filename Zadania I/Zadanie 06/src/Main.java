import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;
        char selectOption;
        do {
            System.out.println("Wybierz opcje:");
            System.out.println("1: Switch na podstawie dnia tygodnia");
            System.out.println("2: Switch na podstawie miesiąca");
            System.out.println("3: Switch na podstawie oceny (skala 1-6)");
            System.out.println("4: Switch na podstawie typu pojazdu");
            System.out.print("Wybierz opcje 1-4: ");
            selectOption = scan.next().charAt(0);


            if (selectOption == '1') {
                System.out.print("Podaj liczbę od 1 do 7: ");
                int dayData = scan.nextInt();

                switch (dayData) {
                    case 1:
                        System.out.println("Dzień tygodnia nr: " + dayData + " to Poniedziałek");
                        break;

                    case 2:
                        System.out.println("Dzień tygodnia nr: " + dayData + " to Wtorek");
                        break;

                    case 3:
                        System.out.println("Dzień tygodnia nr: " + dayData + " to Środa");
                        break;

                    case 4:
                        System.out.println("Dzień tygodnia nr: " + dayData + " to Czwartek");
                        break;

                    case 5:
                        System.out.println("Dzień tygodnia nr: " + dayData + " to Piątek");
                        break;

                    case 6:
                        System.out.println("Dzień tygodnia nr: " + dayData + " to Sobota");
                        break;

                    case 7:
                        System.out.println("Dzień tygodnia nr: " + dayData + " to Niedziela");
                        break;

                    default:
                        System.out.println("Nieprawidłowa wartość dnia tygodnia.");
                        break;

                }
            } else if (selectOption == '2') {
                System.out.print("Podaj liczbę od 1 do 12: ");
                int monthData = scan.nextInt();
                switch (monthData) {
                    case 1:
                        System.out.println("Miesiąc nr: " + monthData + " to Styczeń");
                        break;

                    case 2:
                        System.out.println("Miesiąc nr: " + monthData + " to Luty");
                        break;

                    case 3:
                        System.out.println("Miesiąc nr: " + monthData + " to Marzec");
                        break;

                    case 4:
                        System.out.println("Miesiąc nr: " + monthData + " to Kwiecień");
                        break;

                    case 5:
                        System.out.println("Miesiąc nr: " + monthData + " to Maj");
                        break;

                    case 6:
                        System.out.println("Miesiąc nr: " + monthData + " to Czerwiec");
                        break;

                    case 7:
                        System.out.println("Miesiąc nr: " + monthData + " to Lipiec");
                        break;

                    case 8:
                        System.out.println("Miesiąc nr: " + monthData + " to Sierpień");
                        break;

                    case 9:
                        System.out.println("Miesiąc nr: " + monthData + " to Wrzesień");
                        break;

                    case 10:
                        System.out.println("Miesiąc nr: " + monthData + " to Październik");
                        break;

                    case 11:
                        System.out.println("Miesiąc nr: " + monthData + " to Listopad");
                        break;

                    case 12:
                        System.out.println("Miesiąc nr: " + monthData + " to Grudzień");
                        break;

                    default:
                        System.out.println("Nieprawidły numer miesiąca.");
                        break;
                }
            } else if (selectOption == '3') {
                System.out.print("Podaj ocenę od 1 do 6: ");
                int mark = scan.nextInt();
                switch (mark) {
                    case 1:
                        System.out.println("Ocena: " + mark + " to niedostateczna");
                        break;

                    case 2:
                        System.out.println("Ocena: " + mark + " to dopuszczająca");
                        break;

                    case 3:
                        System.out.println("Ocena: " + mark + " to dostateczna");
                        break;

                    case 4:
                        System.out.println("Ocena: " + mark + " to dobra");
                        break;

                    case 5:
                        System.out.println("Ocena: " + mark + " to bardzo dobra");
                        break;

                    case 6:
                        System.out.println("Ocena: " + mark + " to wzorowa");
                        break;

                    default:
                        System.out.println("Nieprawidłowa ocena.");
                        break;
                }

            } else if (selectOption == '4') {
                System.out.println("Wybierz i wpisz jeden z poniższych pojazdów");
                System.out.println("- Car");
                System.out.println("- Truck");
                System.out.println("- Motorcycle");
                System.out.println("- Boat");
                System.out.println("- Plane");
                System.out.println("- Bike");

                System.out.print("Podaj nazwę pojazdu: ");
                String vehicle = scan.next();

                switch (vehicle.toLowerCase()) {
                    case "car":
                        System.out.println(vehicle + " to samochód osobowy");
                        break;

                    case "truck":
                        System.out.println(vehicle + " to samochód ciężarowy");
                        break;

                    case "motorcycle":
                        System.out.println(vehicle + " motocykl");
                        break;

                    case "boat":
                        System.out.println(vehicle + " łódź");
                        break;

                    case "plane":
                        System.out.println(vehicle + " to samolot");
                        break;

                    case "bike":
                        System.out.println(vehicle + " to rower");
                        break;

                    default:
                        System.out.println("Nieprawidłowa nazwa pojazdu.");
                        break;
                }

            }
            System.out.println();
            System.out.print("Czy wykonać program jeszcze raz? T/N: ");
            repeatProgram = scan.next().charAt(0);

        } while (repeatProgram == 'T' || repeatProgram == 't');

        System.out.println("Koniec programu.");
        scan.close();
    }
}

