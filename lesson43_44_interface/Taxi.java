package lesson43_44_interface;

public class Taxi implements Meter {        // Meter 인터페이스 구현 "implements Meter"
    public int BASE_FARE = 3000;
    public void start() {                   // Meter의 메서드 반드시 구현
        System.out.println("운행을 시작합니다.");
    }

    public int stop(int distance) {
        int fare = BASE_FARE + distance * 2;
        System.out.println("운행을 종료합니다. 요금은" + fare + "원입니다.");
        return fare;
    }
}
