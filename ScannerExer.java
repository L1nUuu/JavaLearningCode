import java.util.Scanner;

/**
 * ClassName: ScannerExer
 * Description:输入功能练习
 *
 * @Author linz
 * @Creat 2024/10/29 13:52
 * @Version 1.00
 */
public class ScannerExer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("你的身高是：(cm)");
        int height = scan.nextInt();

        System.out.print("你的财富是:(千万)");
        double money = scan.nextDouble();

        System.out.print("你是否帅：");
        boolean isHandsome = scan.nextBoolean();
        //如果用string类型接收
        //String isHandsome = scan.next();
        //则判断部分应改为：
        //if(height >= 180 && money >= 1.0 && isHandsome.equals("是"){

        if(height >= 180 && money >= 1.0 && isHandsome){
            System.out.println("我一定要嫁给他！！！");
        }else if(height < 180 && money < 1.0 && !isHandsome){
            System.out.println("不嫁！");
        }else {
            System.out.println("嫁吧，比上不足，比下有余。");
        }
        scan.close();
    }
}
