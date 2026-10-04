package weeklyassignments;

public class AmstrongNumber_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=153;
		int count=0;
		int sum=0;
		
		for(;num>0;num=num/10)
		{
			count++;
		}
		
		for(;num>0;)
		{
			int lastDigit=num%10; //3
			sum=sum+Math.powExact(lastDigit, count);
			num=num/10;
		}
		
		if(sum==num)
		{
			System.out.println("153 is an Amstrong Number");
		}
		else
            System.out.println("153 is not an Amstrong Number:");
	}
//An Amstrong number is a number that is equal to the sum of its digits, where each digit is raised to the power of the total number of digits.
}
