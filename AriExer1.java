/*

案例2：为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时?

*/




class AriExer1 {
	public static void main(String[] args) {

		int hours = 89;
		int workDay = hours /24;
		int workHour = hours % 24;

		System.out.println("workDay = " + workDay);
		System.out.println("workHour = " + workHour);

		
		//额外的练习1
		System.out.println("5+5=" + 5 + 5);//5+5=55
		System.out.println("5+5=" + (5 + 5));//5+5=10

		//额外的练习2
		byte bb1 = 127;
		bb1++;
		System.out.println("bb1 = " + bb1);//-128
		

		//额外的练习3：
		int i = 1;
		int j = i++ + ++i * i++;
		System.out.println("j = " + j);//10

		
		//额外的练习4：
		int m = 2;
		m = m++;
		System.out.println("m=" + m);//2




	}
}

