//c:\WINDOWS\system32\c...
//Program to implement OOPs concept
abstract class EmployeeDetails //encapsulation, abstraction
{
	private String name; //data hiding 
	private int emp_ID;
	
	public EmployeeDetails(String n, int id)
	{
		name=n;
		emp_ID=id;
	}
	public void common_emp_details()
	{
		System.out.println("Employee name: "+name);
		System.out.println("Employee id: "+emp_ID);
	}
	public abstract void confidential_emp_details();
}

class HR extends EmployeeDetails //inheritance
{
	private double hike;
	private String performance;
	private boolean critical_resource;

	public HR(String n, int id, double h, String p, boolean cr)
	{
		super(n,id);
		hike=h;
		performance=p;
		critical_resource=cr;
	}

	public void confidential_emp_details()//overriding
	{
		System.out.println("Employee hike is: "+hike);
		System.out.println("Employee performance is: "+performance);
		System.out.println("Is employee a critical resource? "+critical_resource);
	}
}

class implement
{
	public static void main(String[] args)
	{
		//EmployeeDetails e=new EmployeeDetails("abc",101);
		/*Object for an abstract cannot be created*/
		HR hr=new HR("abc",101,5000,"good",true);
		hr.common_emp_details();
		hr.confidential_emp_details(); 
	}
}