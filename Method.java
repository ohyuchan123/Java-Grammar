package Grammar;
/*�޼ҵ� ����*/
/*���������� ��ȯŸ�� �޼ҵ��̸�(�Ű��������) {
 *  // �����
 *  // ������
 *  }*/
class Car{
	private int currentSpeed;
    private int accelerationTime;
    
    public void accelerate(int speed, int second) { // �����
        // ������
        System.out.println(second + "�ʰ� �ӵ��� �ü� " + speed + "(��)�� ������!!");
    }
}
public class Method {
	public static void main(String[] args) {
		/*�޼ҵ�(method)*/
		/*�ڹٿ��� Ŭ������ ���(member)�� �Ӽ��� ǥ���ϴ� �ʵ�(field)�� ����� ǥ���ϴ� �޼ҵ�(method)�� �����ϴ�.
		 * ���߿��� �޼ҵ�(method)�� ��� Ư�� �۾��� �����ϱ� ���� ��ɹ��� �����̶� �� �� �ֽ��ϴ�.*/
		
		/*�޼Ҵ� ȣ��*/
		/*1. ��ü���������̸�.�޼ҵ��̸�();
		 *  �Ű������� ���� �޼ҵ��� ȣ��
		 *2. ��ü���������̸�.�޼ҵ��̸�(�μ�1, �μ�2, ...); // �Ű������� �ִ� �޼ҵ��� ȣ��*/
		
	      Car myCar = new Car();   // ��ü ����
	      myCar.accelerate(60, 3); // �޼ҵ� ȣ��
		
	}
}
