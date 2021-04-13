package javaStudy;

public class Bus extends Car {

    // super와 부모 생성자 실습
    int fee;
    public Bus(String name, int number, int fee) {
        super(name, number);
        this.fee = fee;
    }

    public void ppangppang() {
        System.out.println("빵빵");
    }
}
