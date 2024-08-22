package Arrays;

public class Activity0 {

    public static void main(String[] args) {

        int[] numbers = { 2, 4, 6, 8, 10 };

        print_array(numbers);

        System.out.println(isEmpty(numbers));

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
}
