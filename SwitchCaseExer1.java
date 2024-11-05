import java.util.Scanner;

/**
 * ClassName: SwitchCaseExer1
 * Description:
 *
 * @Author linz
 * @Creat 2024/11/1 18:10
 * @Version 1.00
 */
public class SwitchCaseExer1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入2023年的月份：");
        int month = scan.nextInt();
        System.out.print("请输入2023的天数：");
        int day = scan.nextInt();
        int totalDay = 0;
        //方式1：不推荐
        /*switch (month){
            case 1:
                totalDay = day;
                break;
            case 2:
                totalDay = 31 + day;
                break;
            case 3:
                totalDay = 31 + 28 + day;
                break;
            case 4:
                totalDay = 31 + 28 + 31 +day;
                break;
            //...
            case 12:
                totalDay = 31 + 28 + 31 + ... + 30 + day;
                break;
            default:
                System.out.println("输入月份错误");

        }*/

        //方式2：
        switch(month){
            case 12:
                totalDay += 30;
            case 11:
                totalDay += 31;
            case 10:
                totalDay += 30;
            case 9:
                totalDay += 31;
            case 8:
                totalDay += 31;
            case 7:
                totalDay += 30;
            case 6:
                totalDay += 31;
            case 5:
                totalDay += 30;
            case 4:
                totalDay += 31;
            case 3:
                totalDay += 28;//2月份的28天
            case 2:
                totalDay += 31;//1月份的31天
            case 1:
                totalDay += day;
                break;
            default:
                System.out.println("输入月份错误");
        }
        System.out.println(totalDay);
        scan.close();
    }
}
