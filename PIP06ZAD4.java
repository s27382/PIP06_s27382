import java.util.Scanner;

public class PIP06ZAD4 {
    public static void main(String[] args) {
        // Zadanie 4

        System.out.println("Zadanie 4");
        Scanner scanner = new Scanner(System.in);
        int rozmiar = 5;
        int sortedArr[] = new int[rozmiar];

        System.out.println("Wprowadź pojedynczo 5 wartości tablicy nr 1:");
        for (int i = 0; i < rozmiar; i++) {
            sortedArr[i] = scanner.nextInt();
        }
        System.out.println("Pierwotna wersja:");

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        print(sortedArr);

        System.out.println(" ");

        Scanner scanner1 = new Scanner(System.in);
        int revArr[] = new int[rozmiar];

        System.out.println("Wprowadź pojedynczo 5 wartości tablicy nr 2:");
        for (int i = 0; i < rozmiar; i++) {
            revArr[i] = scanner.nextInt();
        }
        System.out.println("Pierwotna wersja:");

        for (int i = 0; i < revArr.length; i++) {
            System.out.print(revArr[i] + " ");
        }

        System.out.println(" ");

        print1(revArr);
        equalsReverse(sortedArr, revArr);
    }

    public static void print (int[] sortedArr){
        int sort = 0;

        for (int i = 0; i <sortedArr.length; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[i] > sortedArr[j]) {
                    sort = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = sort;
                }
            }
        }
        System.out.println("\nPosortowana wersja: ");
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
    public static void print1 (int[] revArr) {

        System.out.println("Wersja zamieniona kolejnością wpisywania:");
        for (int i = revArr.length - 1; i >= 0; i--) {
            System.out.print(revArr[i] + " ");
        }
    }
    public static boolean equalsReverse(int[] sortedArr, int[] revArr) {
        if (sortedArr.length != revArr.length) {
            return false;
        }

        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] != revArr[revArr.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
