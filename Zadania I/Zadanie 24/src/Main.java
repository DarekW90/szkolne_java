import java.util.ArrayList;
import java.util.List;

// Enum do określenia płci
enum Plec {
    MEZCZYZNA, KOBIETA
}

// Interfejs określający zachowanie
interface Zachowanie {
    void przedstawSie();
}

// Klasa bazowa Osoba
class Osoba {
    private String imie;
    private int wiek;
    private Plec plec;

    public Osoba(String imie, int wiek, Plec plec) {
        this.imie = imie;
        this.wiek = wiek;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public Plec getPlec() {
        return plec;
    }

    public void opiszSie() {
        System.out.println("Jestem osobą o imieniu " + imie + ", mam " + wiek + " lat i jestem " + plec + ".");
    }
}

// Klasa pochodna Student dziedzicząca po klasie Osoba i implementująca interfejs Zachowanie
class Student extends Osoba implements Zachowanie {
    private String numerIndeksu;

    public Student(String imie, int wiek, Plec plec, String numerIndeksu) {
        super(imie, wiek, plec);
        this.numerIndeksu = numerIndeksu;
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem studentem o imieniu " + getImie() + ", mam " + getWiek() + " lat, jestem " + getPlec() +
                " i mój numer indeksu to " + numerIndeksu + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // Tworzenie listy do przechowywania obiektów typu Osoba
        List<Osoba> listaOsob = new ArrayList<>();

        // Dodawanie obiektów do listy
        listaOsob.add(new Osoba("Anna", 25, Plec.KOBIETA));
        listaOsob.add(new Student("Jan", 21, Plec.MEZCZYZNA, "12345"));

        // Iteracja przez listę i wywoływanie metody opiszSie()
        for (Osoba osoba : listaOsob) {
            osoba.opiszSie();
        }

        // Iteracja przez listę i wywoływanie metody przedstawSie() tylko dla obiektów Student
        for (Osoba osoba : listaOsob) {
            if (osoba instanceof Student) {
                ((Student) osoba).przedstawSie();
            }
        }
    }
}
