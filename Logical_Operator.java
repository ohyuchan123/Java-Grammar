package Grammar;

public class Logical_Operator {

	public static void main(String[] args) {
		/*�� ������(logical operator)*/
		/*�� �����ڴ� �־��� ������ �Ǵ��Ͽ�, ��(true)�� ����(false)�� �����ϴ� �������Դϴ�.
		 * AND ����� OR ������ �� ���� �ǿ����ڸ� ������ ���� �������̸�, �ǿ����ڵ��� ���� ������ ���ʿ��� �������Դϴ�.
		 * NOT �����ڴ� �ǿ����ڰ� �� �ϳ����� ���� �������̸�, �ǿ������� ���� ������ �����ʿ��� �����Դϴ�.*/
		
		/*���� 1*/
		char ch1 = 'b', ch2 = 'B';
		boolean result1, result2;
		 
		result1 = (ch1 > 'a') && (ch1 < 'z') ;
		result2 = (ch2 < 'A') || (ch2 < 'Z') ;

		System.out.println("&& �����ڿ� ���� ��� : "+ result1);
		System.out.println("|| �����ڿ� ���� ��� : "+ result2);
		System.out.println("! �����ڿ� ���� ��� : "+ !result2);
	}

}
