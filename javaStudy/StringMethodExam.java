package javaStudy;

public class StringMethodExam {
    
    public static void main(String[] args) {
        // String str = new String("hello");    // 일반적 객체생성 방법
        String str = "hello";                   // String은 특별하게 생성 가능
        System.out.println(str.length());
        System.out.println(str.concat(" world"));   // 문자열과 문자열을 결합하는 메서드
        System.out.println(str);                // 기존 문자열이 변경되진 않음

        str = str.concat(" world");
        System.out.println(str);

        // substring() : 원하는 부분까지 문자열을 잘라냄
        // 1. str.substring(beginIndex) : beginIndex부터 끝까지
        // 2. str.substring(beginIndex, endIndex) : beginIndex부터 endIndex 전까지(미만)
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));
    }
}
