
package udemy_exercises;

import java.util.Arrays;
import java.util.Scanner;

class Sorting {

    static Scanner scanner = new Scanner(System.in);

    static void sortIntegers(int[] nums) {

        int[] sortedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedArray[i] = nums[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }

    }

    static void printNums(int[] intArray) {

        System.out.println(Arrays.toString(intArray));
    }

    static int[] getNums() {

        int[] intArray;
        int arrayLength;
        System.out.print("Enter number of integers to add: ");
        arrayLength = scanner.nextInt();
        intArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter number: ");
            intArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return intArray;
    }

    static void reverse(int[] numbers) {

        int temp;
        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length -  i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("This is the Sorting Class");

        int[] myArray = getNums();
        System.out.println("Here is my array.");
        printNums(myArray);
        reverse(myArray);
        System.out.println("Here is my reversed array");
        printNums(myArray);
        System.out.println("Here is my sorted array");
        sortIntegers(myArray);
    }

}
