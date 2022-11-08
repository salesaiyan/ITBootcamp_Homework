import java.util.Arrays;
import java.util.Scanner;

//    2. Napraviti metod koji ce za dva uneta Stringa proveriti da li su iste velicine, ako su iste velicine,
//    ispisati sve samoglasnike iz oba Stringa.
//    Prvi unos: mama
//    Drugi unos: teta
//    Prvi ispis: Ova dva Stringa su jednaka!
//    Drugi ispis: Samoglasnici su a,a,e,a. (edited)

public class UporedjivanjeDvaStringa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite prvu rec: ");
        String prvaRec = scanner.next();
        System.out.print("Unesite drugu rec: ");
        String drugaRec = scanner.next();
        duzina(prvaRec,drugaRec);
    }
    public static void duzina (String prvaRec, String drugaRec) {
       // boolean x = (prvaRec.length() == drugaRec.length());
        if (prvaRec.length() == drugaRec.length()){
            System.out.println("Reci su iste duzine");
            samoglasnici(prvaRec, drugaRec);
        } else {
            System.out.println("Reci nisu iste duzine");
        }
    }

    public static void samoglasnici (String prvaRec, String drugaRec) {

        int y = 0;
        char [] samoglasnici = new char[prvaRec.length()];
        String spojeneReci = prvaRec + drugaRec;

        for (int i = 0; i < spojeneReci.length(); i++){
            if (spojeneReci.charAt(i) == 'a' || spojeneReci.charAt(i) == 'e' || spojeneReci.charAt(i) == 'i' || spojeneReci.charAt(i) == 'o' || spojeneReci.charAt(i) == 'u'){
                samoglasnici[y] = spojeneReci.charAt(i);
                y++;
            }
        }
        char [] krajnjiNiz = new char [y];

        for (int i=0; i< krajnjiNiz.length; i++) {
            krajnjiNiz[i] = samoglasnici[i];
        }
        System.out.println("Samoglasnici su: " + (Arrays.toString(krajnjiNiz)));
    }
}

