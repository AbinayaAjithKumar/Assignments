package dailyassignments;

final class SecurityPolicy 
{
	void displayPolicy()
	{
		System.out.println("Final Class cannot be inherited");
	}
}
class AdminPolicy extends SecurityPolicy
{
	int code=101;
}
public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminPolicy ap=new AdminPolicy();
		System.out.println(ap.code);
		ap.displayPolicy();
		
		
	}

}
