package dailyassignments;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1124;
		int temp=num;
		int sum=0;
		int product=1;
		
		for(;num>0;)
		{
			int lastdigit=num%10;
			sum=sum+lastdigit;
			num=num/10;
		}
		System.out.println(sum);
		
		num=temp;
		for(;num>0;)
		{
			int lastdigit=num%10;
			product=product*lastdigit;
			num=num/10;
			
		}
		System.out.println(product);
		
		if(sum==product)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not a Spy number");
		}
	}

}
