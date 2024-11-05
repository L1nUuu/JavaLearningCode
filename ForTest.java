/**
 * ClassName: ForTest
 * Description:
 *
 * @Author linz
 * @Creat 2024/11/3 13:46
 * @Version 1.00
 */
public class ForTest {
    public static void main(String[] args){
        //需求1：输出5行我是帅哥
        for(int i = 1;i <= 5;i++){
            System.out.println("我是帅哥");
        }
        //需求2：
        int num = 1;
        for(System.out.println("a");num < 3; System.out.println("c"),num++){
            System.out.println("b");
            //猜测输出 a b c b c
        }
        //需求3：遍历1-100以内的偶数，并获取偶数的个数，获取所有偶数的和
//        int num1 = 0;
//        int sum = 0;
//        for(int j = 2;j <= 100;j += 2){
//            num1++;
//            sum += j;
//        }
//        System.out.println(num1);
//        System.out.println(sum);  //这是我自己写的

        //标准答案如下
        int count  = 0;//记录偶数的个数
        int sum = 0;//记录偶数之和
        for(int i = 1;i <= 100;i++){
            if(i %2 == 0){
                count++;
                sum += i;
            }
        }
        System.out.println("1-100以内偶数的个数为：" + count + ",偶数的和为：" + sum);

    }
}
