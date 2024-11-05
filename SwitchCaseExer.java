import java.util.Scanner;

/**
 * ClassName: SwitchCaseExer
 * Description:使用switch-case实现：对学生成绩大于60分的，输出合格，低于60分的，输出不合格
 *
 * @Author linz
 * @Creat 2024/11/1 17:50
 * @Version 1.00
 */
public class SwitchCaseExer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        /*方法一：枚举
        方法二：
        switch (grade/10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
            case 6:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
            default:
                System.out.println("输入错误");
        */


        //方法三：
        switch (grade/60){
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
            default:
                System.out.println("输入错误");


        }
        scan.close();
    }
}
