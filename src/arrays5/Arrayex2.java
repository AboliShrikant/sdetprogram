package arrays5;

public class Arrayex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare an array
		String s[]=new String [3];
		
		//Store an array
		s[0]="Welcome";
		s[1]="to the";
		s[2]="Array example of Aboli";
		
		
		//Read an array
		//System.out.println(s[0]+ s[1]+s[2]);
	
	/*	for(int i=0; i<=2;i++)
		{
			System.out.println(s[i]);
		}
		*/
		
		for(String i:s)
		{
			System.out.println(i);
		}
	}

}
