
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 55, 6, 23, 4, 1, 66, 4}; // Initialise unsorted array
        
        print(arr); // Print unsorted array
        
        System.out.println("========== SORTING =========="); // UI
        bubbleSort(arr); // Pass array through sorting method
        
        print(arr); // Print sorted array
        
        
    }

    public static void bubbleSort(int[] arr) {

        boolean isSorted = false; // Boolean showing if the array is sorted or not
        int endSorted = arr.length - 1; // After each pass through the array the last element will always be the largest, so shorten the array by 1 each pass

        while (!isSorted) { // While the array is not true
            isSorted = true; // Set array to true incase it is sorted at the end of cycling through all elements
            for (int i = 0; i < endSorted; i++) { 
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    isSorted = false; // Change back to false if in the loop as 2 numbers are out of order
                }
            }
            endSorted--; // Decrement the length of the array
        }

    }

    public static void swap(int[] arr, int a, int b) { // Swapping 'a' and 'b' around
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
    
    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]\n");
    }

}