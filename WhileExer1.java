/**
 * ClassName: WhileExer1
 * Description:世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
 *             请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 *
 * @Author linz
 * @Creat 2024/11/4 13:24
 * @Version 1.00
 */
public class WhileExer1 {
    public static void main(String[] args){
        double thickNess = 0.0001;
        double high = 8848.86;
        int foldCount = 0;
        while(thickNess < high){
            thickNess *= 2;
            foldCount++;
        }
        System.out.println("要折叠" + foldCount + "次");
    }
}
