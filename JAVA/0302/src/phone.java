
public class phone {
	//Ŭ������ >>  ����� ������ �ڷ����̴� !
	//>> ���ǿ� �ִ� ��ü�� ǥ��(����)�� �� �ִ� ����� ������ �ڷ���(�ڷ�Ÿ�� type)�̴�.
	
	
	//�޴��� �ϸ� ��� ����������?
	//1.��ȭ�� �ɴ�. 2. ��ȭ�� �޴�. 3.�귣�� 4.������ �ϴ� 5.��ȭ��ȣ 
	//���� 5���������� �ϴ� � ���� �ִٸ� �װ� �޴����̶�� Ī�� �� �ִ�!
	
	//data�� ����� ���� �и�!
	//data-�귣�� , ��ȭ��ȣ / ��� - ��ȭ�� �ɴ� , ��ȭ�� �޴�, ������ �ϴ�
	String brand = "�Ｚ";
	//���������� private --> �ش� Ŭ������������ ������ �����ϰԲ�! ������ ����Ұſ���  
	String number = "01023130752";
	
	//����� �ڵ�� ǥ�� -->�޼ҵ�� ������ָ��!(��������λ����°Ŵѱ�)
	//����Ŭ���� �� �ٸ� Ŭ���������� �޼ҵ带 ���鶧 static�� �Ⱥٿ����ȴ�!
	public void call() {
		System.out.println("��ȭ�� �ɴ�");
	}
	public void send() {
		System.out.println("��ȭ�� �޴�");
	}
	public void game() {
		System.out.println("����Ϲ�׸��ϴ�");
	}
}