class VariableTest{
	public static void main(String[] args){
		
		//1.�������ͱ�����ʹ��
		//byte(1�ֽ�=8bit) short(2byte) int(4byte) long(8byte)
		byte b1 = 12;
		byte b2 = 127;
		//���벻ͨ������Ϊ������byte�Ĵ洢��Χ
		//byte b3 = 128;

		short s1 = 1234;

		int i1 = 1232234132;
		//�� ����long���ͱ���ʱ����Ҫ�ṩ��׺����׺Ϊ"l"��"L"
		long l1 = 123123123L;

		//�� �����У��������ͱ���һ��û�������������int

		//2.���Ը�����(float double)
		//�� ����float���ͱ���ʱ�����ṩ��׺'f'��'F'
		float f1 = 12.3f;
		System.out.println("f1 = " + f1);
		
		//�� �����У���Ҷ��帡����ʱ��һ����double����Ϊ���ȸ���
		
		//�� float���ͱ�����ΧҪ����long���͵ı�����Χ�����Ǿ��Ȳ��ߡ�
		//  ����ڿ�������Ҫ���ߵľ��ȣ���Ҫʹ��BigDecimal���滻�����ͱ�����
		//����1
		System.out.println(0.1 + 0.2);
		
				
		//����2
		float ff1 = 123123123f;
		float ff2 = ff1 + 1;
		System.out.println(ff1);
		System.out.println(ff2);
		System.out.println(ff1 == ff2);
	}
}