package Activity0;

public class Arrays {

    public static void main(String[] args) {

        int[] numbers = { 2, 4, 6, 8, 10 };

        print_array(numbers);

        System.out.println(isEmpty(numbers));

        int[] numbers2 = copyArray(numbers);

        print_array(numbers2);

        int[] numbers3 = { 1, 3, 5, 7, 9 };

    }

    // print array values
    public static void print_array(int[] array) {
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

        if(arr1.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }     
        }

        return true;

    }
}
