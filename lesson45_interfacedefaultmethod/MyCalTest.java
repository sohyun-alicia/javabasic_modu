package lesson45_interfacedefaultmethod;

public class MyCalTest {
    
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        System.out.println(cal.plus(3, 4));
        System.out.println(cal.exec(5, 6));

        // cal.exec2(2, 4)                      // This static method of interface Calculator can only be accessed as Calculator.exec2
        int i = Calculator.exec2(2, 4);         // static 메서드는 반드시 인터페이스명.메서드명(); 형식으로만 호출
        System.out.println(i);
    }
}
