package Grammar;

public class Multi_dimensional_Array {
	public static void main(String[] args) {
		/*������ �迭(multi-dimensional array)*/
		/* ������ �迭�̶� 2���� �̻��� �迭�� �ǹ��ϸ�, �迭 ��ҷ� �� �ٸ� �迭�� ������ �迭�� �ǹ��մϴ�.*/
		
		/*2���� �迭*/
		/*2���� �迭�̶� �迭�� ��ҷ� 1���� �迭�� ������ �迭�Դϴ�.
		 * �ڹٿ����� 2���� �迭�� ��Ÿ���� Ÿ���� ���� �������� �ʽ��ϴ�.
		 * ��ſ� 1���� �迭�� �迭 ��ҷ� �� �ٸ� 1���� �迭�� ����Ͽ� 2���� �迭�� ��Ÿ�� �� �ֽ��ϴ�.*/
		
		/*����*/
		/*1. Ÿ��[][] �迭�̸�;
		 * 2. Ÿ�� �迭�̸�[][];
		 * 3. Ÿ��[] �迭�̸�[];*/
		
		/*���� 1*/
		int[][] arr = new int[2][3];
		int k = 10;
		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        arr[i][j] = k; // �ε����� �̿��� �ʱ�ȭ
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
