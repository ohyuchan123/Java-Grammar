package Grammar;

public class Increment_And_Decrement_Operators {

	public static void main(String[] args) {
		/*증감 연산자(increment and decrement operators)*/
		/*증감 연산자는 피연산자를 1씩 증가 혹은 감소시킬 때 사용하는 연산자입니다.
		 *이 연산자는 피연산자가 단 하나뿐인 단항 연산자입니다.
		 *증감 연산자는 해당 연산자가 피연산자의 어느 쪽에 위치하는가에 따라 연산의 순서 및 결과가 달라집니다.*/
		
		
		/*예제 1*/
		int num1=7,num2=7;
		int result1,result2;
		
		result1 = --num1 + 4;
		result2 = num2-- + 4;

		System.out.println("전위 감소 연산자에 의한 결과 : "+ result1 + ", 변수의 값 : " + num1);
		System.out.println("후위 감소 연산자에 의한 결과 : "+ result2 + ", 변수의 값 : " + num2);
		
		/*예제 2*/
		int x=10;
		int y=x-- + 5 + --x;
		System.out.println("x : "+ x + ", y : " + y);
	}

}
