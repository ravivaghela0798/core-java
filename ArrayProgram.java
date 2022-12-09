/* 
 * Array program to find the index of an array element
 */

public class ArrayProgram {

    public static int findIndex(int[] integerArray, int time) {
        if (integerArray == null) {
            return -1;
        }

        int arrayLength = integerArray.length;
        int arrayIndex = 0;

        while (arrayIndex < arrayLength) {
            if (integerArray[arrayIndex] == time) {
                return arrayIndex;
            } else {
                arrayIndex = arrayIndex + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] integerArray = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        System.out.println("Index position of 25 is: " + findIndex(integerArray, 15));
        System.out.println("Index position of 77 is: " + findIndex(integerArray, 25));
    }

}
