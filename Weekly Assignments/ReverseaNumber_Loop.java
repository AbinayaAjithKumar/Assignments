package weeklyassignments;

public class ReverseaNumber_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num=12345;
		int reverseValue=0;
		
		for(;num>0;num=num/10)
		
		{
			int lastDigit=num%10;//5
			reverseValue=reverseValue*10+lastDigit;  //50+4;540+3;5430+2;54320+1			
		}
		System.out.println("Reversed number:" + reverseValue);
	}

}
