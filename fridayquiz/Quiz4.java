package fridayquiz;
import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {

        // 3-1 . 입력받은 정숫값이 음수인지 확인하기
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값 : ");
        // int num = sc.nextInt();
        // if (num < 0) {
        //     System.out.println("이 값은 음의 값입니다.");
        // }

        // 3-2. 정수값을 받아서 절댓값 구하기
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값: ");
        // int num = sc.nextInt();

        // if (num > 0) {
        //     System.out.println("절댓값은 " + num + "입니다.");
        // }else {
        //     System.out.println("절댓값은 " + -num + "입니다.");
        // }

        // 3-3. 두개의 정수값을 읽어서 후자가 전자의 약수인지 아닌지 리턴
        // Scanner sc = new Scanner(System.in);

        // System.out.print("변수A: ");
        // int num = sc.nextInt();
        // System.out.print("변수B: ");
        // int num1 = sc.nextInt();

        // if (num % num1 == 0) {
        //     System.out.println("B는 A의 약수입니다.");
        // }
        // else {
        //     System.out.println("B는 A의 약수가 아닙니다.");
        // }

        // 3-4. 위의 문제를 부정연산자 !를 사용해서 풀어보기
        // Scanner sc = new Scanner(System.in);

        // System.out.print("변수A: ");
        // int num = sc.nextInt();
        // System.out.print("변수B: ");
        // int num1 = sc.nextInt();

        // if (!(num % num1 == 0)) {
        //     System.out.println("B는 A의 약수가 아닙니다.");
        // }
        // else {
        //     System.out.println("B는 A의 약수입니다.");
        // }

        // if (num % num1 != 0) {
        //     System.out.println("B는 A의 약수가 아닙니다.");
        // }
        // else {
        //     System.out.println("B는 A의 약수입니다.");
        // }

        // 3-5. 입력받은 값이 양수인지 음수인지 판별하기

        // Scanner sc = new Scanner(System.in);

        // System.out.print("정숫값: ");
        // int num = sc.nextInt();
        // if (num > 0) {
        //     System.out.println("값이 양수입니다.");
        // }else if (num ==0 ) {
        //     System.out.println("값이 0입니다.");
        // }else {
        //     System.out.println("값이 음수입니다.");
        // }

        // 3-7. 두개의 값을 입력받아 대소관계 판별하기
        // Scanner sc = new Scanner(System.in);
        // System.out.print("변수 a : ");
        // int num1 = sc.nextInt();
        // System.out.print("변수 b : ");
        // int num2 = sc.nextInt();

        // if (num1 > num2) {
        //     System.out.println("a가 크다.");
        // }else if (num1 < num2) {
        //     System.out.println("b가 크다.");
        // }else {
        //     System.out.println("a와 b가 같다.");
        // }


        // 3-8.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수값: ");
        // int num = sc.nextInt();


        // if (num < 0) {
        //     System.out.println("음의 정숫값을 입력했습니다.");
        // }
        // else if (num % 10 == 0) {
        //     System.out.println("이 값은 10의 배수입니다.");
        // }else {
        //     System.out.println("이 값은 10의 배수가 아닙니다.");
        // }

        // 3-11. 입력한 점수에 따라 수/우/미/양/가 판정하기
        // Scanner sc = new Scanner(System.in);
        // System.out.print("점수: ");
        // int num = sc.nextInt();
        // String grade="";
        // if (num > 100) {
        //     grade = "잘못된 점수입니다.";
        // }
        // else if (num > 80) {
        //     grade = "수";
        // }
        // else if (num > 70) {
        //     grade = "우";
        // }
        // else if (num > 60) {
        //     grade = "미";
        // }
        // else if (num > 50) {
        //     grade = "양";
        // }
        // else {
        //     grade = "가";
        // }
        // System.out.println(grade);

        // 3-12. 입력받은 두 값의 차이값 구하기(음수 생성X)
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a : ");
        // int num1 = sc.nextInt();
        // System.out.print("정수 b : ");
        // int num2 = sc.nextInt();
        // int minus;

        // if (num1 > num2) {
        //     minus = num1 - num2;
        // }else {
        //     minus = num2 - num1;
        // }
        // System.out.println("두 값의 차는 " + minus + "입니다.");


        // if를 사용하지 않고 위 프로그램 작성하기 - 1 삼항방정식 사용

        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a : ");
        // int num1 = sc.nextInt();
        // System.out.print("정수 b : ");
        // int num2 = sc.nextInt();
        // int minus = (num1 > num2) ? num1 - num2 : num2 - num1;

        // System.out.println("두 값의 차는 " + minus + "입니다.");


        // if 사용하지 않고 위 프로그램 작성하기 - 2 절대값 사용

        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a : ");
        // int num1 = sc.nextInt();
        // System.out.print("정수 b : ");
        // int num2 = sc.nextInt();
        // int minus = Math.abs(num1 - num2);

        // System.out.println("두 값의 차는 " + minus + "입니다.");

        // 3-15. 입력받은 세개의 값중 최솟값 출력하기
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a: ");
        // int num1 = sc.nextInt();
        // System.out.print("정수 b: ");
        // int num2 = sc.nextInt();
        // System.out.print("정수 c: ");
        // int num3 = sc.nextInt();


        // if ((num1 - num2) < 0 && (num1 - num3) < 0) {
        //     System.out.println("최솟값은 " + num1 + "입니다.");
        // }else if ((num2 - num1) < 0 && (num2 - num3) < 0) {
        //     System.out.println("최솟값은 " + num2 + "입니다.");
        // }else {
        //     System.out.println("최솟값은 " + num3 + "입니다.");
        // }

        // int min = num1;
        // if (num2 < min) {
        //     min = num2;
        // }if (num3 < min) {
        //     min = num3;
        // }
        // System.out.println("최솟값은" + min + "입니다.")

        // 3-16. 입력받은 세 개의 값중에 중앙값 구하기
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a : ");
        // int a = sc.nextInt();
        // System.out.print("정수 b : ");
        // int b = sc.nextInt();
        // System.out.print("정수 c: ");
        // int c = sc.nextInt();

        // int med;
        // if ((a > b && c > a) || (a > c && b > a))  {
        //     med = a;
        // }else if ((b > c && a > b) || (b > a && c > b)) {
        //     med = b;
        // }else {
        //     med = c;
        // }
        // System.out.println("중앙값은 " + med + "입니다.");


        // 3-17. 2개의 정숫값을 내림차순으로 정렬 출력하기(큰값을 무조건 a에 대입)
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 a : ");
        // int a = sc.nextInt();
        // System.out.print("정수 b : ");
        // int b = sc.nextInt();
        // int w;
        
        // if (b >= a) {
        // w = a;
        // a = b;
        // b = w;
        // }

        // System.out.println("a>=b가 되도록 정렬했습니다.\n변수 a는 " + a + "입니다. \n변수 b는 " + b + "입니다.");

      
        // 3-18. 세개 정수값 오름차순으로 정렬

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a : ");
        int a = sc.nextInt();
        System.out.print("정수 b : ");
        int b = sc.nextInt();
        System.out.print("정수 c : ");
        int c = sc.nextInt();
        int w;

        if (a > c && c > b) {
            w = c;
            c = b;
            b = w;
        }else if (b > c && c > a) {
            w = a;
            a = b;
            b = c;
            c = w;
        }else if (b > a && a > c) {
            w = a;
            a = b;
            b = w;
        }else if (c > b && b > a) {
            w = a;
            a = c;
            c = w;
        }else {
            w = c;
            a = c;
            b = a;
            c = b;
        }
        System.out.println("변수 a는 " + a + "입니다.\n 변수 b는 " + b + "입니다.\n 변수 c는 " + c + "입니다.");





    }
}


