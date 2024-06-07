package Opps6;
//Oops concept by object by directly
public class Employee 
{
	//Variables 
	int empid;
	String name;
	int salary;
	int deptno;
	
	void display()
	{
		System.out.println(empid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptno);
		
		System.out.println();
	}
	
	public static void main(String args[])
	{
	//Assigning values to class variable using object- first method 	
		Employee emp1=new Employee();        //object
		emp1.empid=101;
		emp1.name="Akash";
		emp1.salary=20000;
		emp1.deptno=10;
		emp1.display();
				
		Employee emp2=new Employee();
		emp2.empid=102;
		emp2.name="Aboli";
		emp2.salary=30000;
		emp2.deptno=20;
		emp2.display();
		
	 }
	
}
