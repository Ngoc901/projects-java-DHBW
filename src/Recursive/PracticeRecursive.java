package Recursive;

public class PracticeRecursive {
    public static void main(String[] args) {
        System.out.println(bunnyEars2(2));
    }

    /*We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).*/

    public static int bunnyEars(int bunnies) {
        if(bunnies == 0) {return 0;}
        return bunnyEars(bunnies-1)+2;
    }

    /*We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.*/


    public static int triangle(int rows) {
        if(rows == 0){return 0;}
        return rows + triangle(rows-1);


    }


    public static int factorial(int n) {
        if(n==1){return 1;}
        return n*factorial(n-1);
    }

    public static int fibonacci(int n) {
        if(n<=1){return n;}
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int bunnyEars2(int bunnies) {
        if(bunnies==0){return 0;}
        if(bunnies%2!=0){
            return 2+bunnyEars2(bunnies-1);
        }else{
            return 3+bunnyEars2(bunnies-2);
        }

    }



}









