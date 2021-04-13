package javaStudy;

public class DuckExam {
    
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sing();
        duck.fly();

        // Bird b = new Bird();        
        //  Cannot instantiate the type Bird
        // 추상클래스는 인스턴스를 생성할 수 없다. 부모 클래스로서의 역할만 가능.
    }
}
