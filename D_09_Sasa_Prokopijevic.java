import java.util.Arrays;
import java.util.Scanner;

public class Domaci9 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(arr));
            int arr2[] = new int[arr.length-2];
            System.out.print("Unesite prvi broj indexa koji hocete da obrisete: ");
            int index1 = scanner.nextInt();
            System.out.print("Unesite drugi broj indexa koji hocete da obrisete: ");
            int index2 = scanner.nextInt();

            for (int i = 0, b = 0; i < arr.length; i++) {
                if (i == index1 || i == index2) {
                   continue;
                } else {
                    arr2[b] = arr[i];
                    b++;
                }
            }
        System.out.println(Arrays.toString(arr2));
        }
    }

