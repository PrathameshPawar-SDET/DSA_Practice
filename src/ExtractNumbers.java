import java.util.*;

public class ExtractNumbers {
    public static List<Integer> extractNumbers(int N, List<String> arr) {
        List<Integer> result = new ArrayList<>();
        for (String s : arr) {
            boolean status = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '-') {
                    if (i != 0 || s.length() == 1) {
                        status = false;
                        break;
                    }
                } else if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                    status = false;
                    break;
                }
            }
            if (status) {
                result.add(Integer.parseInt(s));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(scanner.next());
        }
        List<Integer> ans = extractNumbers(N, arr);
        for (int x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

