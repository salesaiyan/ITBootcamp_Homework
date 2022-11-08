public class Domaci5 {
    public static void main(String[] args) {

      // 2.Uneti string "ITBootCamp" i stampati sve karaktere osim slova C. (Obratiti paznju na velicinu fonta)

        String rec = "ITBooCamp";

        for (int i = 0; i < rec.length(); i++) {
            if (rec.toLowerCase().charAt(i) == 'c') {
                continue;
            } else {
                System.out.print(rec.charAt(i));
            }
        }
    }
}
