package Grammar;

public class Iteration_Statements {

	public static void main(String[] args) {
		/*반복문(iteration statements)*/
		/*반복문이란 프로그램 내에서 똑같은 명령을 일정 횟수만큼 반복하여 수행하도록 제어하는 명령문입니다.
		 * 프로그램이 처리하는 대부분의 코드는 반복적인 형태가 많으므로, 가장 많이 사용되는 제어문 중 하나입니다.*/
		
		/*while문*/
		/*do/while문*/
		/*for문*/
		/*Enhanced for 문*/
		
		/*wihle문*/
		/*while 문은 특정 조건을 만족할 때까지 계속해서 주어진 명령문을 반복 실행합니다.*/
		
		/*문법*/
		/*
		 while (조건식) {
    		조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
			}
		*/
		
		/*예제 1*/
		int i = 0;
		while (i < 5) {
		    System.out.println("while 문이 " + (i + 1) + "번째 반복 실행중입니다.");
		    i++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
		}
		System.out.println("while 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
		
		/*do/while문*/
		/*while 문은 루프에 진입하기 전에 먼저 조건식부터 검사합니다.
		 * 하지만 do / while 문은 먼저 루프를 한 번 실행한 후에 조건식을 검사합니다.
		 * 즉, do / while 문은 조건식의 결과와 상관없이 무조건 한 번은 루프를 실행합니다.*/
		
		/*문법*/
		/*do {
    		조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
		} while (조건식);*/
		
		/*예제 1*/
		int k = 1, j = 1;
		while (k < 1) {
		    System.out.println("while 문이 " + k + "번째 반복 실행중입니다.");
		    k++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
		}
		System.out.println("while 문이 종료된 후 변수 k의 값은 " + k + "입니다.");
		do {
		    System.out.println("do / while 문이 " + k+ "번째 반복 실행중입니다.");
		    j++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
		} while (j < 1);
		System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");
		
		/*for문*/
		/*for 문은 while 문과는 달리 자체적으로 초기식, 조건식, 증감식을 모두 포함하고 있는 반복문입니다.
		 * 따라서 while 문보다는 좀 더 간결하게 반복문을 표현할 수 있습니다.*/
		
		/*문법*/
		/*for (초기식; 조건식; 증감식) {
    		조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
    		}*/
		
		/*예제 1*/
		for (i = 0; i < 5; i++) {
		    System.out.println("for 문이 " + (i + 1) + "번째 반복 실행중입니다.");
		}
		System.out.println("for 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
	}

}
