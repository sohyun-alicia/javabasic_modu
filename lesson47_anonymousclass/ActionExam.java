package lesson47_anonymousclass;

public class ActionExam {
    
    public static void main(String[] args) {
        // 일반적인 추상 클래스 사용법
        // Action action = new MyAction();
        // action.exec();

        // 익명 클래스 사용하기
        // 익명 클래스를 만들고, 똑같이 이 부분을 사용하는 메서드 만들기
        Action action = new Action() {
            @Override
            public void exec() {
                System.out.println("exec");
            }
        };
        action.exec();              // '레퍼런스 변수. 메서드명()'
    }

    // 생성자 다음에 중괄호를 여닫으면 
    // 해당 생성자 이름에 해당하는 클래스를 상속받는 이름 없는 객체를 만든다는 의미
    // 중괄호 안에 추상 메서드를 구현하거나 메서드를 추가
    // 익명 클래스를 만드는 이유는 Action을 상속받는 클래스를 따로 정의하지 않고 바로 사용하는 편리함 때문
}
