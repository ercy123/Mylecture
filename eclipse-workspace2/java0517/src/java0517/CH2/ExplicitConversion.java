package java0517.CH2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		int iNum1=10;
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
//		int iNum5 = dNum1 + fNum2; ¾ÈµÊ
		double dNum2 = (int)iNum1 + 0.9F;
		System.out.println(iNum3);
		System.out.println(iNum4);
		System.out.println(dNum2);
		
		int iNum6 = 10;
		float fNum3 = 2.0F;
		int sum1 = iNum6 + (int)fNum3;
//		System.out.println((int)fNum3);
		
		
		double dNum = 3.14;
		System.out.println(dNum);
		System.out.println((int)dNum);				
		int ans1 = (int)dNum;
				

	}

}
