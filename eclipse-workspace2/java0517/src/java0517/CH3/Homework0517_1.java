package java0517.CH3;


public class Homework0517_1 {

	public static void main(String[] args) {
		// �ǽ�1
		int iNum1 = 10;
		int iNum2 = 25;
		float iNum3 = 33F; // float �� ���
		
		int iNumSum = iNum1 + iNum2 + (int)iNum3;
		
		int avgiNum = iNumSum/3;
		
		System.out.println("Sum of Num:" + iNumSum);

		System.out.println("Average of Num:" + avgiNum);

		
		// �ǽ�2
		int aNum = 20;
		int bNum = 35;
		aNum+=100;
		bNum%=10;
		System.out.println(aNum);
		System.out.println(bNum);
		
		// �ǽ�3
		
		int numA=35;
		int numB=10;
		System.out.println((numA/numB) +"..." + (numA%numB));
		
	}

}
