package java0520;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		// 10�� ¥�� ���ڿ� �迭
		//1��
		String[] testArray;
		testArray = new String[10];
		
		String[] testArray2 = new String[10];
		String testArray3[] = new String[10];
		
		//2��
		String[] testArray4 = new String[] {"","2","3","4","5",
				"6","7","8","9","10"};
		//3��
		
		String[] testArray5 = {"","2","3","4","5",
				"6","7","8","9","10"};
		
		String[] testArray6= {};
		
/*		System.out.println(testArray.length);
		System.out.println(testArray2.length);
		System.out.println(testArray3.length);
		System.out.println(testArray4.length);
		System.out.println(testArray5.length);
		System.out.println(testArray6.length);


*/
		//Double 5,8,30 �� ũ�� �迭 3��, ũ�� ���

		Double[] Array1 = new Double[5];
		Double[] Array2 = new Double[8];		
		Double[] Array3 = new Double[30];
		System.out.println(Array1.length);
		System.out.println(Array2.length);

		Array3[29] = (double) 10;
		System.out.println(Array3[29]);
	}

}