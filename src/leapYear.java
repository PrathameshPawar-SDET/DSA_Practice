import java.util.*;
public class leapYear {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean res = leapYearBasic(N);
        System.out.println(res);
    }

    static boolean leapYearBasic(int N){

        if (N % 400 == 0)
            return true;

        if (N % 100 == 0)
            return false;

        if (N % 4 == 0)
            return true;

        return false;
    }
}
