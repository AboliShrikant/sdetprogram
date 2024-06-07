
public class Operators2
{
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		
		
		
	//Arithmatic operators 
		System.out.println("Arithmatic Operators" );

		System.out.println("Addition of two numbers is "+(a+b));
		System.out.println(a-b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(b/a);
		System.out.println(a%b);
		
		
	//Relational Operators
		System.out.println("Relational Operators" );
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
	//Logical operators
		System.out.println("Logical  Operators" );
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);

		
	//Assignment operators
		int c;
		c=a;
		System.out.println(c);  //10
		
		c=b;
		System.out.println(c);  //20
				
	//Increment Operator
		System.out.println("increment Operators" );
		c=100;
		c++;         //c=c+1    //increment by 1
		c+=5;        //c=c+5   //increment by more than 1 .. then use ..... plus equal to  //assignment operators
		
		System.out.println(c);
		
	//Decrement operator
		System.out.println("Decreament Operators" );
		c--;         //c=c-1   //decrement by 1
		
		c-=5;        //c=c-5   //decrement by more than 1 .. then use ..... minus equal to  //Assignment operator
		
		System.out.println(c);
	
		
	//Assignment operators(=, +=, -=, *=, /=)
		
		System.out.println("Arithmatic Operators" );
		int d;
		d=a;
		System.out.println(d);  //10
				
		d=b;
		System.out.println(d);  //20
		
		d=100;
		d+=5;
		System.out.println(d);
		d+=15;
		System.out.println(d);
		
		d-=5;
		System.out.println(d);
		d-=15;
		System.out.println(d);
		
		d*=10;
		System.out.println(d);
		d*=5;
		System.out.println(d);
		
		d/=10;
		System.out.println(d);
		d/=5;
		System.out.println(d);
		
		


	}

}
