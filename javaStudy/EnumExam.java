package javaStudy;

public class EnumExam {
    // 열거형 : 상수를 모아 집합으로 정의
    public static final String MALE = "MALE";       // 상수 변수명은 모두 대문자로 표현함이 관례
    public static final String FEMALE = "FEMALE";
    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        gender1 = "boy";
    }
}
enum Gender{
    MALE, FEMALE;
}