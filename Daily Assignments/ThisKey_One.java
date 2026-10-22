package dailyassignments;

class Employee
{
	int empId;
	String empName;
	double Salary;
	
	
	//Parameterized constructor
	Employee(int empId,String empName,double Salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.Salary=Salary;
	}
	

	void displayDetails()
	{
		System.out.println("Employee Information: "+empId+":"+empName+":"+Salary);
	}
}

public class ThisKey_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(999,"Abinaya",250000);
		Employee e2=new Employee(1000,"Karthick",350000);
		e1.displayDetails();
		e2.displayDetails();
		
		
	}

}
