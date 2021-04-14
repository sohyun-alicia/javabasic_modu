public class ReferenceDataType {

    // 기본형 : 논리형(boolean), 문자형(char), 정수형(byte, short, int, long), 실수형(float, double)
    // 참조형 : 기본형 제외 모두 ex) 클래스, 배열 등

    
    public static void main(String[] args) {
        int i = 4;

        String str1 = "hello";          // 상수들을 저장하는 영역에 저장
        String str2 = "hello";          // 상수들을 저장하는 영역에 저장
        // str1와 str2는 같은 인스턴스를 가리킴. 같은 인스턴스를 참조.
        String str3 = new String("hello");
        String str4 = new String("hello");      
        // new를 사용하면 같은 문자열이어도 매번 메모리에 새롭게 할당
        // new라고 나오는 순간 인스턴스를 무조건 힙(heap) 메모리 영역에 새로 만듦

        // 힙(heap) 메모리 영역이란 할당해야 할 메모리의 크기를 
        // 프로그램을 실행하는 동안 결정해야 하는 경우(런타임 때) 사용되는 공간
        // 기본 데이터 타입은 항상 크기가 동일하지만, 객체들은 생성 시에 크기가 다를 수 있으므로 힙에 생성

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        if (str1 == str2){
            System.out.println("str1과 str2의 주소가 같습니다.");
        }else{
            System.out.println("str1과 str2의 주소가 다릅니다.");
        }

        if (str3 == str4){
            System.out.println("str3과 str4의 주소가 같습니다.");
        }else{
            System.out.println("str3과 str4의 주소가 다릅니다.");
        }

        if (str3.equals(str4)){
            System.out.println("str3과 str4의 주소가 같습니다.");
        }else{
            System.out.println("str3과 str4의 주소가 다릅니다.");
        }
    }
}

//The hashcode() method is a non-final instance method, 
// and should be overridden in any class where the equals(Object) is overridden. 
// By contrast, identityHashCode(Object) is a static method and therefore cannot be overridden.

// The identityHashCode(Object) method gives you a identifier for an object 
// which can (in theory) be used for other things than hashing and hash tables. 
// (Unfortunately, it is not a unique identifier, but it is guaranteed to never change for the lifetime of the object.)
