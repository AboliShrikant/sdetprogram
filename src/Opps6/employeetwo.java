package Opps6;
//Oops concept by method

public class employeetwo
{
	//variable
	int empid;
	String empname;
	int salary;
	int deptno;
	
	void setdata(int id, String name, int sal,int dno)  //initiazlizing values  // take parameter from outside assign to the class variable
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
		
		
	}
	void display()    //print values
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
		
		System.out.println();
	}
	
	public static void main(String args[])
	{
	//Assigning values to class variable using method- Third method 	
	
		employeetwo emp1=new employeetwo();      //First Employee
		emp1.setdata(121,"AS",12345,12);  //assign values to class variable using set data method 
		emp1.display();
		
		employeetwo emp2=new employeetwo();       //Second Employee
		emp2.setdata(122, "Ap", 123456, 15);
		emp2.display();
	}
	

}
