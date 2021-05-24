package java0517.CH3;


public class Homework0517_1 {

	public static void main(String[] args) {
		// 실습1
		int iNum1 = 10;
		int iNum2 = 25;
		float iNum3 = 33F; // float 인 경우
		
		int iNumSum = iNum1 + iNum2 + (int)iNum3;
		
		int avgiNum = iNumSum/3;
		
		System.out.println("Sum of Num:" + iNumSum);

		System.out.println("Average of Num:" + avgiNum);

		
		// 실습2
		int aNum = 20;
		int bNum = 35;
		aNum+=100;
		bNum%=10;
		System.out.println(aNum);
		System.out.println(bNum);
		
		// 실습3
		
		int numA=35;
		int numB=10;
		System.out.println((numA/numB) +"..." + (numA%numB));
		
	}

}
