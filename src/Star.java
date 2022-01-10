import java.util.Scanner;

public class Star {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter the limit");
		int input = sc.nextInt();
		for(int i = 0;i <= input-1;i++)
		{
			
			for(int j = 3*(input-1);j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k = input-1;k >= input-1-i;k--)
				
			{
					System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		for(int i=1;i<=input-1;i++)
		{
			for(int j=input-1;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");

			}
			for(int j=input;j<=2*input;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=1;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");

			}

			System.out.println("");
		}
		
		
		
		
		for(int i=1;i<=input-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=input-1;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int j=0;j<=1;j++)
			{
				System.out.print(" ");
			}
			for(int j=input;j<=2*input;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=input-1;j>=i;j--)
			{
				System.out.print("  ");
			}
			
			for(int k=input-1;k>=i;k--)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		
		
		
		
		
		for(int i = 0;i <= input-1;i++)
		{
			for(int j = 0;j<=2*(input-1);j++)
			{
				System.out.print(" ");
			}
			for(int j = 0;j < i;j++)
				{
					System.out.print(" ");
				}
			for(int k = 0;k <= input-1-i;k++)
				
			{
					System.out.print("* ");
			}
			System.out.print("\n");
		}
		
	}
	

}
