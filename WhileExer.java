import java.util.Scanner;

/**
 * ClassName: WhileExer
 * Description:随机生成一个100以内的数，猜这个随机数是多少?
 *             键盘输入数，如果大了，提示大了;如果小了，提示小了:如果对了，就不再猜了，并统计一共猜了多少次。
 *
 * @Author linz
 * @Creat 2024/11/4 12:01
 * @Version 1.00
 */
public class WhileExer {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100 + 1);
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入1-100以内的整数：");
        int guess = scan.nextInt();
        int count = 1;
        while(guess != num){
            if(guess > num){
                System.out.println("大了");
                guess = scan.nextInt();
                count++;
            }else{
                System.out.println("小了");
                guess = scan.nextInt();
                count++;
            }
        }
        System.out.println("猜对了！");
        System.out.println("一共猜了" + count + "次");
        scan.close();

    }
}