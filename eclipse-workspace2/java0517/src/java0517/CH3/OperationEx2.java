package java0517.CH3;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);

		lastScore1 = gameScore++;
		System.out.println(lastScore1);
		lastScore2 = gameScore--;
		System.out.println(lastScore2);
		
		int a=10;
		int b=20;
		System.out.println(a>b);
		System.out.println(a<b);	
		System.out.println(a>=b);
		System.out.println(a>=b);
		System.out.println(0==b);
		
		boolean c = (b>a);
		System.out.println(c);
		
		System.out.println( (5>3) && (5>2) );
		System.out.println( (5>3) || (5<2) );
		System.out.println( !(5>2) );
		
		
		
	}

}
