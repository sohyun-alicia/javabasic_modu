package javaStudy;

public class MyClassExam {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.method1();

        myclass.method2(10);

        // myclass.method3();           // m3의 리턴값을 받아줄 변수 필요
        int value = myclass.method3();
        System.out.println("m3가 리턴한 값: " + value);

        myclass.method4(5, 10);
        
        // int value2 = myclass.method5(55);
        // System.out.println("m5가 리턴한 값: " + value2);
        System.out.println("m5가 리턴한 값: " + myclass.method5(100));
    }
}
