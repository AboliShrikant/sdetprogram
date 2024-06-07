package Opps6;
//Oops concept by constructor method
public class employeeone 
{
	//Variables 
	int empid;
	String empname;
	int salary;
	int deptno;
	
	//Constructor
	employeeone(int id, String name, int sal, int dno)
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
	}
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
		
		System.out.println();
	}
	
	public static void main(String args[])
	{
		
	//Assigning values to class variable using constructor---Second Method of Oops
		//employeeone emp1=new employeeone(id,name,sal,dno);          //Basic formula
		
		employeeone emp1=new employeeone(110,"Shri",12000,10);  //have to pass parameter in constructor only       //First Employee
		emp1.display();
		
		
		employeeone emp2=new employeeone(111,"uku",13000,12);         //second employee
		emp2.display();
		
	}

}
