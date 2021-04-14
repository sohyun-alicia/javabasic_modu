package lesson46_innerclass;

public class InnerExam2 {
    // 2.  정적 중첩 클래스 OR static 클래스
    // 필드를 정적필드, static한 필드로 선언
    static class Cal{
        int value = 0;              // 필드 선언
        public void plus() {        // 메소드 선언
            value++;
        }
    }
    public static void main(String[] args) {
        InnerExam2.Cal cal = new InnerExam2.Cal();  
        // static한 필드이기 때문에 InnerExam2 객체 생성필요 없음

        cal.plus();
        System.out.println(cal.value);
    }
}
