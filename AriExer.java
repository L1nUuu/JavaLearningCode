/*
�������һ����������ӡ��ʾ���ĸ�λ����ʮλ������λ����ֵ��
��ʽ���£�
����XXX��������£�
��λ����
ʮλ����
��λ����

���磺
����153��������£�
��λ����3
ʮλ����5
��λ����1



*/

class AriExer {
	public static void main(String[] args) {
		
		int num = 153;
		int ge = num % 10;
		int shi = num % 100 / 10;
		int bai = num / 100 % 10;
		System.out.println("����153��������£�");
		System.out.println("��λ����" + ge);
		System.out.println("ʮλ����" + shi);
		System.out.println("��λ����" + bai);


	}
}
