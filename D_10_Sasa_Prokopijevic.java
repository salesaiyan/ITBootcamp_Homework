import java.util.Scanner;

public class FaktorijalBorja {
    public static void main(String[] args) {

        faktorijal();
    }
    public static int faktorijal () {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj: ");

        int rezultat = 1;
        int unos = scanner.nextInt();
        for (int i = 1; i <= unos; i++) {
            rezultat = rezultat * i;
        }

        System.out.println("Faktorija unetog broja je: " + rezultat);
        return rezultat;
    }
}
