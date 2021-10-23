package Grammar;
/*예제 1*/
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
		/*메소드 시그니처(method signature)*/
		/*메소드 오버로딩의 핵심은 바로 메소드 시그니처(method signature)에 있습니다*/
		/*메소드 시그니처란 메소드의 선언부에 명시되는 매개변수의 리스트를 가리킵니다*/
		/*만약 두 메소드가 매개변수의 개수와 타입, 그 순서까지 모두 같다면, 이 두 메소드의 시그니처는 같다고 할 수 있습니다.*/
		
		
		/*메소드 오버로딩(method overloading)*/
		/*메소드 오버로딩이란 같은 메소드를 중복하여 정의하는 것을 의미합니다.
		 *자바에서는 원래 한 클래스	 내에 같은 이름의 메소드를 둘 이상 가질 수 없습니다
		 *
		 *하지만 매개변수의 개수나 	타입을 다르게 하면 하나의 이름으로 메소드를 작성할 수 있습니다
		 *즉, 메소드 오버로딩은 서로 다른 시그니쳐를 갖는 여러 메소드를 같은 이름으로 정의하는 것이라고 할 수 있습니다
		 *
		 *이러한 메소드 오버로딩을 사용함으로써 메소드에 사용되는 이름을 절약할 수 있습니다
		 *또한, 메소드를 호출할 때 전달해야 할 매개변수의 타입이나 개수에 대해 크게 신경을 쓰지 않고 호출할 수 있게 됩니다
		 *메소드 오버로딩은 객체 지향 프로그래밍의 특징 중 하나인 다양성(polymorphism)을 구현하는 방법 중 하나 입니다
		 *
		 *메소드 오버로딩의 대표적인 예로는 println() 메소드를 들 수 있습니다.
		 *println() 메소드는 전달받는 매개변수의 타입에 따라 다음과 같이 다양한 원형 중에서 적절한 원형을 호출하게 됩니다
		 *
		 * 메소드 원형
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
		
		
		/*메소드 오버로딩 예제*/
		/*메소드 원형 예제*/
		/*1. void display(int num1)              // 전달받은 num1을 그대로 출력함.
		  2. void display(int num1, int num2)    // 전달받은 두 정수의 곱을 출력함.
		  3. void display(int num1, double num2) // 전달받은 정수와 실수의 합을 출력함.*/
		
		/*함수의 호출 예제*/
		/*1. display(10);       // 1번 display() 메소드 호출 -> 10
		 * 2. display(10, 20);   // 2번 display() 메소드 호출 -> 200
		 * 3. display(10, 3.14); // 3번 display() 메소드 호출 -> 13.14
		 * 4. display(10, 'a');  // 2번과 3번 모두 호출 가능*/
		
		
		/*예제 1*/
		Test myfunc =new Test();
		
		myfunc.display(10);
		myfunc.display(10, 20);
		myfunc.display(10, 3.14);
		myfunc.display(10,'a');
		
		/*위의 예제 처럼 메서드의 오버로딩은 매개변수의 타입뿐만 아니라 매개변수의 개수를 달리해도 작성할 수 있습니다
		 *위 예제 2번 라인의 display() 메소드 호출은 영문 소문자 'a'의 아스키 코드값이 97이므로, int형으로 자동 타입 변환되어 1번 라인의 display() 메소드 호출될 것 입니다*/
	}

}
