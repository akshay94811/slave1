package Programs;

public class G 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>=0;j--)
			{
				for(int k=1;k<=j;k++)
				{
					System.out.print("*"+" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
