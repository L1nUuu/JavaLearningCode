/*

����2��Ϊ�ֿ���ˮ��սʿ������ս89Сʱ����̼��㹲�����������Сʱ?

*/




class AriExer1 {
	public static void main(String[] args) {

		int hours = 89;
		int workDay = hours /24;
		int workHour = hours % 24;

		System.out.println("workDay = " + workDay);
		System.out.println("workHour = " + workHour);

		
		//�������ϰ1
		System.out.println("5+5=" + 5 + 5);//5+5=55
		System.out.println("5+5=" + (5 + 5));//5+5=10

		//�������ϰ2
		byte bb1 = 127;
		bb1++;
		System.out.println("bb1 = " + bb1);//-128
		

		//�������ϰ3��
		int i = 1;
		int j = i++ + ++i * i++;
		System.out.println("j = " + j);//10

		
		//�������ϰ4��
		int m = 2;
		m = m++;
		System.out.println("m=" + m);//2




	}
}

