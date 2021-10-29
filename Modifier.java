package Grammar;
public class Modifier {

	public static void main(String[] args) {
		/*접근 제어자(modifier)*/
		/*제어자란 클래스와 클래스 멤버의 선언 시 사용하여 부가적인 의미를 부여하는 키워드를 의미합니다
		 *자바에서 제어자는 접근 제어자와 기타 제어자로 구분 할 수 있습니다*/
		
		/*접근 제어자(access modifier)*/
		/*객체 지향에서 정보 은닉(data hiding)이란 사용자가 굳이 알 필요가 없는 정보는 사용자로부터 숨겨야 한다는 개념입니다
		 *그렇게 함으로써 사용자는 언제나 최소한의 정보만으로 프로그램을 손쉽게 사용할 수 있게 됩니다
		 *
		 *자바에서는 다음과 같은 네가지의 접근 제어자를 제공합니다
		 *1. private
		 *2. public
		 *3. default
		 *4. protected*/
		
		/*private 접근자*/
		/*private 접근 제어자를 사용하여 선언된 클래스 멤버는 외부에 공개되지 않으며, 외부에서는 직접 접근할 수 없습니다.
		 *즉, 자바 프로그램은 private 멤버에 직접 접근할 수 없으며, 해당 객체의 public 메소드를 통해서만 접근할 수 있습니다.
		 *따라서 private 멤버는 public 인터페이스를 직접 구성하지 않고, 클래스 내부의 세부적인 동작을 구현하는 데 사용됩니다.*/
		
		/*다음 예제처럼 private 멤버는 해당 멤버를 선언한 클래스에서만 접근할 수 있습니다.*/
		public static class SameClass{
		    private String var = "같은 클래스만 허용"; // private 필드
		    private String getVar() {                  // private 메소드
		        return this.var;
		    }
		}
		/*public 접근자*/
		/*public 접근 제어자를 사용하여 선언된 클래스 멤버는 외부로 공개되며, 해당 객체를 사용하는 프로그램 어디에서나 직접 접근할 수 있습니다.
		 *자바 프로그램은 public 메소드를 통해서만 해당 객체의 private 멤버에 접근할 수 있습니다.
		 *따라서 public 메소드는 private 멤버와 프로그램 사이의 인터페이스(interface) 역할을 수행한다고 할 수 있습니다.*/
		
		/*자바에서 public 멤버는 프로그램 어디에서 누구나 접근할 수 있습니다.*/
		public class Everywhere {
		    public String var = "누구든지 허용"; // public 필드
		    public String getVar() {             // public 메소드
		        return this.var;
		    }
		}
		
		/*default 접근자*/
		/*자바에서는 클래스 및 클래스 멤버의 접근 제어의 기본값으로 default 접근 제어를 별도로 명시하고 있습니다.
		 *이러한 default를 위한 접근 제어자는 따로 존재하지 않으며, 접근 제어자가 지정되지 않으면 자동적으로 default 접근 제어를 가지게 됩니다.
		 *default 접근 제어를 가지는 멤버는 같은 클래스의 멤버와 같은 패키지에 속하는 멤버에서만 접근할 수 있습니다.*/
		
		/*다음 예제 처럼 default 멤버는 같은 패키지에 속하는 클래스에서만 접근할 수 있습니다*/
		package test;
		public class SamePackage {
		    String sameVar = "같은 패키지는 허용"; // default 필드
		}
		/*같은 클래스도 접근 혀용*/
		package test;
		public class SameClass {
		    String var = "다른 패키지는 접근 불가"; // default 필드
		    public static void main(String[] args) {
		        SamePackage sp = new SamePackage();
		        System.out.println(sp.sameVar);     // 같은 패키지는 허용
		    }
		}
	}

}
