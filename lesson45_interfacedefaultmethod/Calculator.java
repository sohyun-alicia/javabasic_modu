package lesson45_interfacedefaultmethod;

public interface Calculator {
    public int plus(int i, int j);
    public int multiple(int i, int j);

    default int exec(int i, int j) {        // default가 붙은 구현된 메서드 추가 >> 에러 X
        return i + j;
    }

    // default method가 왜 필요할까?
    // 인터페이스를 구현하는 모든 클래스는 해당 메서드를 모두 구현해야함
    // 만약 인터페이스가 변경되면 모든 클래스가 다시 변경사항을 구현해야함
    // 이를 해결하기 위해 인터페이스 내에서 메서드를 구현할 수 있도록 default를 추가함

    public static int exec2(int i, int j) {
        return i * j;
    }
}
