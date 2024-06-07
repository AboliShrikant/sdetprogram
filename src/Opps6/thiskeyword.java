package Opps6;

public class thiskeyword 
{
	
	int a;
	int b;
	
	void sum()
	{
		a=10;
		b=20;
		System.out.println(a+b);
				
	}
	void sum (int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
				
	}
	
	void sum(int a, int b,int c)
	{
		System.out.println(a+c+b);
	}
	void sum(int a, double b,int c)
	{
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {

		thiskeyword mo= new thiskeyword();
		   //mo.sum();         //it will call 1st method
		     // mo.sum(10, 90);   //it will call 2nd method bcaz has 2 parameter and data type matches
		   //	mo.sum(10, 50,76);  //it will call 3rd method bcaz has 2 parameter and data type matches
		     mo.sum(10, 26.5, 560);   //it will call 4th method bcaz has 3 parameter and data type matches
				
		
		
		
		
	}

}
