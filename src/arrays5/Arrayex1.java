package arrays5;

public class Arrayex1 {

	public static void main(String[] args) {
		

		//Declare an array
		int a[]=new int[6];       //declration of array with 6 element
		
		//Store Element into  array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=70;
		
		
		//Read Element from an array
		
		//System.out.println(a[3]);
	
		/*	for(int i=0; i<=4;i++)                           //For loop
			{
			System.out.println(a[i]);
			}
		*/
		
		for(int i:a)                                                 //For....each loop
		{
			System.out.println(i);
		}
		
		System.out.println("length of an array is " +a.length);       //retuen the lenght of an array
	}

}
