package Grammar;

public class Assignment_Operator {
	public static void main(String[] args) {
		/*���� ������(Assignment_Operator)*/
		/*���� �����ڴ� ������ ���� ������ �� ����ϴ� ���� �������̸�, �ǿ����ڵ��� ���� ������ �����ʿ��� �����Դϴ�.
		  ����, �ڹٿ����� ���� �����ڿ� �ٸ� �����ڸ� �����Ͽ� ���� �پ��� ���� ���� �����ڸ� �����մϴ�.*/
		
		/*���� 1*/
		int num1 = 7, num2 = 7, num3 = 7;

		num1 = num1 - 3;
		num2 -= 3;
		num3 =- 3;

		System.out.println("- �����ڿ� ���� ��� : "+ num1);
		System.out.println("-= �����ڿ� ���� ��� : "+ num2);
		System.out.println("=- �����ڿ� ���� ��� : "+ num3);
		
	}
}
