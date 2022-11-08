import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner mojSkener = new Scanner(System.in);
        System.out.println("Unesite velicinu majice: ");
        int velicinaMajice = mojSkener.nextInt();

        switch (velicinaMajice) {
            case 24:
                System.out.println("S velicina");
                break;
            case 30:
                System.out.println("M velicina");
                break;
            case 36:
                System.out.println("L velicina");
            case 42:
                System.out.println("XL velicina");
                break;
            default:
                System.out.println("Nepostojeca velicina");

        }
    }
}
