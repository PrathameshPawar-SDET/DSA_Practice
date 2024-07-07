import java.util.*;

public class NaturalSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = naturalSum(n);
        System.out.println(res);
    }

    static int naturalSum(int N){
        int res = (N*(N+1))/2;
        return res;
    }
}
