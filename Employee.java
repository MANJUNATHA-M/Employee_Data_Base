package edbms;

public class Employee {

	private String id;
	private static int count=01;
	private int age;
	private String name;
	private Integer sal;


	Employee(int age,String name,int sal)
	{
		this.id="TCS"+count;
		count++;
		this.age=age;
		this.name=name;
		this.sal=sal;
	}

	public String getId()
	{
		return id;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge()
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public void setName() {
		this.name=name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal() {
		this.name=name;
	}

	@Override
	public String toString()
	{
		return "EMPLOYEE ID: "+id+" --> AGE : "+age+" --. NAME : "+name+" --> SALARY OF EMPLOYEE "+sal;
	}


}
