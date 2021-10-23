package Grammar;
/*���� 1*/
class Test{
	static void display(int num1) {
		System.out.println(num1);
	}
	static void display(int num1,int num2)
	{
		System.out.println(num1*num2);
	}
	static void display(int num1,double num2) {
		System.out.println(num1+num2);
	}
}
public class Method_Overloading {
	public static void main(String[] args) {
		/*�޼ҵ� �ñ״�ó(method signature)*/
		/*�޼ҵ� �����ε��� �ٽ��� �ٷ� �޼ҵ� �ñ״�ó(method signature)�� �ֽ��ϴ�*/
		/*�޼ҵ� �ñ״�ó�� �޼ҵ��� ����ο� ��õǴ� �Ű������� ����Ʈ�� ����ŵ�ϴ�*/
		/*���� �� �޼ҵ尡 �Ű������� ������ Ÿ��, �� �������� ��� ���ٸ�, �� �� �޼ҵ��� �ñ״�ó�� ���ٰ� �� �� �ֽ��ϴ�.*/
		
		
		/*�޼ҵ� �����ε�(method overloading)*/
		/*�޼ҵ� �����ε��̶� ���� �޼ҵ带 �ߺ��Ͽ� �����ϴ� ���� �ǹ��մϴ�.
		 *�ڹٿ����� ���� �� Ŭ����	 ���� ���� �̸��� �޼ҵ带 �� �̻� ���� �� �����ϴ�
		 *
		 *������ �Ű������� ������ 	Ÿ���� �ٸ��� �ϸ� �ϳ��� �̸����� �޼ҵ带 �ۼ��� �� �ֽ��ϴ�
		 *��, �޼ҵ� �����ε��� ���� �ٸ� �ñ״��ĸ� ���� ���� �޼ҵ带 ���� �̸����� �����ϴ� ���̶�� �� �� �ֽ��ϴ�
		 *
		 *�̷��� �޼ҵ� �����ε��� ��������ν� �޼ҵ忡 ���Ǵ� �̸��� ������ �� �ֽ��ϴ�
		 *����, �޼ҵ带 ȣ���� �� �����ؾ� �� �Ű������� Ÿ���̳� ������ ���� ũ�� �Ű��� ���� �ʰ� ȣ���� �� �ְ� �˴ϴ�
		 *�޼ҵ� �����ε��� ��ü ���� ���α׷����� Ư¡ �� �ϳ��� �پ缺(polymorphism)�� �����ϴ� ��� �� �ϳ� �Դϴ�
		 *
		 *�޼ҵ� �����ε��� ��ǥ���� ���δ� println() �޼ҵ带 �� �� �ֽ��ϴ�.
		 *println() �޼ҵ�� ���޹޴� �Ű������� Ÿ�Կ� ���� ������ ���� �پ��� ���� �߿��� ������ ������ ȣ���ϰ� �˴ϴ�
		 *
		 * �޼ҵ� ����
		 *1. println()
		 *2. println(boolean x)
		 *3. println(char x)
		 *4. println(char[] x)
		 *5. println(double x)
		 *6. println(float x)
		 *7. println(int x)
		 *8. println(long x)
		 *9. println(Object x)
		 *10. println(String x)*/
		
		
		/*�޼ҵ� �����ε� ����*/
		/*�޼ҵ� ���� ����*/
		/*1. void display(int num1)              // ���޹��� num1�� �״�� �����.
		  2. void display(int num1, int num2)    // ���޹��� �� ������ ���� �����.
		  3. void display(int num1, double num2) // ���޹��� ������ �Ǽ��� ���� �����.*/
		
		/*�Լ��� ȣ�� ����*/
		/*1. display(10);       // 1�� display() �޼ҵ� ȣ�� -> 10
		 * 2. display(10, 20);   // 2�� display() �޼ҵ� ȣ�� -> 200
		 * 3. display(10, 3.14); // 3�� display() �޼ҵ� ȣ�� -> 13.14
		 * 4. display(10, 'a');  // 2���� 3�� ��� ȣ�� ����*/
		
		
		/*���� 1*/
		Test myfunc =new Test();
		
		myfunc.display(10);
		myfunc.display(10, 20);
		myfunc.display(10, 3.14);
		myfunc.display(10,'a');
		
		/*���� ���� ó�� �޼����� �����ε��� �Ű������� Ÿ�ԻӸ� �ƴ϶� �Ű������� ������ �޸��ص� �ۼ��� �� �ֽ��ϴ�
		 *�� ���� 2�� ������ display() �޼ҵ� ȣ���� ���� �ҹ��� 'a'�� �ƽ�Ű �ڵ尪�� 97�̹Ƿ�, int������ �ڵ� Ÿ�� ��ȯ�Ǿ� 1�� ������ display() �޼ҵ� ȣ��� �� �Դϴ�*/
	}

}
