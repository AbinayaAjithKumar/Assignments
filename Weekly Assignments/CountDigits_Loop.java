package weeklyassignments;

public class CountDigits_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=987654;
		int countofDigits=0;
		
		for(;num>0;)
		{
			num=num/10; //num=98765
			countofDigits++;
		}
        System.out.println("Count of Digit is:" + countofDigits);
	}

}
