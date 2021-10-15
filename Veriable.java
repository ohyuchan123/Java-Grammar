package Grammar;

public class Veriable {
	public static void main(String[] args) {
		//변수의 선언만
		int num; //변수의 선언
//		System.out.println(num); //오류 발생
		num=20;
		System.out.println(num); //20
		
		/*문법*/
		// 1. 타입 변수이름[변수 이름];
		// 2/ 타입 변수 이름=초기값[,변수이름=초기값];
		// 변수 선언과 동시에 초기화 하는 방법
		int num1,num2; // 같은 타입의 변수를 동시에 생성함
		double num3=3.14; // 선언과 동시에 최기화함
		double num4=1.23,num5=4.56; //같은 타입의 변수를 동시에 선언하면서 초기화함
		// !선언 하고자 하는 변수의 타입이 서로 다르면 동시에 선언할 수 없습니다
		// 이미 선언된 여러 변수를 동시에 초기화 할 수 없음
		
	}

}
