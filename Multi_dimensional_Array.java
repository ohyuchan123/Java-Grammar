package Grammar;

public class Multi_dimensional_Array {
	public static void main(String[] args) {
		/*다차원 배열(multi-dimensional array)*/
		/* 다차원 배열이란 2차원 이상의 배열을 의미하며, 배열 요소로 또 다른 배열을 가지는 배열을 의미합니다.*/
		
		/*2차원 배열*/
		/*2차원 배열이란 배열의 요소로 1차원 배열을 가지는 배열입니다.
		 * 자바에서는 2차원 배열을 나타내는 타입을 따로 제공하지 않습니다.
		 * 대신에 1차원 배열의 배열 요소로 또 다른 1차원 배열을 사용하여 2차원 배열을 나타낼 수 있습니다.*/
		
		/*문법*/
		/*1. 타입[][] 배열이름;
		 * 2. 타입 배열이름[][];
		 * 3. 타입[] 배열이름[];*/
		
		/*예조 1*/
		int[][] arr = new int[2][3];
		int k = 10;
		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        arr[i][j] = k; // 인덱스를 이용한 초기화
		        k += 10;
		    }
		}
		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
