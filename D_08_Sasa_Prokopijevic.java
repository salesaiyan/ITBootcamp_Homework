import java.util.Arrays;
import java.util.Scanner;

public class Domaci8 {
    public static void main(String[] args) {
        //1.Napisati program gde unosite velicinu niza, zatim elemente niza, zatim istampati niz u suprotnom redosledu.
        // Primer:
        // Unos: 1, 2, 3, 4, 5
        // Ispis: 5, 4, 3, 2, 1
        // 2.U prvom programu, nakon sto se obrne redosled, dodati funkcionalnost izbacivanja svih parnih brojeva.
        // Unos: 5, 4, 3, 2, 1
        // Ispis: 5, 3, 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite velicinu niza: ");
        int velicinaNiza = scanner.nextInt();
        int[] niz = new int[velicinaNiza];
        int[] obrnutiNiz = new int[velicinaNiza];

        for (int i = 0; i < velicinaNiza; i++) {
            System.out.print("Unesite elemente u niz: ");
            niz[i] = scanner.nextInt();
        }
        System.out.println("Ispis elemenata:");
        System.out.println(Arrays.toString(niz));

        // y = velicnaNiza -1, ako unesem velicinu niza 3, poslednji index tog niza je 2,
        // tako da sam morao velicinu niza koju koristim kao brojac da smanjim za 1,
        // kako bi dobio tacno poslednji index u nizu

        for (int y = velicinaNiza - 1, i = 0; y >= 0; y--, i++) {
            obrnutiNiz[i] = niz[y];
        }
        System.out.println("Ispis elemenata u obrnutom redosledu:");
        System.out.println(Arrays.toString(obrnutiNiz));

        int brojac = 0;
        // brojac neparnih brojeva, obaj brojac cu koristiti dole kao velicinu niza za neparne brojeve
        for (int i = 0; i < velicinaNiza; i++) {
            if (obrnutiNiz[i] % 2!=0) {
                brojac++;
            }
        }
        int[] neparniBrojeviNiza = new int[brojac];
        for (int x = 0, b = 0; x < velicinaNiza; x++) {
            if (obrnutiNiz[x] % 2!=0) {
                neparniBrojeviNiza[b] = obrnutiNiz[x];
                b++;
            }
        }
        System.out.println("Neparni brojevi su:");
        System.out.println(Arrays.toString(neparniBrojeviNiza));
    }
}
