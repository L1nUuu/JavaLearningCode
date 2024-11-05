/**
 * ClassName: WhileTest
 * Description:
 *
 * @Author linz
 * @Creat 2024/11/3 17:05
 * @Version 1.00
 */
public class WhileTest {
    public static void main(String[] args){

        //需求1：遍历50次HelloWorld
        int i = 1;
        while(i <= 50){
            System.out.println("HelloWorld");
            i++;//一定不要丢了！！
        }

        //需求2：遍历1-100内的偶数，并获取偶数的个数，获取所有偶数的和
        int j = 1;
        int count = 0;
        int sum = 0;
        while(j <= 100){
            if(j % 2 == 0){
                System.out.println(j);
                count++;
                sum += j;
            }
            j++;
        }
        System.out.println("偶数的个数为：" + count);
        System.out.println("偶数之和为：" + sum);
    }
}
