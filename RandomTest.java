/**
 * ClassName: RandomTest
 * Description:获取一个随机数
 *
 * @Author linz
 * @Creat 2024/11/1 15:05
 * @Version 1.00
 */


//1.可以使用Java提供的API:Math类的random()

//2.random调用以后，会返回一个[0.0,1.0)范围内的double型的随机数

//3.需求1：获取一个[0,100]范围内的随机整数？
public class RandomTest {
    public static void main(String[] args){
        double d1 = Math.random();
        System.out.println(d1);
        //获取一个[0,100]范围内的随机整数
        int randomInt1 = (int)(Math.random() * 101);//[0.0,1.0) ---> [0.0,101.0) ---> [0.0,100]

        //获取一个[1,100]范围内的随机整数
        int randomInt2 = (int)(Math.random() * 100 + 1);//[0.0,1.0) ---> [0.0,100.0) ---> [0,99] ---> [1,100]

        //获取一个[a,b]范围内的随机整数
        //int randomInt3 = (int)(Math.random() * (b - a + 1) + a);
    }
}
