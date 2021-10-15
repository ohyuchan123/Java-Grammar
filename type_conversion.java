package Grammar;

public class type_conversion {
	public static void main(String[] args) {
		/*타입 변환(type conversion)*/
		/*하나의 타입을 다른 타입으로 바꾸는 것을 타입변환이라고 합니다
		 *자바에서는 boolean형을 제외한 나머지 기본 타입 간의 타입 변환을 자유롭게 수행할 수 있습니다
		 *
		 *자바에서 다른 타입끼리의 연산은 우선 피연산자들을 모두 같은 타입으로 만든 후에 수행됩니다
		 *메모리에 할당받은 바이트의 크기가 상대적으로 큰 타입으로의 타입 변환은 생략할 수 있습니다
		 *
		 *하지만 메모리에 할당받은 바이트의 크기가 큰 타입에서 작은 타입으로의 타입 변환은 데이터의 손실이 발생합니다
		 *따라서 상대적으로 바이트의 크기가 작은 타입으로 타입 변환을 할 겨우 자바 컴파일러는 오류를 발생합니다*/
		
		/*타입 변환의 종류*/
		//1. 묵시적 타입 변환(자동 타입 변환)
		//2. 명시적 타입 변환(강제 타입 변환)
		
		/*묵시적 타입 변환(자동 타입 변환, inplicit conversion)*/
		/*묵시적 타입 변환이란 대입 연산이나 산술 연산에서 컴파일러가 자동으로 수행해주는 타입 변환을 가리킵니다.
		  자바에서는 데이터의 손실이 발생하지 않거나, 데이터의 손실이 최소화되는 방향으로 묵시적 타입 변환을 진행합니다.
		  또한, 자바에서는 데이터의 손실이 발생하는 대입 연산은 허용하지 않습니다.*/
		
		/*예제 1*/
		double num1=10;
		// int num2=3.14;
		double num3=7.0f+3.14;
		
		System.out.println(num1);
		System.out.println(num3);
		/*예제 2*/
		int num1_1=1,num2_2=4;
		
		double result1=num1_1/num2_2;
		double result2=(double)num1_1/num2_2;
		
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
