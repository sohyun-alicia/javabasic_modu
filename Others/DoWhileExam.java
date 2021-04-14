import java.util.Scanner;

public class DoWhileExam {
    public static void main(String[] args) {
        int value = 0;
        Scanner scan = new Scanner(System.in);          // 입력받기

        do{
            value = scan.nextInt();                     // nextInt(): 정수 입력받아 반환
            System.out.println("입력받은 값:"+value);
        }while(value != 10);        
        System.out.println("반복문 종료!");              // 입력받은 값이 10이되면 종료
    }
}
