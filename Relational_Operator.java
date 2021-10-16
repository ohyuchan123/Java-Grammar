package Grammar;

public class Relational_Operator {

	public static void main(String[] args) {
		/*비교 연산자(relational operator)*/
		/*비교 연산자는 피연산자 사이의 상대적인 크기를 판단하는 연산자입니다.
		 * 비교 연산자는 왼쪽의 피연산자와 오른쪽의 피연산자를 비교하여, 어느 쪽이 더 큰지, 작은지, 또는 서로 같은지를 판단합니다.
		 * 비교 연산자는 모두 두 개의 피연산자를 가지는 이항 연산자이며, 피연산자들의 결합 방향은 왼쪽에서 오른쪽입니다.*/
		
		/*예제 1*/
		char ch1='a',ch2='A';
		System.out.println("== 연산자에 의한 결과 : "+(ch1==ch2));
		System.out.println("> 연산자에 의한 결과 : "+ (ch1 > ch2));
	}

}
