import java.util.*;
public class LeftRotationArray {

    static List<Integer> leftRotation(List<Integer> arr) {

        int temp = arr.get(0);
        int n = arr.size();
        for(int j=0;j<=n-2;j++){
            arr.set(j, j+1);
        }
        arr.set(n-1, temp);
        return arr;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        List<Integer> res = leftRotation(arr);

        for (int x : res) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

}
