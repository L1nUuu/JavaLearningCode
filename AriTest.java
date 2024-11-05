/*
测试运算符的使用1：算数运算符的使用

1.+ - + - * / % (前)++ (后)++ (前)-- (后)--
自增或自减不改变数据类型

*/

class AriTest{
	public static void main(String[] args){
		int m1 = 12;
		int n1 = 5;
		int k1 = m1/n1;
		System.out.println(k1);//2

		System.out.println(m1 / n1 * n1);//10

		//取模（或取余）：%
		int i1 = 12;
		int j1 =5;
		System.out.println(i1 %j1);//2

		//开发中经常用来判断某个数num1能整除另外一个数num2。num1 % num2 ==0
		//比如：判断num1是否是偶数：num1 % 2 ==0；


		//结论：取模以后，结果与被模数的符号相同。
		int i2 = -12;
		int j2 = 5;
		System.out.println(i2 % j2);//-2


		int i3 = 12;
		int j3 = -5;
		System.out.println(i3 % j3);//2

		int i4 = -12;
		int j4 = -5;
		System.out.println(i4 % j4);//-2

		//(前)++
		//(后)++
		int a1 =10;
		int b1 = ++a1;
		System.out.println("a1 = " +a1 + ",b1 = " +b1);//a1 = 11,b1 = 11
		

		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " +a2 + ",b2 = " +b2);//a2 = 11,b2 = 10

		




		}
	}
