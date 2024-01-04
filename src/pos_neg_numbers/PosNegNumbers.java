package pos_neg_numbers;

public class PosNegNumbers {

    public static void sortArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int swapCount = 0;
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 1) {
                    if (array[i] < array[i + 1]) {
                        swap(array, i, i + 1);
                        swapCount++;
                    }
                }

            }
            if (swapCount == 0) {
                break;
            }
            System.out.print(String.format("%d: ", j + 1));
            printArray(array);
            System.out.println(swapCount);
        }

    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    private static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
}
