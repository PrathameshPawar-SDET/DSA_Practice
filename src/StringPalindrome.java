import java.util.*;

public class StringPalindrome {
    public static boolean stringPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean ans = stringPalindrome(str);
        if (ans) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scanner.close();
    }
}
