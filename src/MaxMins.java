import java.util.Scanner;

public class MaxMins {
    public static void main(String[] args) {
        try {
            Scanner my = new Scanner(System.in);
            int first = 0;
            int second = 0;
            first = my.nextInt();
            second = my.nextInt();
            int answer = Math.max(first, second);
            // 스캔 받은 두수의 높은 값을 출력하는 코드입니다.
            System.out.println(answer);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }// return 0;

}
