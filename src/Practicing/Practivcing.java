package Practicing;
import java.util.HashMap;

public class Practivcing {
    public static void main(String[] args) {

       /* //factorial
       long startTime = System.nanoTime();
       //System.out.println(startTime);
       factorial(5);
       factorial(5);
       factorial(5);
       factorial(5);
       factorial(5);
       factorial(5);
       factorial(5);
       factorial(5);
       factorial(5);
       factorial(5);
       long endTime = System.nanoTime();
       //System.out.println(endTime);
        long avg = (endTime - startTime)/10;
        System.out.println("Factorial time: " + avg);



        //fibonacci
        startTime = System.nanoTime();
        //System.out.println(startTime);
        fibonacci(5);
        fibonacci(5);
        fibonacci(5);
        fibonacci(5);
        fibonacci(5);
        fibonacci(5);
        fibonacci(5);
        fibonacci(5);
        fibonacci(5);
        fibonacci(5);
        endTime = System.nanoTime();
        //System.out.println(endTime);
        avg = (endTime - startTime)/10;
        System.out.println("Fibonacci time: " + avg);

        //fibonacci memo
        startTime = System.nanoTime();
        //System.out.println(startTime);
        fibonacciMemo(5);
        fibonacciMemo(5);
        fibonacciMemo(5);
        fibonacciMemo(5);
        fibonacciMemo(5);
        fibonacciMemo(5);
        fibonacciMemo(5);
        fibonacciMemo(5);
        fibonacciMemo(5);
        fibonacciMemo(5);
        endTime = System.nanoTime();
        //System.out.println(endTime);
        avg = (endTime - startTime)/10;
        System.out.println("Fibonacci Memo: " + avg);


        //fibonacci iterative
        startTime = System.nanoTime();
        //System.out.println(startTime);
        fibonacciIterative(5);
        fibonacciIterative(5);
        fibonacciIterative(5);
        fibonacciIterative(5);
        fibonacciIterative(5);
        fibonacciIterative(5);
        fibonacciIterative(5);
        fibonacciIterative(5);
        fibonacciIterative(5);
        fibonacciIterative(5);
        endTime = System.nanoTime();
        //System.out.println(endTime);
        avg = (endTime - startTime)/10;
        System.out.println("Fibonacci Iterative: " + avg);*/

        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given array is");
        printArray(arr);

        sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);

    }

    public double areaOfCircle(int radius){
        return radius * radius * Math.PI;
    }

    public boolean isEven(int number){
        return (number % 2 == 0)? true : false;

    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static String add(String str1, String str2){
        return str1 + str2;
    }

    public static int factorial(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return n * factorial(n-1);
        }
    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if (n==1){
            return n=1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int fibonacciIterative(int n){
        if(n<=0) return 0;
        if(n==1) return 1;

        int a = 0, b = 1, sum;
        for (int i = 2; i<=n; i++){
            sum = a+b;
            a = b;
            b = sum;
        }
        return b;
    }

    //memoization
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fibonacciMemo(int n){
        if(n<=0)return 0;
        if(n==1)return 1;

        if (memo.containsKey(n)) return memo.get(n); // return stored value

        int result = fibonacciMemo(n-1) + fibonacciMemo(n-2);
        memo.put(n, result);
        return result;

    }

    /*public static int[] mergeSort(int[] arr){
        if(arr.length < 2) return arr;

        int midpoint = arr.length / 2;
        System.out.println(midpoint);

        int[] left = new int[midpoint];
        int[] right = new int[arr.length - midpoint];

        for (int i = 0; i < midpoint; i++){
            left[i] = arr[i];
        }

        for (int i = midpoint; i < arr.length; i++){
            right[i] = arr[i];
        }


    }*/

    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int r)
    {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // A utility function to print array of size n
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }




}
