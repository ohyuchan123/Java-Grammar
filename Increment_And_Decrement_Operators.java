package Grammar;

public class Increment_And_Decrement_Operators {

	public static void main(String[] args) {
		/*���� ������(increment and decrement operators)*/
		/*���� �����ڴ� �ǿ����ڸ� 1�� ���� Ȥ�� ���ҽ�ų �� ����ϴ� �������Դϴ�.
		 *�� �����ڴ� �ǿ����ڰ� �� �ϳ����� ���� �������Դϴ�.
		 *���� �����ڴ� �ش� �����ڰ� �ǿ������� ��� �ʿ� ��ġ�ϴ°��� ���� ������ ���� �� ����� �޶����ϴ�.*/
		
		
		/*���� 1*/
		int num1=7,num2=7;
		int result1,result2;
		
		result1 = --num1 + 4;
		result2 = num2-- + 4;

		System.out.println("���� ���� �����ڿ� ���� ��� : "+ result1 + ", ������ �� : " + num1);
		System.out.println("���� ���� �����ڿ� ���� ��� : "+ result2 + ", ������ �� : " + num2);
		
		/*���� 2*/
		int x=10;
		int y=x-- + 5 + --x;
		System.out.println("x : "+ x + ", y : " + y);
	}

}
