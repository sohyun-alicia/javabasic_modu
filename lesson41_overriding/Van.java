package lesson41_overriding;

public class Van extends Car {
    public void run() {
        super.run();                            // 부모 메서드 run 호출
        System.out.println("Van의 run 메서드");
    }
    
}
