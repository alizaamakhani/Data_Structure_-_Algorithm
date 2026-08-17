import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] arr) {

        int n = arr.length;

        // Step 1: Find the pivot
        int i = n - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Step 2: If pivot exists, find the next greater element
        if (i >= 0) {
            int j = n - 1;

            while (arr[j] <= arr[i]) {
                j--;
            }

            // Swap pivot and next greater element
            swap(arr, i, j);
        }

        // Step 3: Reverse the elements after pivot
        reverse(arr, i + 1, n - 1);
    }

    // Swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse array from start to end
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        System.out.println("Original Array: " + Arrays.toString(arr));

        nextPermutation(arr);

        System.out.println("Next Permutation: " + Arrays.toString(arr));
    }
}