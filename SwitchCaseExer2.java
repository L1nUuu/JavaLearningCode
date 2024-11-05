import java.util.Scanner;

/**
 * ClassName: SwitchCaseExer2
 * Description:随机产生3个1-6的整数，如果三个数相等，那么称为"豹子"，如果三个数之和大于9，称为“大”，如果三个数之和小于等于9，称为“小”，用户从键盘输入押的是“豹子”、“大”、“小”，并判断是否猜对了
 *
 * @Author linz
 * @Creat 2024/11/1 19:07
 * @Version 1.00
 */
public class SwitchCaseExer2 {
    public  static void main(String[] args){
        int num1 = (int)(Math.random() * 6 + 1);
        int num2 = (int)(Math.random() * 6 + 1);
        int num3 = (int)(Math.random() * 6 + 1);
        Scanner scan = new Scanner(System.in);
        System.out.println("请押宝：");
        String guess = scan.next();
        boolean isTrue = true;
        switch (guess){
            case "豹子":
               isTrue = num1 == num2 && num2 == num3;
               break;
            case "大":
               isTrue = (num1 + num2 + num3) > 9;
               break;
            case "小":
               isTrue = (num1 + num2 + num3) <= 9;
               break;
            default:
                System.out.println("输入有误！");
        }
        System.out.println("num1,num2,num3分别是：" + num1 + "," + num2 + "," + num3);
        System.out.println(isTrue ? "猜中了" : "猜错了");
        scan.close();
    }
}
