import java.util.Scanner;

public class Domaci3 {
    public static void main(String[] args) {

        Scanner KorisnikovPrviBroj = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int prviBroj = KorisnikovPrviBroj.nextInt();

        Scanner KorisnikovDrugiBroj = new Scanner(System.in);
        System.out.print("Unesite drugi broj: ");
        int drugiBroj = KorisnikovDrugiBroj.nextInt();

        int b1 = Math.abs(prviBroj);
        int b2 = Math.abs(drugiBroj);

        int suma = 0;
        int i = b1;

        while ( i > 0 ) {
            suma = suma + b2;
            i--;
        }

        if ((prviBroj < 0 && drugiBroj < 0) || (prviBroj > 0 && drugiBroj > 0)) {
            System.out.println("Zbir mnozenja je " + suma);
        } else if ((prviBroj > 0 && drugiBroj < 0) || (prviBroj < 0 && drugiBroj >0)) {
            System.out.println("Zbir mnozenja je " + -suma);
        } else {
            System.out.println("Proizvod je 0");
        }
    }
}
