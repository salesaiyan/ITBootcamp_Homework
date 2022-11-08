import java.util.Scanner;

public class Domaci7 {
    public static void main(String[] args) {

        //Napraviti  program gde cete da unosite imena u neki niz.
        //U istom tom programu dodati ispis za sva slova koja pocinju na 'M'.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite velicinu niza: ");
        int velicinaNiza = scanner.nextInt();
        String nizImena[] = new String[velicinaNiza];

        for (int i = 0; i < velicinaNiza; i++) {
            System.out.print("Unesite ime: ");
            nizImena[i] = scanner.next();
        }

        for (int y = 0; y < nizImena.length; y++) {
            if ((nizImena[y]).toLowerCase().charAt(0) == 'm') {
                System.out.println("Ime koje pocinje na slovo 'M' je: " + nizImena[y]);
            }
        }
    }
}

