package Grammar;
class A{}
class B extends A{}
public class Other_Operator {
	public static void main(String[] args) {
		/*���� ������(ternary operator)*/
		/*���� �����ڴ� �ڹٿ��� �����ϰ� �ǿ����ڸ� ������ ������ �����Դϴ�*/
		
		/*����*/
		/*���ǽ� ? ��ȯ�� 1 : ��ȯ�� 2*/
		
		/*���� 1*/
		int num1=5,num2=7;
		int result;
		result=(num1-num2>0)?num1:num2;
		System.out.println("�� ���� �� �� ū ���� " + result + "�Դϴ�.");
		
		/*instanceof ������*/
		/*instanceof �����ڴ� ���� ������ �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� ��ȯ�� �ݴϴ�.
		 * ��, �ش� ��ü�� � Ŭ������ �������̽��κ��� �����Ǿ������� �Ǻ��� �ִ� ������ �մϴ�.*/
		
		/*����*/
		/*�ν��Ͻ��̸� instanceof Ŭ�����Ǵ��������̽��̸�*/
		
		/*���� 1*/
		A a=new A();
		B b=new B();
	    System.out.println(a instanceof A); // true
	    System.out.println(b instanceof A); // true
	    System.out.println(a instanceof B); // false
	    System.out.println(b instanceof B); // true
	}
}
