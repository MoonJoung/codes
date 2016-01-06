
public class Generic {
//�ϳ��� �پ��� Ÿ���� �ٷ�� �� (Int, String, Double ��) => ��Ӱ� ���������� 
/* ���
 * Computer (man,proc,ram,disk,procSeed) �̰�, Notebook�� Computer�� ���
 * -> Notebook extends Computer & �����ڿ� super(man,proc,ram,disk,procSeed) //�����ڳ� ù ����
 *                                -> �����ڰ� ������ �ڵ����� �� ������ ���� ����
 *                                -> super��� ������, �� �����ڵ� ������ ���� (����!)
 * if(Computer tmp = new Notebook()) �̸�, tmp.toString() ��, Notebook�� toString�� ���� (�������ε�)
*/
	
	public static void main(String[] args) {
		
		//autoboxing : ���� -> Integer ��ü��
		//Stack theStack = new Stack();
 		//theStack.push(10);
 		
 		//unboxing : Integer ��ü -> ����
 		//int a = (Integer)theStack.pop();
	}

	//equals �������̵� Ʋ  => ������ ���� ����� �Ϳ� ���缭
	@Override
	public boolean equals(Object obj){
		//���� ��ü��
		if(this.getClass() == obj.getClass())
			return true;
		return false;
	}
}
