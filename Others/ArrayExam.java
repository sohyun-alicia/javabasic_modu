public class ArrayExam {
    public static void main(String[] args) {
        // 정숫값 100개를 저장할 수 있는 int형 배열 array1
        // int[] array1 = new int[100];

        // array1[0] = 50;
        // array1[10] = 100;

        // Array 배열 만드는 법
        // int[] array2 = new int[]{1, 2, 3, 4};
        // int[] array3 = {1, 2, 3, 4};
        // int[] li = array2;

        // System.out.println(array3);
        // System.out.println(li);
        // System.out.println(array3[3]);
        // System.out.println(array2[0]);

        int[] iarray = new int[100];

        // iarray에 1~100까지 숫자 넣기
        for (int i = 0; i < iarray.length; i++) {
            iarray[i] = i + 1;
        }

        // iarray 내의 숫자 출력하기
        System.out.print("print: ");
        for (int i = 0; i < iarray.length; i++) {
            System.out.print(iarray[i]+" ");
        }
        
        // 전체 합계 출력
        int total = 0;
        for (int i = 0; i < iarray.length; i++) {
            total += i;
        }
        System.out.println("\ntotal: " + total);
    }
}
