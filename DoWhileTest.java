import java.util.Scanner;

/**
 * ClassName: DoWhileTest
 * Description:题目:模拟ATM取款
 * 声明变量balance并初始化为0用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
 * =======-ATM====--=
 * 1、存款
 * 2、取款
 * 3、显示余额
 * 4、退出
 * 请选择(1-4):
 *
 * @Author linz
 * @Creat 2024/11/4 14:26
 * @Version 1.00
 */
public class DoWhileTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double balance = 0.0;//记录账户余额
        boolean isIn = true;
        do{
            //声明ATM取款的界面
            System.out.println("=======-ATM====--=");
            System.out.println("1、存款");
            System.out.println("2、取款");
            System.out.println("3、显示余额");
            System.out.println("4、退出");
            System.out.print("请选择(1-4):");
            int operate = scan.nextInt();//实例化operate
            switch (operate){
                case 1:
                    System.out.print("请输入存款金额：");
                    double money1 = scan.nextDouble();
                    if(money1 > 0.0) {
                        balance += money1;
                        System.out.println("存款成功！！！");
                    }else {
                        System.out.println("输入错误");
                    }
                    break;
                case 2:
                    System.out.print("请输入取款金额：");
                    double money2 = scan.nextDouble();
                    if(money2 > 0 && money2 <= balance){
                        balance -= money2;
                        System.out.println("取款成功！！！");
                    }else{
                        System.out.println("输入错误或余额不足");
                    }
                    break;
                case 3:
                    System.out.println("目前账户余额为：" + balance);
                    break;
                case 4:
                    isIn = false;
                    break;
                default:
                    break;
            }
        }while(isIn);
        scan.close();
    }
}
