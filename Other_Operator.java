package Grammar;
class A{}
class B extends A{}
public class Other_Operator {
	public static void main(String[] args) {
		/*삼항 연산자(ternary operator)*/
		/*삼항 연산자는 자바에서 유일하게 피연산자를 세개나 가지는 조건입니다*/
		
		/*문법*/
		/*조건식 ? 반환값 1 : 반환값 2*/
		
		/*예제 1*/
		int num1=5,num2=7;
		int result;
		result=(num1-num2>0)?num1:num2;
		System.out.println("두 정수 중 더 큰 수는 " + result + "입니다.");
		
		/*instanceof 연산자*/
		/*instanceof 연산자는 참조 변수가 참조하고 있는 인스턴스의 실제 타입을 반환해 줍니다.
		 * 즉, 해당 객체가 어떤 클래스나 인터페이스로부터 생성되었는지를 판별해 주는 역할을 합니다.*/
		
		/*문법*/
		/*인스턴스이름 instanceof 클래스또는인터페이스이름*/
		
		/*예제 1*/
		A a=new A();
		B b=new B();
	    System.out.println(a instanceof A); // true
	    System.out.println(b instanceof A); // true
	    System.out.println(a instanceof B); // false
	    System.out.println(b instanceof B); // true
	}
}
