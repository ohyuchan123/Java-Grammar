package Grammar;

public class Other_Control_Door {

	public static void main(String[] args) {
		/*기타 제어문*/
		/*루프의 제어*/
		/*일반적으로 조건식의 검사를 통해 루프로 진입하면, 다음 조건식을 검사하기 전까지 루프 안에 있는 모든 명령문을 실행합니다.
		 * 하지만 continue 문과 break 문은 이러한 일반적인 루프의 흐름을 사용자가 직접 제어할 수 있도록 도와줍니다*/
		
		/*continue 문*/
		/*continue 문은 루프 내에서 사용하여 해당 루프의 나머지 부분을 건너뛰고, 바로 다음 조건식의 판단으로 넘어가게 해줍니다.
		 * 보통 반복문 내에서 특정 조건에 대한 예외 처리를 하고자 할 때 자주 사용됩니다.*/
		for (int i = 1; i <= 100; i++) {
		    if (i % 5 == 0 || i % 7 == 0) {
		        System.out.println(i);
		    } else {
		        continue;
		    }
		}
		
		/*break 문*/
		/*break 문은 루프 내에서 사용하여 해당 반복문을 완전히 종료시킨 뒤, 반복문 바로 다음에 위치한 명령문을 실행합니다.
		 * 즉 루프 내에서 조건식의 판단 결과와 상관없이 반복문을 완전히 빠져나가고 싶을 때 사용합니다.*/
		int num = 1, sum = 0;
		while (true) { // 무한 루프
		    sum += num;
		    if (num == 100) {
		        break;
		    }
		    num++;
		}
		System.out.println(sum);
	}

}
