package Array;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        System.out.println("Generate an array: ");
        int[] myArray = generateArray();
        printArray(myArray);
        printEvenNumbers(myArray);
        printOddNumbers(myArray);
    }
    private static int[] generateArray(){
        Random random = new Random();
        int[] myArray = new int [10];
        for(int i = 0; i<10; i++){
            myArray[i] = random.nextInt(100);
        }

        return myArray;
    }

    private static void printArray(int[] myArray){
        for(int i = 0; i<myArray.length; i++){
            System.out.print(myArray[i] +" ");
        }
        System.out.println();
    }
    private static void printEvenNumbers(int[] myArray){
        System.out.println("Even numbers: ");
        for(int i = 0; i<myArray.length; i++){
            if(myArray[i]%2 == 0){
                System.out.print(myArray[i] + " ");
            }
        }
        System.out.println();
    }
    private static void printOddNumbers(int[] myArray){
        System.out.println("Odd numbers: ");
        for(int i = 0; i<myArray.length; i++){
            if(myArray[i]%2 != 0){
                System.out.print(myArray[i] + " ");
            }
        }
        System.out.println();
    }
}
