import java.util.Scanner;

public class PIP06ZAD3 {
    public static void main(String[] args) {
        // Zadanie 3
        System.out.println("Zadanie 3");

        System.out.println("Wprowadź rozmiar:");
        Scanner scanner = new Scanner(System.in);
        int rozmiar = scanner.nextInt();
        int revArr[] = new int[rozmiar];

        System.out.println("Wprowadź pojedynczo wartości tablicy:");
        for (int i = 0; i < rozmiar; i++) {
            revArr[i] = scanner.nextInt();
        }
        System.out.println("Pierwotna wersja:");

        for (int i = 0; i < revArr.length; i++) {
            System.out.print(revArr[i] + " ");
        }

        System.out.println(" ");

        print(revArr);
    }

    public static void print(int[] revArr) {

        System.out.println("Wersja zamieniona kolejnością wpisywania:");
        for (int i = revArr.length - 1; i >= 0; i--) {
            System.out.print(revArr[i] + " ");
        }
    }
}