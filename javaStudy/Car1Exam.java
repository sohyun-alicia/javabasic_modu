package javaStudy;

public class Car1Exam {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        Car1 car2 = new Car1("자동차");
        Car1 car3 = new Car1("자동차", 1234);

        System.out.println(car1.name + ", " + car1.number);
        System.out.println(car2.name + ", " + car2.number);
        System.out.println(car3.name + ", " + car3.number);

    }
}
