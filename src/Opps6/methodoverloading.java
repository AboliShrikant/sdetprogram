package Opps6;

public class methodoverloading {
	
	int a;
	int b;
	
	void sum()   //First 
	 {
		a=10;
		b=20;
		System.out.println(a+b);
	 }
	
	void sum(int x, int y)  //second
	 {
		int a=x;
		int b=y;
		System.out.println(a+b);
	 }
	void sum(int x, int y, int z)  //third
	 {
			
		System.out.println(x+y+z);
	 }
	void sum(int x, double y)    //fourth
	 {
			
		System.out.println(x+y);
	 }
	
	public static void main(String[] args)
	 {
		methodoverloading mo= new methodoverloading();
   //	mo.sum();         //it will call 1st method
   //   mo.sum(10, 90);   //it will call 2nd method bcaz has 2 parameter and data type matches
   //	mo.sum(10, 50.76);  //it will call 3rd method bcaz has 2 parameter and data type matches
     	mo.sum(10, 20, 1230);   //it will call 4th method bcaz has 3 parameter and data type matches
		

	}

}
