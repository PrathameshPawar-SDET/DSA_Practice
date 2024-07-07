import java.util.*;
public class ReverseTheString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = reverseString(str);
        System.out.println(ans);
        sc.close();
    }

    static String reverseString(String str){
        char[] result = str.toCharArray();
        int left = 0;
        int right = str.length()-1;

        while(left<right){
            char temp = result[left];
            result[left] = result[right];
            result[right] = temp;

            left ++;
            right --;


        }
        return new String(result);

    }
}
