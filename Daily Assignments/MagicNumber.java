package dailyassignments;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=172;
		int sum=0;
		
		for(;num>9;)
		{
			for(;num>0;)
			{
				int lastdigit=num%10;
				sum=sum+lastdigit;
				num=num/10;		
			}
			num=sum; //10
			sum=0;
		}
		
		if(num==1)
		{
			System.out.println("It's a magic number");
		}
		else
		{
			System.out.println("It's not a magic number");
		}
	}

}
