package javaStudy;

public class Car1 {
    String name;
    int number;

    public Car1() {
        // this.name = "이름없음";
        // this.number = 0;
        this("이름없음", 0);
    }

    public Car1(String name) {
        // this.name = name;
        // this.number = 0;
        this(name, 0);
    }

    public Car1(String name, int number) {
        this.name = name;
        this.number = number;
    }

}

