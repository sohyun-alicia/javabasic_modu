package javaStudy;

public class CarExam {
    

    public static void main(String[] argv){
        Car c1 = new Car();         // c1은 참조변수.
        // Car c2 = new Car();         // 참조변수 다음에 마침표를 입력하면 참조변수가 참조하는 객체가 가진걸 활용 가능
    
        // c1.name = "소방차";
        // c1.number = 1234;

        // c2.name = "구급차";
        // c2.number = 1111;

        // System.out.println(c1.name);
        // System.out.println(c1.number);
        // System.out.println(c2.name);
        // System.out.println(c2.number);

        if (c1 instanceof Machine) {
            System.out.println("Car가 Machine을 상속받았습니다.");
        }else {
            System.out.println("Car가 Machine을 상속받지 않았습니다.");
        }
    }
}
