class person //name, address, phn, email
{	String name;
	String address;
	long phn;
	String email;
	person(String n, String address, long phn, String email)
	{
		name = n;
		address = ad;
		phone_no = phn;
		email = em;
	}
	void getinfo()
	{
		System.out.println("The details of a person is:\n");
		System.out.println(+name+"\n"+address+"\n"+phn+"\n"+email+"\n");
	}
}
class student extends person //status(fresher, junior, senior)
{
	student(final string status)
	{
		status = s;
		super(name, address, phn, email);
	}
	void getinfo()
	{
		System.out.println("The details of a student is:");
		System.out.println(+status);
		super(name, address, phn, email);
	}
}
class employee extends person //office , salary, date hired
{
	employee(string o, int s, int dh)
	{
		office = o;
		salary = s;
		date_hired = dh;
		super(name, address, phn, email);
	}
	void getinfo()
	{
		System.out.println("The details of an employee is:");
		System.out.println(+office+"\n"+salary+"\n"+date_hired+"\n");
	}
}
class faculty extends employee //office and a rank
{
	faculty(string office, string rank)
	{
		office = infosys;
		rank = manager;
		super(office, salary, date_hired);
	}
	void getinfo()
	{
		System.out.println("The details of a faculty is:");
		System.out.println(+office+"\n"+rank+"\n");
	}
}
class staff extends employee //title
{
	staff(string title)
	{
		title = administrator;
		super(office, salary, date_hired);
	}
	void getinfo()
	{
		System.out.println("The details of a staff is:");
		System.out.println(+title+"\n");
	}
}
class test
{
	public static void main(String[] args)
	{
		person p= new person("abc","bangalore",12344678,"adc@vbg.com");
		student stu= new student("def","bangalore",12344678,"adc@vbg.com");
		employee emp= new employee("ghi","bangalore",12344678,"adc@vbg.com","Accounts",50000,"12/12/2017");
		faculty f= new faculty("jkl","bangalore",12344678,"adc@vbg.com","CSE",60000,"1/1/2019","8:30 to 4:30","professor");
		staff s= new staff("nmo","bangalore",12344678,"adc@vbg.com","Accounts",50000,"12/12/2018","clerk");
	}
}