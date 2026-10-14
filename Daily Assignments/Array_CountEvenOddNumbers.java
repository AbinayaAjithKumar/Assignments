package dailyassignments;

public class Array_CountEvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {11, 24, 35, 42, 56, 67, 80, 93};
		int Evencount=0;
		int Oddcount=0;
		for(int index=0;index<num.length;index++)
		{
			if (num[index]%2==0)
			{
				Evencount++;
			}
			else
			{
				Oddcount++;
			}
			
			
		}
		System.out.println("Even numbers count is: " + Evencount);
		System.out.println("Odd numbers count is: "+Oddcount );
	}

}
