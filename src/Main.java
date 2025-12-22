import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int min;
        int max;
        do {
            System.out.print("Задайте размер масиву: ");
            size = scanner.nextInt();
        }
        while (size <= 0);
        System.out.print("Задайте минимальный элемент массива: ");
        min = scanner.nextInt();
        System.out.print("Задайте максимальный элемент массива: ");
        max = scanner.nextInt();
        scanner.close();

        if (Library.checkSize(size)) {
            int[] array = Library.randomArray(size, min, max);
            System.out.print("Ваш массив: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            Library library = new Library();
            int minimym = library.arrayMin(array);
            System.out.println("Минимальный элемент масивва: " + minimym);
            library.maxIndex(array);
            System.out.println("Индекс максимально элемента масива: " + library.getIntMax());
        }
    }
}


