import java.util.Scanner;

/**
 * ClassName: ForExer1
 * Description:For循环练习2
 *
 * @Author linz
 * @Creat 2024/11/3 15:55
 * @Version 1.00
 */

//输入两个正整数m和n,求其最大公约数和最小公倍数。（结合break的使用）
public class ForExer1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入m：");
        int m = scan.nextInt();
        System.out.println("请输入n：");
        int n = scan.nextInt();
//        //方式1：自己写的
//        int gcd = 0;//初始化最大公约数
//        for(int i = 1;i <= ((m>n)?n:m);i++){
//            if(m % i == 0 && n % i ==0) {
//                gcd = i;
//            }
//        }
//        System.out.println("最大公约数是：" + gcd);

//        int lcm = 0;//初始化最小公倍数
//        for(int i = 1;;i++){
//            lcm = gcd * i;
//            if(lcm % m == 0 && lcm % n == 0){
//                System.out.println("最小公倍数是：" + lcm);
//                break;}

        //方式2：
        int max = 0;
        for(int i = (m>n)?n:m;i >= 1;i--){
            if(m % i == 0 && n % i == 0){
                System.out.println("最大公约数为：" + i);
                max = i;
                break;//一旦执行就跳出当前循环
            }
        }

        //最小公倍数为：
        int lcm = m * n / max;
        System.out.println("最小公倍数是：" + lcm);

        }
}
