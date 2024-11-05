/**
 * ClassName: ForExer
 * Description:For循环的练习
 *
 * @Author linz
 * @Creat 2024/11/3 15:40
 * @Version 1.00
 */

//输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
public class ForExer {
    public static void main(String[] args){
        int ge = 0;
        int shi = 0;
        int bai = 0;
        for(int i = 100;i < 1000; i++){
            bai = i / 100;
            shi = i % 100 / 10;
            ge = i % 10;
            if((bai * bai * bai + shi * shi * shi + ge * ge * ge) == i ){
                System.out.println(i);
            }
        }
    }
}
