import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Domaci {

//    1. Napisati program sa metodama za:
//            1.1 Metoda za unos imena(String element) i ispis niz-a svih elemenata nakon sto se unesu
//    Unos: Marko
//    Unos: Jelena
//    Unos: Dejan
//    Ispis: Marko, Jelena, Dejan
//1.2 Metoda koja pronalazi uniju elemenata neka dva niza i ispisuje tu uniju kao treci niz
//    Unos: Marko, Jelena, Nikola
//    Unos: Milan, Jelena, Nikola
//    Ispis: Marko, Jelena, Nikola, Milan

    public static void main(String[] args) {
             unosImena();
    }

    public static void unosImena() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Koliko imena hocete da unesete za prvi niz: ");
        int velicinaNiza = scanner.nextInt();
        String[] prviNiz = new String[velicinaNiza];

        for (int i = 0; i < velicinaNiza; i++) {
            System.out.print("Unesite " + (i + 1) + " ime: ");
            String ime = scanner.next();
            prviNiz[i] = ime.toLowerCase();
        }
        System.out.print("Koliko imena hocete da unesete za drugi niz: ");
        int velicinaNiza1 = scanner.nextInt();
        String[] drugiNiz = new String[velicinaNiza1];

        for (int i = 0; i < velicinaNiza1; i++) {
            System.out.print("Unesite " + (i + 1) + " ime: ");
            String ime2 = scanner.next();
            drugiNiz[i] = ime2.toLowerCase();
        }
        System.out.println("Ispis imena prvog niza: " + Arrays.toString(prviNiz));
        System.out.println("Ispis imena drugog niza: " + Arrays.toString(drugiNiz));
        unijaNizova( prviNiz, drugiNiz);
    }
    public static void unijaNizova(String[] prviNiz, String[] drugiNiz) {

        String[] unijaImena = new String[prviNiz.length + drugiNiz.length];

        for (int i = 0; i < prviNiz.length; i++) {
            unijaImena[i] = prviNiz[i];
        }
        for (int i = prviNiz.length, y = 0; y < drugiNiz.length; y++, i++){
            unijaImena[i] = drugiNiz[y];
        }
        System.out.println("Ispis posle unije nizova: " + Arrays.toString(unijaImena));

        HashSet<String> unijaBezPonavljanjaImena = new HashSet<String>();
        unijaBezPonavljanjaImena.addAll(Arrays.asList(prviNiz));
        unijaBezPonavljanjaImena.addAll(Arrays.asList(drugiNiz));
        System.out.println("Unija imena bez ponavljanja: " + unijaBezPonavljanjaImena);
    }
}
