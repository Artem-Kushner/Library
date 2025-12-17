import java.util.Random;

public class Library {

    public static boolean checkSize(int size) {
        if (size < 0) {
            System.out.println("Размер масива не может быть отрицательным!");
            return false;
        }
        return true;
    }

    public static int[] randomArray(int size, int min, int max) {
        int[] x = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int rand = max - min + 1;
            x[i] = random.nextInt(rand) + min;
            System.out.print(x[i] + ", ");
        }

        return x;
    }

    public int arrayMin (int[] array ){
        if (array.length == 0){
            return Integer.MAX_VALUE;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println();
        System.out.println(min);
return min;
    }

}