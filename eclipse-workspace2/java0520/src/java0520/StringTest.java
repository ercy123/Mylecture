package java0520;

public class StringTest {

	public static void main(String[] args) {

		// ��ü�� �Ӽ�, �޼ҵ� 2�� �ʼ�
		
		String str1 = new String("abc");
		String str2 = "abc";
		String str3 = "abc";
		System.out.println(str1);
		System.out.println(str2);				
		System.out.println(str3);
		
		str2 = "efg";
		System.out.println(str2);
		System.out.println(str3);
		
		//
		
		String str4;
		str4= "�ϳ��Ѽ�";

		
		
		System.out.println(str4 + " : ");
		
		// final char charat.(int)
		// final int PI=3.14;
		
		// dot operator :.
		int len = str4.length();
		
		for(int i = 0; i < len ; i++)
		{
			System.out.println(str4.charAt(i));
		}
		
		/** equals(string)  **/
		
		if(str3.equals("abc")) // �̰� ���°� ���ٴ�
		{
			
		}

		if("abc".equals(str3)) // ���°� ���� (null point exception ����)
		{
			
		}
		
		//
		
		String[] strs = "�� �� �� �� �� �� ��".split(" ");
		
		for(int aa=0 ; aa<strs.length ; aa++)
		{
			System.out.println(strs[aa]);
		}
		

		System.out.println("------------substring---------");
		System.out.println(str4.substring(1,4)); // 1���̻� 4���̸�
		System.out.println(str4.substring(2)); // 2�� �ʰ�
	}

}