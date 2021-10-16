package Grammar;

public class A_Conditional_Sentence {

	public static void main(String[] args) {
		/*제어문(control flow statements)*/
		/*자바 프로그램이 원하는 결과를 얻기 위해서는 프로그램의 순차적인 흐름을 제어해야만 할 경우가 생깁니다.
		 * 이때 사용하는 명령문을 제어문이라고 하며, 이러한 제어문에는 조건문, 반복문 등이 있습니다.
		 * 이러한 제어문에 속하는 명령문들은 중괄호({})로 둘러싸여 있으며, 이러한 중괄호 영역을 블록(block)이라고 합니다.*/
		
		/*조건문(conditional statements)*/
		/*조건문은 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문입니다.
		 * 조건문 중에서도 가장 기본이 되는 명령문은 바로 if 문입니다.
		 * 자바에서 사용하는 대표적인 조건문의 형태는 다음과 같습니다.*/
		
		/*1. if 문*/
		/*2. if / else 문*/
		/*3. if / else if / else 문*/
		/*4. switch 문*/
		
		/*if문*/
		/*if 문은 조건식의 결과가 참(true)이면 주어진 명령문을 실행하며, 거짓(false)이면 아무것도 실행하지 않습니다.*/
		
		/*문법*/
		/*if (조건식) {
			조건식의 결과가 참일 때 실행하고자 하는 명령문;
		}*/
		
		/*예제 1*/
		char ch='c';
		if (ch >= 'a' && ch <= 'z') {
		    System.out.println("해당 문자는 영문 소문자입니다.");
		}
		
		/*if / else 문*/
		/*if 문과 함께 사용하는 else 문은 if 문과는 반대로 주어진 조건식의 결과가 거짓(false)이면 주어진 명령문을 실행합니다.*/
		
		/*문법 */
		/*if (조건식) {
    		조건식의 결과가 참일 때 실행하고자 하는 명령문;
		} else {
    		조건식의 결과가 거짓일 때 실행하고자 하는 명령문;
		}*/
		char ch1='D';
		/*예제 1*/
		if (ch1 >= 'a' && ch1 <= 'z') {
		    System.out.println("해당 문자는 영문 소문자입니다.");
		} else {
		    System.out.println("해당 문자는 영문 소문자가 아닙니다.");
		}
		
		/*if / else if / else 문*/
		/*if / else if / else 문은 마치 새로운 구문처럼 보이지만, 사실은 두 개의 if / else 문이 연달아 나온 것뿐입니다.
		 * 이러한 if / else if / else 문은 조건식을 여러 개 명시할 수 있으므로 중첩된 if 문을 좀 더 간결하게 표현할 수 있습니다*/
		
		/*문법*/
		/*if (조건식1) {
    		조건식1의 결과가 참일 때 실행하고자 하는 명령문;
		} else if (조건식2) {
    		조건식2의 결과가 참일 때 실행하고자 하는 명령문;
		} else {
    		조건식1의 결과도 거짓이고, 조건식2의 결과도 거짓일 때 실행하고자 하는 명령문;
		}*/
		
		/*예제 1*/
		char ch2='A';
		if (ch2>= 'a' && ch2 <= 'z') {
		    System.out.println("해당 문자는 영문 소문자입니다.");
		} else if (ch2 >= 'A' && ch2 <= 'Z') {
		    System.out.println("해당 문자는 영문 대문자입니다.");
		} else {
		    System.out.println("해당 문자는 영문자가 아닙니다.");
		}
		
		/*switch 문*/
		/*switch 문은 if / else 문과 마찬가지로 주어진 조건 값의 결과에 따라 프로그램이 다른 명령을 수행하도록 하는 조건문입니다.
		 * 이러한 switch 문은 if / else 문보다 가독성이 더 좋으며, 컴파일러가 최적화를 쉽게 할 수 있어 속도 또한 빠른 편입니다.*/
		
		/*문법 */
		/*switch (조건 값) {
    		case 값1:
        	조건 값이 값1일 때 실행하고자 하는 명령문;
        	break;
    		case 값2:
        	조건 값이 값2일 때 실행하고자 하는 명령문;
        	break;
    		...
    		default:
        	조건 값이 어떠한 case 절에도 해당하지 않을 때 실행하고자 하는 명령문;
        	break;
		}*/
		
		/*예제 1*/
		switch (ch) {
	    case 'a':
	        System.out.println("해당 문자는 'A'입니다.");
	        break;
	    case 'e':
	        System.out.println("해당 문자는 'E'입니다.");
	        break;
	    case 'i':
	        System.out.println("해당 문자는 'I'입니다.");
	        break;
	    case 'o':
	        System.out.println("해당 문자는 'O'입니다.");
	        break;
	    case 'u':
	        System.out.println("해당 문자는 'U'입니다.");
	        break;
	    default:
	        System.out.println("해당 문자는 모음이 아닙니다.");
	        break;
	}
	}

}
