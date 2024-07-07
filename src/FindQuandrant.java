import java.util.*;

public class FindQuandrant {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        int result = findquadrant(x, y);
        System.out.println(result);

    }

    static int findquadrant(float x, float y) {



        if (x > 0 && y > 0)
            return 1;
        else if (x < 0 && y > 0)
            return 2;
        else if (x < 0 && y < 0)
            return 3;
        return 4;


    }
}
