package dailyassignments;

class Company
{
	final String companyName = "Tech Solutions Pvt.Ltd";
	final int maxEmployeeLimit=100;
	
	void displayCompanyDetails()
	{
		System.out.println("Company Name: "+companyName);
		System.out.println("Max Employee Limit: "+maxEmployeeLimit );
	}
}

public class FinalVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c=new Company();
		c.displayCompanyDetails();
		c.maxEmployeeLimit=10;
			

	}

}
