/*
�����������ʹ��1�������������ʹ��

1.+ - + - * / % (ǰ)++ (��)++ (ǰ)-- (��)--
�������Լ����ı���������

*/

class AriTest{
	public static void main(String[] args){
		int m1 = 12;
		int n1 = 5;
		int k1 = m1/n1;
		System.out.println(k1);//2

		System.out.println(m1 / n1 * n1);//10

		//ȡģ����ȡ�ࣩ��%
		int i1 = 12;
		int j1 =5;
		System.out.println(i1 %j1);//2

		//�����о��������ж�ĳ����num1����������һ����num2��num1 % num2 ==0
		//���磺�ж�num1�Ƿ���ż����num1 % 2 ==0��


		//���ۣ�ȡģ�Ժ󣬽���뱻ģ���ķ�����ͬ��
		int i2 = -12;
		int j2 = 5;
		System.out.println(i2 % j2);//-2


		int i3 = 12;
		int j3 = -5;
		System.out.println(i3 % j3);//2

		int i4 = -12;
		int j4 = -5;
		System.out.println(i4 % j4);//-2

		//(ǰ)++
		//(��)++
		int a1 =10;
		int b1 = ++a1;
		System.out.println("a1 = " +a1 + ",b1 = " +b1);//a1 = 11,b1 = 11
		

		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " +a2 + ",b2 = " +b2);//a2 = 11,b2 = 10

		




		}
	}
