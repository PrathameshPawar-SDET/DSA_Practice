//Given a function that outputs the string representation of numbers from 1 to N.
//But for multiples of three it should output "Fizz" instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

import java.util.*;

public class FizzBuzz {
    public static String [] fizzBuzz(int n)
    {

        String [] result=new String[n];
        for(int i=1;i<=n;i++)
        {

            if(i%5==0 && i%3==0)
                result[i-1]="FizzBuzz";
            else if(i%3==0)
                result[i-1]="Fizz";
            else if(i%5==0)
                result[i-1]="Buzz";
            else
                result[i-1]=Integer.toString(i);
        }
        return result;

    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] ans=fizzBuzz(n);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
