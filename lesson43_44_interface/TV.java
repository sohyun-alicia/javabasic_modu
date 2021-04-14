package lesson43_44_interface;

// TV의 각 기능을 구현하진 않고, 기능들만 쭉 선언해 가지고 있는 것 = '인터페이스'
// 구현이 하나도 없기때문에 인터페이스 자체가 객체를 생성하지는 못함
public interface TV {

    public int MIN_VOLUME=0;
    public int MAX_VOLUME=100;          // final 키워드가 없어도 상수로 사용 가능

    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}
