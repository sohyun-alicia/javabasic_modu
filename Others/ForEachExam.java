public class ForEachExam {
    public static void main(String[] args) {

        // foreach 문
        // for(형과 값을 받아줄 변수명:출력하고 싶은 자료구조)
        int[] iarr = {10, 20, 30, 40, 50};
        for (int value:iarr) {
            System.out.println(value);
        }


        // for (int i = 0; i < iarr.length; i++) {
        //     int value = iarr[i];
        //     System.out.println(value);
        // }
    }
}
