package Grammar;

public class operator {
	public static void main(String[] args) {
		/*산술 연산자(arithmetic operator)*/
		/*산술 연산자는 사칙연산을 다루는 연산자로, 가장 기본적이면서도 가장 많이 사용되는 연산자 중 하나입니다.
		  산술 연산자는 모두 두 개의 피연산자를 가지는 이항 연산자이며, 피연산자들의 결합 방향은 왼쪽에서 오른쪽입니다.*/
		int num1 = 8, num2 = 4;
		// 덧셈
		System.out.println("+ 연산자에 의한 결과 : "+ (num1 + num2));
		// 뺄셈
		System.out.println("- 연산자에 의한 결과 : "+ (num1 - num2));
		// 곱셈
		System.out.println("* 연산자에 의한 결과 : "+ (num1 * num2));
		// 나눗셈
		System.out.println("/ 연산자에 의한 결과 : "+ (num1 / num2));
		// 나머지
		System.out.println("% 연산자에 의한 결과 : "+ (num1 % num2));
	}
}
