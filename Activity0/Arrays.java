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

        int[] numbers4 = getRandom(50, 20);

        System.out.println("The random array is:");
        printArray(numbers4);
        System.out.println();

        int[] numbers5 = bubble(numbers4);

        System.out.println("The sorted random array is:");
        printArray(numbers5);
        System.out.println();

        int[] numbers6 = selection(numbers4);

        System.out.println("The sorted random array is:");
        printArray(numbers6);
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

    // random array
    public static int[] getRandom(int max, int length) {
        int[] new_list = new int[length];

        for (int i = 0; i < new_list.length; i++) {
            new_list[i] = (int) (Math.random() * max);
        }

        return new_list;
    }

    private static void swap(int left, int right, int arr[]) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    // Bubble Sort
    public static int[] bubble(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    swap(i,j,arr);
                }
            }
        }
        return arr;
    }

    // Selection Sort
    public static int[] selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int current = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[current]) {
                    current = j;
                }
            }
            swap(i, current, arr);
        }

        return arr;
    }
}
