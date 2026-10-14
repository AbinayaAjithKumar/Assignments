package dailyassignments;

public class Loop_Switch_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice = 3;
		int a = 20;
		int b = 5;
		int num=1;
		
		do {
			
			switch(choice)
			{
			case 1:
				System.out.println("Addition -> " + a+b);
				break;
			case 2:
				System.out.println("Subtraction -> " + (a-b));
				break;
			case 3:
				System.out.println("Multiplication -> " + a*b);
				break;
			case 4:
				System.out.println("Division -> " + a/b);
				break;
			default:
				System.out.println("Sucessfuly Exite");
				break;
			}
			choice++;
			break;
		}while(choice<=5);

	}

}
