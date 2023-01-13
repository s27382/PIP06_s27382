import java.util.Scanner;

public class PIP06ZAD1 {
    public static void main(String[] args) {

        // Zadanie 1
        System.out.println("Zadanie 1");

        System.out.println("Wprowadź liczbę n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] genArr = new int[n];

        for (int i = 0; i < n; i++) {
            genArr[i] = (int) (Math.random() * 100);

        }
        System.out.println("Otrzymana tablica prezentuje się następująco:");
        print(genArr);
    }

    public static void print(int[] genArr) {
        for (int i = 0; i < genArr.length; i++) {
            System.out.print(genArr[i] + " ");
        }
    }

}
