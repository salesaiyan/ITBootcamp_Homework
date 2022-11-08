import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        int trenutnaGodina = 2022;

        Scanner mojSkener = new Scanner(System.in);
        System.out.println("Unesite godinu kada ste poceli da radite: ");
        int godinaPocetkaRada = mojSkener.nextInt();

        int radniStaz = trenutnaGodina - godinaPocetkaRada;

        if (radniStaz >=0 && radniStaz <= 4) {
            System.out.println("Ti si Junior programer");
        } else if (radniStaz > 4 && radniStaz <= 8) {
            System.out.println("Ti si Senior programer");
        } else {
            System.out.println("Vi ste direktor firme");
        }


    }
}
