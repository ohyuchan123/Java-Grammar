package Grammar;

public class primitive_Type {
	public static void main(String[] args) {
		/*기본 타입(primitive type)*/
		/*타입(data type)은 해당 데이터가 메모리에 어떻게 저장되고, 프로그램에서 어떻게 처리되어야 하는지를 명시적으로 알려주는 역할을 합니다.
		 자바에서는 여러 형태의 타입을 미리 정의하여 제공하고 있는데, 이것을 기본 타입(primitive type)이라고 합니다.
	     자바의 기본 타입은 모두 8종류가 제공되며, 크게는 정수형, 실수형, 문자형 그리고 논리형 타입으로 나눌 수 있습니다.*/
		
		// byte : 1바이트 : -128~127
		// short : 2바이트 : -32768~32767
		// int : 4바이트 : -2,147,483,648 ~ 2,147,483,647
		// long : 8바이트 : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		
		byte num1=127;
		byte num2=-128;
		
		num1++;
		num2--;
		
		System.out.println(num1);
		System.out.println(num2);
		
		/*실수형 타입*/
		/*자바에서 실수란 소수부나 지수부가 있는 수를 가리키며 정수보다 훨씬 넓은 표현 범위를 가진다*/
		// float : 4바이트 
		// double : 8바이트
		
		//실수의 표현
		double num=0.1;
		for(int i=0;i<10000;i++)
		{
			num+=0.1;
		}
		System.out.println(num);
		
		float num3 = 1.23456789f;
		double num4 = 1.23456789;

		System.out.println("float형  변수 num3 : " + num3);
		System.out.println("double형 변수 num4 : " + num4);
		
		/*문자형 타입*/
		/*자바에서 문자형 데이터란 작은 정수나 문자 하나를 표현할 수 있는 타입을 의미합니다.*/
		// char : 2바이트
		
		/*논리형 타입*/
		//논리형은 참(true)이나 거짓(false) 중 한 가지 값만을 가질 수 있는 불리언 타입을 의미합니다.
		// boolean : 1바이트 (true or false)
		
	}
}
