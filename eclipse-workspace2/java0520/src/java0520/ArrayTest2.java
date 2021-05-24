package java0520;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		double num2 = sc.nextDouble()		
		String [] strArray = new String[] {"1","2","3","4","5","6","7","8","9"};
		
//		System.out.println(strArray[0]);
		
		
		for(int i=0; i< strArray.length;i++)
		{
			int t= i * Integer.parseInt(strArray[i]);
			strArray[i]=t+"";
			System.out.println(strArray[i]);
			
		}
		
		
		//java.util.Arrays
		Arrays.toString(strArray);
		System.out.println(Arrays.toString(strArray));
	}

}