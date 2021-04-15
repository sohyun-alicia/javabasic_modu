package exercise;
import java.util.Arrays;

public class Divisible {
    public int[] divisible(int[] array, int divisor) {
        // ret에 array에 포함된 정수 중 divisor로 나누어 떨어지는 숫자를 순서대로 넣기
        int resultArraySize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0) {
                resultArraySize++;
            }
        }
        int[] ret = new int[resultArraySize];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0) {
                ret[index++] = array[i];
            }
        }

        return ret;
    }
    // 테스트 출력 코드

    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println(Arrays.toString(div.divisible(array, 5)));
    }
}
