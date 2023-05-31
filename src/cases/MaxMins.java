package cases;

import java.util.Scanner;

public class MaxMins {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int A = myObj.nextInt();
        int B = myObj.nextInt();
        int result = 0;
        if (A > B) {
            result = B;
        } else {
            result = A;
        }
        System.out.println("최솟값은 " + result + "입니다.");
    }
}
