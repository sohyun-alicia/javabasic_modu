package lesson46_innerclass;

public class InnerExam3 {
    // 3. 지역 중첩 클래스 OR 지역 클래스(local class)
    // 내부클래스를 인스턴스 변수로 선언X
    // 메서드 안에 선언

    public void exec() {
        class Cal {
            int value = 0;                  // 필드 선언
            public void plus() {            // 메서드 선언
                value++;
            }
        }
        Cal cal = new Cal();                    // 메서드 안에서 Cal 객체 생성
        cal.plus();                             // Cal 객체가 가진 메서드 호출
        System.out.println(cal.value);          // Cal이 가진 value 호출
    }
    public static void main(String[] args) {
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
}
