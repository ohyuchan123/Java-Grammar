package Grammar;

public class Assignment_Operator {
	public static void main(String[] args) {
		/*대입 연산자(Assignment_Operator)*/
		/*대입 연산자는 변수에 값을 대입할 때 사용하는 이항 연산자이며, 피연산자들의 결합 방향은 오른쪽에서 왼쪽입니다.
		  또한, 자바에서는 대입 연산자와 다른 연산자를 결합하여 만든 다양한 복합 대입 연산자를 제공합니다.*/
		
		/*예제 1*/
		int num1 = 7, num2 = 7, num3 = 7;

		num1 = num1 - 3;
		num2 -= 3;
		num3 =- 3;

		System.out.println("- 연산자에 의한 결과 : "+ num1);
		System.out.println("-= 연산자에 의한 결과 : "+ num2);
		System.out.println("=- 연산자에 의한 결과 : "+ num3);
		
	}
}
