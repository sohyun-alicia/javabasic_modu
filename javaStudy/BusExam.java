package javaStudy;

public class BusExam {
    
    public static void main(String[] args) {
        // Bus bus = new Bus();
        // bus.run();
        // bus.ppangppang();

        // Car car = new Car();
        // car.run();
        // // car.ppangppang();        // 부모는 자식 클래스의 메서드 사용 불가

        Bus bus1 = new Bus("뛰뛰", 3000, 1050);
        if (bus1.name != "뛰뛰") {
            System.out.println("bus의 name이 다릅니다.");
        }
        else if (bus1.number != 3000) {
            System.out.println("bus의 number가 다릅니다.");
        }
        else if (bus1.fee != 1050) {
            System.out.println("bus의 fee가 다릅니다.");
        }
        else {
            System.out.println("정답입니다.");
        }

    }
}
