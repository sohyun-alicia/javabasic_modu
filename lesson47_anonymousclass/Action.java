package lesson47_anonymousclass;

public abstract class Action {
    public abstract void exec();

    // Action은 추상클래스로 객체 자체를 생성하지 않음
    // 반드시 자식 클래스 필요(MyAction)
}
