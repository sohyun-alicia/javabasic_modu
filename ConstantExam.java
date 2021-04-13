public class ConstantExam {
    

    public static void main(String[] args) {
        int i;
        i = 10;
        System.out.println(i);
        i = 5;
        System.out.println(i);
        

        // 상수를 선언 명명 규칙 
        // 대문자로만 구성된 명사로 정한다.
        // 여러 단어로 구성된 이름의 경우 단어 사이에 '_'를 써서 구분
        final int J;                
        // J = 10;
        J = 5;      
        System.out.println(J);      //The final local variable j may already have been assigned
    
        
        // 상수 활용해 원의 넓이 구하기
        final double PI = 3.14159;          // PI값을 상수로 지정
        int radius = 3;
        double result = radius * 2 * PI;
        System.out.println(result);
    
        
    
    
    }
}
