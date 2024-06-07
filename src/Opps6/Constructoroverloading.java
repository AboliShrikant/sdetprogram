package Opps6;

public class Constructoroverloading {
	
	int a=0;
	int b=0;
	double c=0;
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	 Constructoroverloading()  //1st constructor   //default constructor type
	 {
		 a=10;
		 b=20;
		 c=30.5;
	 }
	 
	 Constructoroverloading(int x, int y)   //2nd  constructor   //parameterized constructor type
	 {
		 a=x;
		 b=y;
	 }
	 
	 Constructoroverloading(int x, double z)   //3rd constructor   //parameterized constructor type
	 {
		 a=x;
		 c=z;
	 }
	 Constructoroverloading(int x, int y, double z)   //4th constructor   //parameterized constructor type
	 {
		 a=x;
		 b=y;
		 c=z;

	 }
	 Constructoroverloading(int x, double y, int z)  //5th constructor    //parameterized constructor type
	 {
		 a=x;
		 c=y;
		 b=z;
	 }
	

	public static void main(String[] args) 
	{
	//	Constructoroverloading co=new Constructoroverloading();
		 ///Above constructor will call 1 st method bcaz it has no parameters.

	//  Constructoroverloading co=new Constructoroverloading(10,20);
		  //Above con. check for 2nd and 3rd con bcaz it has 2 paarameter but call 2nd becaz it matches the data type		
		
	//	Constructoroverloading co=new Constructoroverloading(10,20.5);
		  //Above con. check for 2nd and 3rd con bcaz it has 2 paarameter but call 3rd becaz it matches the data type		

	//Constructoroverloading co=new Constructoroverloading(10,15,20.5);
	  //Above con. check for 4th and 5th con bcaz it has 3 parameter and same data type but call 4th becaz it matches the order of parameter of 4th	but not to 5th	

	
	Constructoroverloading co=new Constructoroverloading(10,20.5,90);
	  //Above con. check for 4th and 5th con bcaz it has 3 parameter and same data type but call 5th becaz it matches the order of parameter of 5th but not to 4th	

		co.display(); 
	}

}
