import java.util.Scanner;

public class Domaci4 {
    public static void main(String[] args) {

        // 1.Istampati sve samoglasnike iz proizvoljnog stringa.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite rec: ");
        String rec = scanner.nextLine();

        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';
        int brojSamoglasnika = 0;

        for (int y = 0; y < rec.length(); y++) {
          if (rec.charAt(y) == a) {
             System.out.println(a);
              brojSamoglasnika++;
          }

            if (rec.charAt(y) == e) {
                System.out.println(e);
                brojSamoglasnika++;
            }

            if (rec.charAt(y) == i) {
               System.out.println(i);
                brojSamoglasnika++;
            }

            if (rec.charAt(y) == o) {
                System.out.println(o);
                brojSamoglasnika++;
            }

            if (rec.charAt(y) == u) {
                //System.out.print(u);
                brojSamoglasnika++;
            }
        }
        System.out.print("Broj samoglasnika je: " + brojSamoglasnika);
    }
}
