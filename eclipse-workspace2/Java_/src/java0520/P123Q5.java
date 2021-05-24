package java0520;

public class P123Q5 {

	public static void main(String[] args) {
		
		for(int i = 0; i<7; i++)
		{
			for(int j = 0; j<7 ; j++)
			{
				
				if( j<3-i || j< i-3)
				{
					System.out.print(" ");
		
				}
				else if(i<4 && j< i+4)
				{
					System.out.print("*");
				}
				else if(i>=4 && j<10-i)
				{
					System.out.print("*");
				}
					
			}
			
				System.out.println();
		}

	}

}
