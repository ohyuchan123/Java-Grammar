package Grammar;
class A{
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    A(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
}
class B {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    B(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    B() {
        this("�ҳ�Ÿ", 2012, "������", 160); // �ٸ� �����ڸ� ȣ����.
    }
    public String getModel() {
        return this.modelYear + "��� " + this.modelName + " " + this.color;
    }
}
public class this_this {
	public static void main(String[] args) {
		/*this ���� ����*/
		/*this ���� ������ �ν��Ͻ��� �ٷ� �ڱ� �ڽ��� �����ϴ� �� ����ϴ� ���� �Դϴ�
		 *�̷��� this ���� ������ �ش� �ν��Ͻ��� �ּҸ� ����Ű�� �ֽ��ϴ�*/
		
		
		/*this() �޼ҵ� */
		/*this() �޼ҵ�� ������ ���ο����� ����� �� ������ ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����մϴ�*/
		/*this() �޼ҵ忡 �μ��� �����ϸ�, ������ �߿��� �޼ҵ� �ñ״�ó�� ��ġ�ϴ� �ٸ� �����ڸ� ã�� ȣ���� �ݴϴ�*/
		B tcpCar = new B(); System.out.println(tcpCar.getModel());
	}
}
