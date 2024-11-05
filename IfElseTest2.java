/*
测试if—else的嵌套使用

案例：
由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用if-else if-else),并且从小到大输出.
*/

public class IfElseTest2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 9;
        if (num1 >= num2) {
            if (num1 >= num3) {            //此时num1最大
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

//方法2插空法
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
