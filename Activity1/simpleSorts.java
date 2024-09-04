package Activity1;

public class simpleSorts {
    
    public static void main(String[] args){
        int[] randomArr = getRandom(1000, 50);

        int[] randomArr1 = randomArr.clone();
        int[] randomArr2 = randomArr.clone();
        int[] randomArr3 = randomArr.clone();

        int[] sortedBubble = bubble(randomArr1);
        int[] sortedSelection = selection(randomArr2);
        int[] sortedInsertion = insertion(randomArr3);

        System.out.println("Unsorted array:");
        printArray(randomArr);
        System.out.println();

        System.out.println("Bubble sort:");
        printArray(sortedBubble);
        System.out.println();

        System.out.println("Selection sort:");
        printArray(sortedSelection);
        System.out.println();
        
        System.out.println("Insertion sort:");
        printArray(sortedInsertion);
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

    // random array for sort testing
    public static int[] getRandom(int max, int length) {
        int[] new_list = new int[length];

        for (int i = 0; i < new_list.length; i++) {
            new_list[i] = (int) (Math.random() * max);
        }

        return new_list;
    }

    // Swap function for sorts
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
                    swap(j, j + 1, arr);
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

    // Insertion sort
    public static int[] insertion(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                // Shift to the right
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = current;
        }

        return arr;
    }
}
