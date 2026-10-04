package weeklyassignments;

public class Palindrome_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int given= 1221;
		int temp=given;
		int sum=0;

		for( ;given>0;given=given/10)
		{
			int lastDigit=given%10; //1
			sum=sum*10+lastDigit; //1;10+2=12;..	
		}
		
		System.out.println(sum);
		
		if(sum==temp)
		{
			System.out.println(sum+" It's a Palindrome:");
		}
		else 
		{
			System.out.println(sum+ " It's not a Palindrome:");
		}
		
	}
}


