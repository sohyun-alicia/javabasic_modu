package fridayquiz;
import java.util.Random;
import java.util.Scanner;

public class Quiz3 {
   
    public static void main(String[] args) {
        // 14. 
        // Random rand = new Random();

        // int a = 1 + rand.nextInt(9);        // rand.nextInt(9): 9미만의 난수
        // int b = 1 + rand.nextInt(9);
        // int c = rand.nextInt(90);

        // System.out.println("3개의 난수를 생성했습니다.");
        // System.out.println("한자리 양의 정수: " + a);
        // System.out.println("한자리 음의 정수: " + -b);
        // System.out.println("두자리 양의 정수: " + (c + 10));

        // 15. 입력받은 값의 +5, -5 사이의 랜덤 정숫값 생성하기
        // Random rand = new Random();

        // System.out.print("정숫값: ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int rn = n-5 + rand.nextInt(11);

        // System.out.println("입력 값의 +-5 범위의 난수를 생성했습니다.");
        // System.out.println("값은" +rn + "입니다.");

        // 2-14. 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("성 : ");
        // String ln = sc.next();

        // System.out.print("이름 : ");
        // String fn = sc.next();

        // System.out.println("안녕하세요." + ln + fn + "씨");

        // 2-16. String형의 변수를 문자여로 초기화하거나 변수에 문자열 대입

        String s1 = "ABC";      // 초기화
        String s2 = "XYZ";      // 초기화

        System.out.println("문자열 s1은 " + s1 + "입니다.");
        System.out.println("문자열 s2는 " + s2 + "입니다.");

        s1 = "FBI";             // 대입(값 변경)
        System.out.println("문자열 s1 은" + s1 + "입니다.");
        System.out.println("문자열 s2는 " + s2 + "입니다.");


    }
}
