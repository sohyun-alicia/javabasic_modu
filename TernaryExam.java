import java.util.Calendar;
import java.util.Scanner;

public class TernaryExam {
    
    public static void main(String[] args) {
        
        // 삼항연산자
        // int b1 = (5 > 4) ? 50 : 40;         // 괄호안의 식이 참이면 50, 거짓이면 40 대입
        // System.out.println(b1);


        // --------------현재 시간이 오전인지 오후인지 출력하는 프로그램----------//
        // hour에는 현재 시간이 24시간 단위로 들어가있음
        // int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        // String ampm;
        // 삼항 연산자를 이용해 ampm에 오전 또는 오후의 값을 가지도록 만들기
        // ampm = (hour < 12 ) ? "오전" : "오후";
        // System.out.println(ampm);


        // ------------QUIZ------------- //
        // 삼항연산자를 사용하여
        // 끝자리가 1이면 1st, 2이면 2nd, 3이면 3rd, 4이면 4th를 출력

        Scanner sc = new Scanner(System.in);

            // System.out.println(sc.next());
        int num = sc.nextInt();
        String ordinal = (num == 1 && (num%100 != 11)) ? num+"st" : 
                        ((num == 2 && (num%100 != 12)) ? num+"nd" : 
                        ((num == 3 && (num%100 != 13) ? num+"rd" : num + "th")));
        System.out.println(ordinal);






    }
}
