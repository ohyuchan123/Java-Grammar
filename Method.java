package Grammar;
/*메소드 정의*/
/*접근제어자 반환타입 메소드이름(매개변수목록) {
 *  // 선언부
 *  // 구현부
 *  }*/
class Car{
	private int currentSpeed;
    private int accelerationTime;
    
    public void accelerate(int speed, int second) { // 선언부
        // 구현부
        System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");
    }
}
public class Method {
	public static void main(String[] args) {
		/*메소드(method)*/
		/*자바에서 클래스는 멤버(member)로 속성을 표현하는 필드(field)와 기능을 표현하는 메소드(method)를 가집니다.
		 * 그중에서 메소드(method)란 어떠한 특정 작업을 수행하기 위한 명령문의 집합이라 할 수 있습니다.*/
		
		/*메소더 호출*/
		/*1. 객체참조변수이름.메소드이름();
		 *  매개변수가 없는 메소드의 호출
		 *2. 객체참조변수이름.메소드이름(인수1, 인수2, ...); // 매개변수가 있는 메소드의 호출*/
		
	      Car myCar = new Car();   // 객체 생성
	      myCar.accelerate(60, 3); // 메소드 호출
		
	}
}
