package harj;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] intArray = new int[]{-5, -8, -2, 5, -8, -10, 19, 5, -38, 9};

        int poscount = 0, negcount = 0, length = intArray.length;

        int[] rearangeArray = new int[length];

        for (int i = 0; i < length; i++) {
            if (intArray[i] < 0) {
                rearangeArray[(length - 1) - negcount] = intArray[i];    //rearrangeArray[9] = -5
                negcount++;
            } else {
                rearangeArray[poscount] = intArray[i];
                poscount++;

            }

        }

        System.out.println(Arrays.toString(rearangeArray));
    }
}
