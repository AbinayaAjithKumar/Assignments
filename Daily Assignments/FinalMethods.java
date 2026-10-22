package dailyassignments;

class EmployeeOne
{
	final void calculateBonus()
	{
		double diwaliBonus = 100000;
	}
}
class Manager extends EmployeeOne
{
	void calculateBonus()
	{
		double diwaliBonus = 50000;
		System.out.println(diwaliBonus);
	}
	
}
public class FinalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		m.calculateBonus();

	}

}
