package Algorithms;

public class Algorithms {

    public static void main(String[] args) {
        // Create object of this class


        // Given array arr[]
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;

        // Function Call
        int result = binarySearch(arr, 0,
                n - 1, x);

        if (result == -1)
            System.out.println("Element "
                    + "not present");
        else
            System.out.println("Element found"+ " at index "+ result);

    }

   public static int binarySearch(int arr[], int l,
                     int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present
            // at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than
            // mid, then it can only be
            // present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l,
                        mid - 1, x);

            // Else the element can only be
            // present in right subarray
            return binarySearch(arr, mid + 1,
                    r, x);
        }

        // Reach here when element is
        // not present in array
        return -1;
    }

    //quick sort

    public static void quicksort(int[] arr, int start, int end) {

        if(arr != null && arr.length <= 1) {
            return;
        }

        if (start < end) {

            int pivotIndex = partition(arr, start, end);
            quicksort(arr, start, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {

        int pivot = arr[start];
        int i = start;
        for (int j = start + 1; j <= end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, start, i);
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubble_sort(int arr[]) {

        int n = arr.length;

        // Loop for each pass
        for (int i = 0; i < n - 1; i++) {
            // Loop to iterate over each element in each pass
            for (int j = 0; j < n - i - 1; j++) {

                // compare two adjacent elements, if swapping is required then do so
                if (arr[j] > arr[j + 1]) {

                    // swap both elements using temp variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void selection_sort(int arr[]) {
        int n = arr.length;


        //  Loop for each iteration
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;


            // Loop to find index of minimum element for ith index in each iteration
            for (int j = i + 1; j < n; j++) {

                // Check for the minimum element in each iteration.
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // put that minimum element at ith index using temp variable
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }



}
