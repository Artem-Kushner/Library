
// TODO это то что ниже что такое? Тоже удалить
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* TODO: Нужно добавить считывание из консоли и зациклить при получении
            отрицательного значения массива
         */
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
    }
}
