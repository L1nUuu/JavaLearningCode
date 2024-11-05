/*
测试运算符的使用5：位运算符

1.<<  >>  >>>  &  |  ^  ~

2.说明：

①<<  >>  >>>  &  |  ^  ~ ：针对数值类型的变量或常量进行计算，运算的结果也是数值。
②<< ：每向左移动一位，结果就在原有的基础上*2.（对于正数、都适用）


*/


class BitTest{
	public static void main(String[] args) {
		int num1 = 7;
		System.out.println("num1 << 1 : " + (num1 << 1));
		System.out.println("num1 << 2 : " + (num1 << 2));
		System.out.println("num1 << 2 : " + (num1 << 2));

	}
}
