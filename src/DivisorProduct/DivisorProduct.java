package DivisorProduct;

public class DivisorProduct {
    public static void run (){
        int num = 10;

        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                System.out.println(i);
                System.out.println(num/i);
            };
        }
    }
}
