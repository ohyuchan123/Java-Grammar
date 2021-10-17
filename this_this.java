package Grammar;
class A{
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    A(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
}
class B {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    B(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    B() {
        this("소나타", 2012, "검정색", 160); // 다른 생성자를 호출함.
    }
    public String getModel() {
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
}
public class this_this {
	public static void main(String[] args) {
		/*this 참조 변수*/
		/*this 참조 변수는 인스턴스가 바로 자기 자신을 참조하는 데 사용하는 변수 입니다
		 *이러한 this 참조 변수는 해당 인스턴스의 주소를 가리키고 있습니다*/
		
		
		/*this() 메소드 */
		/*this() 메소드는 생성자 내부에서만 사용할 수 있으며 같은 클래스의 다른 생성자를 호출할 때 사용합니다*/
		/*this() 메소드에 인수를 전달하면, 생성자 중에서 메소드 시그니처가 일치하는 다른 생성자를 찾아 호출해 줍니다*/
		B tcpCar = new B(); System.out.println(tcpCar.getModel());
	}
}
