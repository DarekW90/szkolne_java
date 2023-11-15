import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char repeatProgram;
        do {
            System.out.println("Podaj liczbę (0 - 9):");
            int number = scan.nextInt();

            switch (number) {
                case 0:
                    System.out.println("Wartość to zero");
                    break;
                case 1:
                    System.out.println("Wartość to jeden");
                    break;
                case 2:
                    System.out.println("Wartość to dwa");
                    break;
                case 3:
                    System.out.println("Wartość to trzy");
                    break;
                case 4:
                    System.out.println("Wartość to cztery");
                    break;
                case 5:
                    System.out.println("Wartość to pięć");
                    break;
                case 6:
                    System.out.println("Wartość to sześć");
                    break;
                case 7:
                    System.out.println("Wartość to siedem");
                    break;
                case 8:
                    System.out.println("Wartość to osiem");
                    break;
                case 9:
                    System.out.println("Wartość to dziewięć");
                    break;
                default:
                    System.out.println("Podano wartość z poza zakresu 0-9 ");
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

