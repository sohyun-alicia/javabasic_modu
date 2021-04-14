public class ForExam {
    public static void main(String[] args) {

        // 1~100의 숫자 중에 짝수의 합 구하기
        // int total = 0;
        // for (int i = 1; i <= 100; i++) {
        //     if (i % 2 != 0) {
        //         continue;
        //     }
        //     total = total + i;
        // }
        // System.out.println(total);


        // 1~100까지 숫자중 짝수만 출력
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
