package Opps6;

public class StaticExample
{
	int a;    //non static variable
	static int b;   //static variable
	
	void m1()
	{
		System.out.println("This is m1- non static method ");       //non static method 
	}
	static void m2()
	{
		System.out.println("This is m2 - static method");   //static method        // static method 
	}
	
	void m3()
	{
		int a=200;
	 int b=200;
	 
	 m1();
	 m2();
		
	}
	
	

	public static void main(String[] args) ///static method
	{		
		//static method can access only static stuff(direct)
		b=100;
		System.out.println(b);
		m2();
		
		//a=200;   //not accessible ,bcoz it is non static variable.
		
		//m();    //not accessible, becoz it is non static method.
		

	//static method can also access not static stuff but through object(indirect)
           StaticExample se=new StaticExample();
           se.a=200;
           System.out.println(se.a);
           se.m1();
		
		se.m3();
	}

}
