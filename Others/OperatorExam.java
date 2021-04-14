public class OperatorExam {
    
    public static void main(String[] args) {
        // int i1 = -5;
        // int i2 = +i1;
        // int i3 = -i1;
        // int i4 = ++i3;
        // int i5 = i3++;
        
        // System.out.println("i1: "+i1);
        // System.out.println("i2: "+i2);     //  ‘+’는 부호 비트를 그대로 유지, ‘-’는 음수를 양수로, 양수를 음수로 변경
        // System.out.println("i3: "+i3);
        // System.out.println("i4: "+i4);
        // System.out.println("i5: "+i5);

        int i1 = -5;
        System.out.println("i1: "+i1);

        int i2 = +i1;
        System.out.println("i2: "+i2); 

        int i3 = -i1;
        System.out.println("i3: "+i3);

        int i4 = ++i3;
        System.out.println("i4: "+i4);

        int i5 = i3++;
        System.out.println("i5: "+i5);
        

        
    }
}
