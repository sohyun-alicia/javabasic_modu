public class WhileExam {
    public static void main(String[] args) {
        int i = 0;
        int total = 0;

        // 0~9까지 출력
        // while(i < 10) {
        //     System.out.println(i);
        //     i++;
        // }

        // 1~100까지 숫자의 합 구하기
        while(i <= 100) {
            total += i;
            i++;
        }
        System.out.println(total);
    }
}
