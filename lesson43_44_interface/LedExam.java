package lesson43_44_interface;

public class LedExam {
    
    public static void main(String[] args) {
        TV tv = new LedTV();                // 인터페이스(TV)도 타입이 될 수 있음
        tv.turnOn();
        tv.changeVolume(8);
        tv.changeChannel(39);
        tv.turnOff();

        // TV인터페이스는 타입이 될 수 있지만 TV가 가진 기능만 사용 가능
        // 만약 LedTV가 TV에 없는 기능을 확장해서 사용하고 싶다면 클래스 형변환을 이용

        TV tv = new LcdTV();
    }
    
}
