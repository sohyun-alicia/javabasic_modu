package lesson42_classtypeconversion;

public class VanExam {
    public static void main(String[] args) {
        // 묵시적 형변환
        Car c = new Van();              
        c.run();

        // class는 Car, 생성자는 Van. 
        // Car형 변수 c가 Van의 인스턴스를 가리킴.
        // Car형이긴 하지만, 실제로 생성된 객체는 Van

        // c.ppangppang();          
        // 부모타입으로 자식을 가리켰을때는 부모가 가진 메서드만 사용 가능
        // 이럴때는 형변환을 하면 자식 메서드를 사용할 수 있음

        // Van van = c;        // Type mismatch: cannot convert from Car to Van
        // c는 Car형이기 때문에 그보다 작은 Van형이 가리킬 수 없음

        Van van = (Van) c;
        van.run();
        van.ppangppang();


    }
}
