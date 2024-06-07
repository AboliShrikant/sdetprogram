package arrays5;

public class Objectarrayex {

	public static void main(String[] args) {

		//Declaration of object
		Object a[]=new Object [6];
		
		//store the object
		a[0]=10;              //Integer
		a[1]=10.678;          //Double
		a[2]='g';             //Character
		a[3]="Welcome";       //String
		a[4]=true;            //boolean
		a[5]=10.5f;            //float
		
		
		//Read an object
		//System.out.println(a[1]);
		
		
		
		System.out.println("By for each loop method ");
		for(Object i:a)
		{
			System.out.println(i);
		}
		
	}

}
