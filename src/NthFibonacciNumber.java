import java.util.*;

public class NthFibonacciNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = nthFibonacci(n);
        System.out.println(ans);
    }

    static int nthFibonacci(int n){

        if(n<=1){
            return n;
        }

        int fib1 = nthFibonacci(n-1);
        int fib2 = nthFibonacci(n-2);

        int result = fib1 + fib2;
        return result;
    }
}
