package lesson46_innerclass;

public class InnerExam1 {
    // 내부 클래스 : 클래스 안에 선언한 클래스
    // 종류
    // 1. 인스턴스 클래스(instance class)
    // 2. 스태틱 클래스(static class)
    // 3. 지역 클래스(local class)
    // 4. 익명 클래스(anonymous class)

    // 1. 인스턴스 클래스 : 클래스 안에 인스턴스 변수, 즉 필드 선언 위치에 선언하는 경우
    class Cal {
        int value = 0;          // 필드선언 가능
        public void plus() {    // 메서드 정의 가능
            value++;
        }
    }
    public static void main(String[] args) {
        InnerExam1 t = new InnerExam1();        // 반드시 외부 클래스 객체 먼저 만들어야함
        // t.new Cal();                         // 위의 클래스를 이용해서 Cal 객체 생성

        // 바깥쪽 클래스 타입.내부타입
        InnerExam1.Cal cal = t.new Cal();       
        cal.plus();
        System.out.println(cal.value);
    }
}
