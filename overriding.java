class Person
{
  String name;
  String address;
  long phone;
  String email;

  public Person(String n,String a,long p,String e)
  {
    name=n;
    address=a;
    phone=p;
    email=e;
  }

  public void getInfo()
  {
    System.out.println("class name is:Person");
    System.out.println("person name is:"+name);
  }
}

class Student extends Person
{
  final String status="fresher";
  public Student(String n,String a,long p,String e)
  {  
    super(n,a,p,e);
  }

  public void getInfo()
  {
    System.out.println("class name is:Student");
    System.out.println("Student name is:"+name);
  }
}

class Employee extends Person
{
  String office;
  double salary;
  String doj;

  public Employee(String n,String a,long p,String e,String o,double sal,String date)
  {
    super(n,a,p,e);
    office=o;
    salary=sal;
    doj=date;
  }

  public void getInfo()
  {
    System.out.println("class name is:Employee");
    System.out.println("employee name is:"+name);
  }
}

class Faculty extends Employee 
{
  String officehours;
  String rank;

  public Faculty(String n,String a,long p,String e,String o,double sal,String date,String oh,String r)
  {
    super(n,a,p,e,o,sal,date);
    officehours=oh;
    rank=r;
  }

  public void getInfo()
  {
  System.out.println("class name is:Faculty");
  System.out.println("Faculty name is:"+name);
  }
}

class Staff extends Employee
{
  String title;

  public Staff(String n,String a,long p,String e,String o,double sal,String date,String t)
  {
    super(n,a,p,e,o,sal,date);
    title=t;
  }

  public void getInfo()
  {
  System.out.println("class name is:Staff");
  System.out.println("Staff name is:"+name);
  }
}

class overriding
{
  public static void main(String[] args)
  {
    Person p=new Person("abc","bangalore",12344678,"adc@vbg.com");
    p.getInfo();
    Student s=new Student("def","bangalore",12344678,"adc@vbg.com");
    s.getInfo();
    Employee E=new Employee("ghi","bangalore",12344678,"adc@vbg.com","Accounts",50000,"12/12/2017");
    E.getInfo();  
    Faculty F=new Faculty("jkl","bangalore",12344678,"adc@vbg.com","CSE",60000,"1/1/2019","8:30 to 4:30","professor");
    F.getInfo();
    Staff st=new Staff("nmo","bangalore",12344678,"adc@vbg.com","Accounts",50000,"12/12/2018","clerk");
    st.getInfo();
  }
}