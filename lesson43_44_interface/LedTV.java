package lesson43_44_interface;

public class LedTV implements TV {              // TV 메서드를 구현하겠다는 뜻

    @Override
    public void turnOn() {
        System.out.println("켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("끄다");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨을 조절하다");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("채널을 변경하다");
    }
    
}
