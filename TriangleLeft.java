import java.util.Scanner;

public class TriangleLeft {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Integer num for display star pattern ");
		int n=scan.nextInt();
		
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
