import java.util.Scanner;

// TODO это то что ниже что такое? Тоже удалить
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите размер массива: ");
        int size;
        int min;
        int max;
        do {
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Размер массива не может быть меньше или равен нулю");
            }
        }
        while (size <= 0);
        System.out.println("Задайте минимальный элемент массива: ");
        min = scanner.nextInt();
        System.out.println("Задайте максимальный элемент массива: ");
        max = scanner.nextInt();
        if (min > max) {
            System.out.println("Минимальный элемент не может быть больше максимального");

        }
        scanner.close();

        int[] array;
        array = Library.randomArray(size, min, max);
        System.out.println(array);
        Library library = new Library();
        library.arrayMin(array);
        library.maxIndex(array);
    }

        /* TODO: Нужно добавить считывание из консоли и зациклить при получении
            отрицательного значения массива

        Library.checkSize(-2);
        Library.checkSize(3);
        Library.checkSize(0);
        Library.checkSize(-1);
        Library.randomArray(8, 41, 999);
        Library library = new Library();

        // TODO: что значит a? это что такое?
        int[] a = {6, 54, 21, 85, 2, 185, 3, 48};
        // TODO: нужно вызвать на массиве который сгенерируется
        library.arrayMin(a);

         */
}


