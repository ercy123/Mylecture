package java0517.CH2;

public class DoubleEx1 {

	public static void main(String[] args) {
		
		double dnum = 3.14;
		float fnum = 3.14F;
		double dnum2 = -3.14;
		float fnum2 = -3.14F;		
		System.out.println(dnum);
		System.out.println(fnum);
		System.out.println(dnum2);
		System.out.println(fnum2);
		
		// double to int
		System.out.println("double2long:" + (long)dnum2);
		System.out.println("double2int:" + (int)dnum2);
		System.out.println("double2short:" + (short)dnum2);
		System.out.println("double2byte:" + (byte)dnum2);

		// int i1 = fnum; �ȵ�
		// int i2 = (int)fnum; ��
		// int i3 = 3.14; �ȵ�		
		// int i3 = (int)3.14; ��
		
		System.out.println("float to int: " + (int)fnum);		
		
		//int to float/double
		
		int i1 = 32768;
		int i2 = 2147483647; // max
		int i3 = -2147483648; // min
		
		double dnum3 = i2;
		System.out.println("------------------");
		System.out.println("dnum3:" + dnum3);	
		System.out.println("dnum3:" + (double)i2);
		
		System.out.println("-2147483648:" + (double)i3);
		
		boolean b1 = false;
		boolean b2 = true;
		
		
		System.out.println("Is true:" + true);
		System.out.println("Is false:" + false);
		b1 = b2;
		
		System.out.println("b1:" + b1);
//		b1 = (boolean) i1;
		
//		System.out.println("b1 <> int" + (int)b1);
	
		byte bt = 1;
		//b1 = (boolean)bt;
//		bt2 = (byte)b1;
		
		// �� ������ �ȵǴ� �ĺ���! (����) => ��� Constant.
		// ���� �̸� ������ ������ �ϰ� ����ϴ� ����! (�޸� ���� ����. heap. stack.)
		
		final double PI = 3.14;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
