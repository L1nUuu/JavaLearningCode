import java.util.Scanner;

/**
 * ClassName: ScannerTest
 * Description:键盘输入功能的实现
 *
 * @Author linz
 * @Creat 2024/10/29 12:50
 * @Version 1.00
 */

//步骤1：导包 import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args){
        //步骤2：提供（或创建）一个Scanner类的实例
        Scanner scan = new Scanner(System.in);

        System.out.println("欢迎光临无畏契约");
        System.out.print("请输入你的id：");
        //步骤3：调用Scanner类中的方法，获取指定类型的变量
        String name = scan.next();

        System.out.print("请输入你的年龄：");
        int age = scan.nextInt();

        System.out.print("请输入你的体重：");
        double weight = scan.nextDouble();

        System.out.print("请输入你是否单身 是true 不是false ：");
        boolean single = scan.nextBoolean();

        System.out.print("请输入你的性别：（男/女）");
        char gender = scan.next().charAt(0);

        System.out.println("id为：" + name);
        System.out.println("体重为：" + weight);
        System.out.println("单身情况：" + single);
        System.out.println("性别：" + gender);

        scan.close();//关闭资源，调用Scanner类的close()
    }
}
//注意：Scanner类中提供了获取byte、short、int、long、float、double、boolean、String类型变量的方法。
//没有提供获取char类型变量的方法。需要使用next.charAt()