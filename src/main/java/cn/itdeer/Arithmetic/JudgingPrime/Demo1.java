package cn.itdeer.Arithmetic.JudgingPrime;

public class Demo1 {


    public static void main(String[] args) {


        System.out.println(isPrime(5));

    }


    public static boolean isPrime(int n){
        for(int x = 2 ; x * x <= n ; x++)
            if(n % x == 0)
                return false;
            return true;
    }


}
