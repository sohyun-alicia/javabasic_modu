package javaStudy;

public class AccessObj {
    // 접근 제한자

    public int p = 3;
    protected int p2 = 4;       
    // protected : 같은 패키지 내에서만 접근을 허용
    // 단, 상속받은 경우에는 접근을 허용

    private int i = 1;
    // private : 자기 자신만 접근 가능

    int k = 2;
    // 접근제한자 없을때(default 접근 지정자) : 패키지 내에서 접근 가능
}
