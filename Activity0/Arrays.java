package Activity0;

public class Arrays {

    public static void main(String[] args) {

        int[] numbers = { 2, 4, 6, 8, 10 };

        System.out.println("Printed array:");
        printArray(numbers);
        System.out.println();

        System.out.println("Array is empty:");
        System.out.println(isEmpty(numbers));
        System.out.println();

        int[] numbers2 = copyArray(numbers);

        System.out.println("The copied array is:");
        printArray(numbers2);
        System.out.println();

        int[] numbers3 = { 9, 7, 5, 3, 1 };

        System.out.println("Arrays 2 & 3 are equal:");
        System.out.println(isEqual(numbers2, numbers3));
        System.out.println();

    }

    // print array values
    public static void printArray(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println(array[array.length - 1] + "]");
    }

    // check if the array is empty
    public static boolean isEmpty(int[] array) {
        return array.length == 0;
    }

    // copy array
    public static int[] copyArray(int[] array) {

        int[] new_array = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            new_array[i] = array[i];
        }

        return new_array;
    }

    // check for equality
    public static boolean isEqual(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;

    }

}
