package weeklyassignments;

public class EvenOrOdd_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=20;
		
		System.out.println("Even: ");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+ " ");
			}
			
		}
		
		System.out.println("\nODD: ");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
		
			{
				System.out.print(i+" ");
			}
		}

	}

}
