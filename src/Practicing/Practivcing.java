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



}
