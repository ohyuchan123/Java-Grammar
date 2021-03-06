package Grammar;

public class Array {
	public static void main(String[] args) {
		/*배열(array)란?*/
		/*배열(array)은 같은 타입의 변수들로 이루어진 유한 집합으로 정의할 수 있습니다.
		 * 배열을 구성하는 각각의 값을 배열 요소(element)라고 하며, 배열에서의 위치를 가리키는 숫자를 인덱스(index)라고 합니다.
		 * 자바에서 인덱스는 언제나 0부터 시작하며, 0을 포함한 양의 정수만을 가질 수 있습니다.
		 * 배열은 같은 종류의 데이터를 많이 다뤄야 하는 경우에 사용할 수 있는 가장 기본적인 자료 구조입니다.
		 * 배열은 선언되는 형식에 따라 1차원 배열, 2차원 배열뿐만 아니라 그 이상의 다차원 배열로도 선언할 수 있습니다.
		 * 하지만 현실적으로 이해하기가 쉬운 2차원 배열까지가 많이 사용됩니다.
		 */
		
		/*1차원 배열*/
		/*문법*/
		/*1. 타입[] 배열이름;
		 * 2. 타입 배열이름[];
		
		3. 배열이름 = new 타입[배열길이];
		
		4. 타입[] 배열이름 = new 타입[배열길이];
		*/
		/*예제 1*/
		int[] grade1 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성
		int[] grade2 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성
		 
		grade1[0] = 85; // 인덱스를 이용한 배열의 초기화
		grade1[1] = 65;
		grade1[2] = 90;
		 
		grade2[0] = 85; // 배열의 길이보다 적은 수의 배열 요소만 초기화
		for (int i = 0; i < grade1.length; i++) {
		    System.out.print(grade1[i] + " "); // 인덱스를 이용한 배열로의 접근
		}
		for (int i = 0; i < grade2.length; i++) {
		    System.out.print(grade2[i] + " "); // 인덱스를 이용한 배열로의 접근
		}
		
		
		
	}
}
