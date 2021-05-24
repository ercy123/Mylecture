package java0517.CH3;

public class SumAvg {

	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 25;
		float iNum3 = 33F; // float ÀÎ °æ¿ì
		
		int iNumSum = iNum1 + iNum2 + (int)iNum3;
		
		int avgiNum = iNumSum/3;
		
		System.out.println("Sum of Num:" + iNumSum);

		System.out.println("Average of Num:" + avgiNum);

	}

}
