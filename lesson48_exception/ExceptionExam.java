package lesson48_exception;

public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 2;
        try {
            int k = i/j;
            System.out.println(k);
        }catch(ArithmeticException e) {             // ArithmeticException라는 예외 객체를 e라는 변수가 가리킴
            System.out.println("0으로 나눌 수 없습니다." + e.toString());   // e라는 참조 변수는 toString이라는 메서드를 가짐(예외 정보 알려주는 메서드)
        }finally {
            System.out.println("예외와 상관없이 무조건 실행!");
        }
        
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println("main end!!");
    }
}
