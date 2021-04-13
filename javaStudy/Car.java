package javaStudy;

public class Car extends Machine {

    String name;
    int number; 

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // public Car(String name) {
    //     System.out.println("Car의 name 생성자입니다.");
    // }



    // 추상클래스 Machine 메서드 구현
    public void turnon() {

    }

    public void turnoff() {

    }
    // 추상 클래스를 상속한 클래스는 추상 클래스가 가진 추상 메서드를 반드시 구현해야 함
    // 하나라도 구현하지 않으면 그 클래스도 추상 클래스가 됨
    // 메서드 안에 아무런 내용이 없더라도 {} 중괄호를 열고 닫으면, 컴파일러는 메서드를 구현했다고 판단
    

    // // (자료형) 타입 필드명
    // String name;
    // int number;

    // // 생성자
    // public Car(String name) {
    //     this.name = name;
    //     // this = "내 구성요소"
    //     // 내 필드 name에 들어온 매개변수 name을 넣어달라는 의미로 사용
    // }

    // // 아무 값도 받지 않는 기본 생성자
    // public Car() {
    //     // this.name = "이름없음";
    //     // this.number = 0;
    //     this("이름없음", 0);     // 생성자에 괄호를 붙이면 자기 자신의 생성자를 의미
    //                             // 자가 자신에 해당 인자를 넣어서 다시 호출
    // }

    // public Car(String name, int number) {
    //     this.name = name;
    //     this.number = number;
    // }

    // public void run() {
    //     System.out.println("달리다.");
    // }

    // public String run(int num) {
    //     return (name + "(이)가 " + num + "km로 달립니다.");
    // }
}
