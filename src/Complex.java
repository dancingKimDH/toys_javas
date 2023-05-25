import java.util.Scanner;

public class Complex {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String[] first = {"", "", "", ""};
        String[][] polls = {
                { "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?", "전혀 아니다", "아니다", "그렇다", "매우 그렇다" },
                { "2. 강의의 내용은 체계적이고 성의있게 구성되었는가?", "전혀 아니다", "아니다", "그렇다", "매우 그렇다" },
                { "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?", "전혀 아니다", "아니다", "그렇다", "매우 그렇다" },
                { "4. 강의 진행 속도는 적절하였는가?", "전혀 아니다", "아니다", "그렇다", "매우 그렇다" }
        };

            for (int a = 0; a < polls.length; a = a + 1) {
                System.out.println(polls[a][0]);

                for(int b = 1; b < polls[a].length; b = b + 1) {
                    System.out.println(polls[a][b]);
                }
                
                System.out.println("답변: ");
                first[a] = myObj.nextLine();
                System.out.println();
            }
            for (int c = 0; c < polls.length; c = c + 1) {
                System.out.println(polls[c][0] + first[c]);
            }

        }
    // System.out.println();

    // String [][] polls = {
    // {"1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?"},
    // {"전혀 아니다", "아니다", "그렇다", "매우 그렇다"},
    // {"2. 강의의 내용은 체계적이고 성의있게 구성되었는가?"},
    // {"전혀 아니다", "아니다", "그렇다", "매우 그렇다"},
    // {"3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?"},
    // {"전혀 아니다", "아니다", "그렇다", "매우 그렇다"},
    // {"4. 강의 진행 속도는 적절하였는가?"},
    // {"전혀 아니다", "아니다", "그렇다", "매우 그렇다"},
    // // polls end
    // };

    // for (int a = 0; a < polls.length; a = a + 2) {
    // for (int b = 1; ;b = b + 2) {
    // System.out.println(polls[a][0]);
    // System.out.println();
    // }

    // }
    // main end
    // print 할 부분
    // return 0;
}
