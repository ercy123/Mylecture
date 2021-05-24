package java0520;

public class StringTest {

	public static void main(String[] args) {

		// 객체는 속성, 메소드 2개 필수
		
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
		str4= "하나둘셋";

		
		
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
		
		if(str3.equals("abc")) // 이거 쓰는것 보다는
		{
			
		}

		if("abc".equals(str3)) // 쓰는게 좋음 (null point exception 방지)
		{
			
		}
		
		//
		
		String[] strs = "하 나 두 ㄹ ㅅ ㅔ 넷".split(" ");
		
		for(int aa=0 ; aa<strs.length ; aa++)
		{
			System.out.println(strs[aa]);
		}
		

		System.out.println("------------substring---------");
		System.out.println(str4.substring(1,4)); // 1개이상 4개미만
		System.out.println(str4.substring(2)); // 2개 초과
	}

}