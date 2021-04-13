package javaStudy;

public class VariableScopeExam {
    int globalScope = 10;       // globalScope변수 사용 범위는 VariableScopeExam 클래스 전체라
    static int staticVal = 7;

    // value 변수는 scopeTest() 매서드 안에서만 사용 가능
    public void scopeTest(int value) {
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2) {
    
        System.out.println(globalScope);
        // System.out.println(localScope);
        // System.out.println(value);
        System.out.println(value2);
    }

    // static : 클래스를 인스턴스화하지 않아도 static한 메서드나 static한 변수 사용 가능
    // static하지 않은 변수(인스턴스 변수)는 사용할 수 없음
    public static void main(String[] args) {
        // System.out.println(globalScope);        // 컴파일 오류
        // System.out.println(localScope);         // 컴파일 오류
        // System.out.println(value);              // 컴파일 오류 >>> 객체를 만들지 않았기 때문

        System.out.println(staticVal);

        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);
        
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);

        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal);
        // static 필드는 인스턴스 생성할때 만들어지지 않음
        // 값을 저장하는 공간 하나만 존재. 즉 값을 공유. >>> 클래스 변수
        // 인스턴스 선언 없이 사용 가능
        // '참조변수.변수명' 보다는 '클래스명.변수명'으로 사용하는게 바람직

        System.out.println(VariableScopeExam.staticVal);

        // globalScope 같은 변수는 인스턴스 생성시 만들어지기 때문에 인스턴스 변수라고 함
    }

}
