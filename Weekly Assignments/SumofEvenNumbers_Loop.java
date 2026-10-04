package weeklyassignments;

public class SumofEvenNumbers_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=50;
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				int evenNumber=i;
				sum=sum+evenNumber;
			}
		}
		System.out.println("Sum of Even Number is: "+sum);
	}

}
