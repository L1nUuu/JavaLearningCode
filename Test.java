/**
 * ClassName: Test
 * Description:四个数 利用循环求出
 *，
 * @Author linz
 * @Creat 2024/11/4 18:56
 * @Version 1.00
 */
public class Test {
    public static void main(String[] args) {
        for (int i = -100; i <= 100; i++) {
            for (int j = -100; j <= 100; j++) {
                for (int a = 0; a <= 100; a++) {
                    for (int b = -100; b <= 100; b++) {
                        if (i + j == 8 && a - b == 6 && i + a == 14 && j + b == 10) {
                            System.out.println("i = " + i);
                            System.out.println("j = " + j);
                            System.out.println("a = " + a);
                            System.out.println("b = " + b);
                        }
                    }
                }
            }

        }
    }
}