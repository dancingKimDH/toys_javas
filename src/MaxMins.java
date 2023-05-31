import java.util.Scanner;
//최솟값을 구합니다
public class MaxMins {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        //변수 설정
        int A = myObj.nextInt();
        int B = myObj.nextInt();
        int resultmax = 0;
        int resultmin = 0;
        //최솟값 결과 산출하는 조건문 작성
        if (A > B) {
            resultmin = B;
            resultmax = A;
        } else {
            resultmin = A;
            resultmax = B;
        }
        //조건문 출력
        System.out.println("최솟값은 " + resultmin + "입니다.");
        System.out.println("최댓값은 " + resultmax + "입니다.");
    }
}
