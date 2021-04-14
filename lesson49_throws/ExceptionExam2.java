package lesson49_throws;

public class ExceptionExam2 {
    
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = divide(i, j);
            System.out.println(k);
        }catch(ArithmeticException e) {                 // 발생할 예외(Arithmetic...)와 변수명(e)
            System.out.println(e.toString());           // 예외 정보 출력
        }
    }

    public static int divide(int i, int j) throws ArithmeticException, ClassCastException{
        int k = i/j;
        return k;
    }
}
