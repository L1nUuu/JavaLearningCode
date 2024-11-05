/**
 * ClassName: IfElseExer
 * Description:编写程序，声明两个double类型并赋值。判断第一个数大于10.0，且第二个数小于20.0，打印两数之和。否则，打印两数的乘积。
 *
 * @Author linz
 * @Creat 2024/10/28 19:25
 * @Version 1.00
 */
public class IfElseExer {
    public static void  main(String[] args){
        double num1 = 11.0;
        double num2 = 12.8;
        if(num1 >= 10.0 && num2 <= 20.0){
            System.out.println(num1 + num2);
        }else{
            System.out.println(num1 * num2);
        }
    }
}
