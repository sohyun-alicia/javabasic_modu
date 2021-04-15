package exercise;

public class StringExercise {
    String getMiddle(String word) {
        int index = word.length() / 2;
        if (word.length() % 2 == 0) {
            return word.substring(index-1, index+1);
        }else {
            return word.substring(index, index+1);

        }
    }

    // 출력 코드
    public static void main(String[] args) {
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
        System.out.println(se.getMiddle("test"));

    }
}
