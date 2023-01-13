import java.util.Scanner;
import java.util.Arrays;

public class PIP06ZAD1 {
    public static void main(String[] args) {

        // Zadanie 1
        System.out.println("Zadanie 1");

        System.out.println("Wprowadź liczbę n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = (int) (Math.random() * 100);

        }
        print(tab);
    }

    public static void print(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(" "+Arrays.toString(tab));
            return;
        }
    }

}
