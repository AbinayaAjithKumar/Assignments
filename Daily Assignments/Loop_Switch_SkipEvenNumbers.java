package dailyassignments;

public class Loop_Switch_SkipEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		do 
		{
			
		i++;
		if(i>15)
		{
			break;
		}
		 if(i%2==0)
		 {
		   continue;
		 }
		{
			System.out.println(i);
		
		}
		}while(i<20);
		
	}
	}
	
