/*
����if��else��Ƕ��ʹ��

������
�ɼ����������������ֱ�������num1��num2��num3�������ǽ�������(ʹ��if-else if-else),���Ҵ�С�������.
*/

public class IfElseTest2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 9;
        if (num1 >= num2) {
            if (num1 >= num3) {            //��ʱnum1���
                {
                    if (num2 >= num3) {
                        System.out.println(num3 + "," + num2 + "," + num1);
                    } else {
                        System.out.println(num2 + "," + num3 + "," + num1);
                    }
                }
            } else {
                System.out.println(num2 + "," + num1 + "," + num3);
            }
        } else {
            if (num2 >= num3) {
                if (num3 >= num1) {
                    System.out.println(num1 + "," + num3 + "," + num2);
                } else {
                    System.out.println(num3 + "," + num1 + "," + num2);
                }
            } else {
                System.out.println(num1 + "," + num2 + "," + num3);
            }
        }
    }
}

//����2��շ�
    public  class IfElseTest2 {
        public static void main(String[] args){
            int a = 121;
            int b = 30;
            int c = 10;
            if (a >= b){
                if(c >= a){
                    System.out.println(b + "," + a + "," + c);
                }else if(c < b){
                    System.out.println(c + "," + b + "," + a);
                }else{
                    System.out.println(b + "," + c + "," + a);

                }
            }
            else{
                if(c >= b){
                    System.out.println(a + "," + b + "," + c);
                }else if(c < a){
                    System.out.println(c + "," + a + "," + b);
                }else{
                    System.out.println(a + "," + c + "," + b);
                }
            }
        }
}
