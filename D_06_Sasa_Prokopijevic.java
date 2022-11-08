import java.util.Scanner;

public class Domaci6 {
    public static void main(String[] args) {

        // 3.Napisati pomocu petlje program koji racuna sumu kvadratnih vrednost od 1 2 3 i 5, ako korisnik unese
        //0, izlazi iz programa. (Obratiti paznju na negativne brojeve).

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int kvadratniKoren = 0;

        for (;true;) {
            System.out.print("Unesite broj: ");
            double unos = scanner.nextDouble();
            double abs = Math.abs(unos);
            if (unos == 0) {
                break;
            }

            if (unos == 4) {
                continue;
            }

            if (abs == 1 || abs == 2 || abs == 3 || abs == 5) {
                kvadratniKoren = (int)Math.pow(abs, 2);
                suma = suma + kvadratniKoren;
                System.out.println("Trenutni zbir je: " + suma);
            } else {
                System.out.println("Uneli ste nedozvoljen broj.");
            }
        }
        System.out.println("Suma kvadratnih korena je: " + suma);
    }
}
