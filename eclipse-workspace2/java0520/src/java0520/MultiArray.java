package java0520;

import java.util.Arrays;

public class MultiArray {

	public static void main(String[] args) {
		
		//2 X 3 배열 : 행우선
		
		int[][] arr1= new int[2][3];
		
		System.err.println("행: " + arr1.length);
		System.err.println("열: " + arr1[0].length);
		System.err.println("열: " + arr1[1].length);
		

		for(int i =0; i<arr1.length;i++)
		{
			for(int j =0; j< arr1[0].length; j++)
			{
				arr1[i][j] =1; //행x열
			}
				
		}
//		System.out.println(Arrays.toString(arr1));
		
		
	}

}