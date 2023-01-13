import java.util.Scanner;

public class PIP06ZAD2 {
    public static void main(String[] args) {
        // Zadanie 2
        System.out.println("Zadanie 2");

        System.out.println("Wprowadź rozmiar:");
        Scanner scanner = new Scanner(System.in);
        int rozmiar = scanner.nextInt();
        int sortedArr[] = new int[rozmiar];

        System.out.println("Wprowadź pojedynczo wartości tablicy:");
        for (int i = 0; i < rozmiar; i++) {
            sortedArr[i] = scanner.nextInt();
        }
        System.out.println("Pierwotna wersja:");

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        print(sortedArr);
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
}

