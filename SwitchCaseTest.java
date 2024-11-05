/**
 * ClassName: SwitchCaseTest
 * Description:分支结构switch-case
 *
 * @Author linz
 * @Creat 2024/11/1 15:29
 * @Version 1.00
 */


//执行过程：
//根据表达式中的值，依次匹配case语句。一旦与某一个case中的常量相等，那么就执行此case中的执行语句
//执行完此执行语句之后，
//情况1：遇到break，则执行break之后跳出当前的switch-case结构
//情况2：没有遇到break，则继续执行其后的case语句中的执行语句， ----> case穿透
// 直到遇到break或者执行完所有case以及default中的语句，退出当前的switch-case结构。
//说明：
//switch 中的表达式只能是特定的数据类型。如下：byte\short\char\int\枚举（JDK5.0新增）\String(JDK7.0新增)
//case后跟的都是常量，使用表达式与这些常量做相等的判断，不能进行范围的判断。
//default类似于if-else里的else结构，可以省略
//default是可选的，而且位置式灵活的


public class SwitchCaseTest {
    public static void main(String[] args){
        int num = 1;
        switch (num){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
                break;
        }

        String season = "summer";
        switch(season){
            case "spring":
                System.out.println("春天");
                break;
            case "summer":
                System.out.println("夏天");
                break;
            case "autumn":
                System.out.println("秋天");
                break;
            default:
                System.out.println("冬天");
                break;

        }
    }
}
