package Opps6;
//Example for four different types of methods 
public class Calculation 
{
	private static Calculation cal;
	int a;
	int b;
	
	
//1. method may not take parameter
//4.method may not return any value		
		
	/*void sum()
	{
		System.out.println(a+b);
	}*/

//2. method  take parameter
	/*void sum(int x, int y)
		{
			x=a;
			y=b;
			System.out.println(a+b);
		}
	*/
	
//3. method  may return some values 
		int sum()
		{
			return (a+b);
		}	
	
	
	
	
	public static void main(String args[])
	{
		Calculation.cal =new Calculation();
//1. method may not take parameter
//4.method may not return any value		
	/*	cal.a=100;
		cal.b=200;
		cal.sum();
	*/
	
//2. method take parameter
       /*  cal.sum(1000, 1223);
        */ 
 //3. method  may return some values 
        
		cal.a=100;
		cal.b=300;
		int r=cal.sum();
		System.out.println(r);
		
	}
}
