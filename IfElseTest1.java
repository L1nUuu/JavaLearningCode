/*��С���μ�Java���ԣ����͸�������Ⱥ��ɳ�ŵ:���:
�ɼ�Ϊ100��ʱ������һ���ܳ�;�ɼ�Ϊ(88��99]ʱ������һ��ɽ�����г�;���ɼ�Ϊ[60,80]ʱ����������Ӱ��һ����;����ʱ������һ�١�
˵��:Ĭ�ϳɼ�����[0,100]��Χ��
*/


class IfElseTest1 {
	public static void main(String[] args) {
		int grade = 59;
		if (grade == 100){
			System.out.println("����һ���ܳ�");
		} 
		else if (grade >80 && grade <= 99){
			System.out.println("����һ��ɽ�����г�");
		}
		else if (grade >= 60 && grade <= 80){
			System.out.println("��������Ӱ��һ����");
		}
		else{
			System.out.println("����һ��");
		}
	}
}


/*class IfElseTest1 {
	public static void main(String[] args) {
		int grade = 59;
		if (grade == 100){
			System.out.println("����һ���ܳ�");
		} 
		else if (grade >80){
			System.out.println("����һ��ɽ�����г�");
		}
		else if (grade >= 60){
			System.out.println("��������Ӱ��һ����");
		}
		else{
			System.out.println("����һ��");
		}
	}
}
*/