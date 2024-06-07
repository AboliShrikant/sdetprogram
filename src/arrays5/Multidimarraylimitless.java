package arrays5;

public class Multidimarraylimitless {

	public static void main(String[] args) {

		//declare and store  of multidimensional array
		int a[][]= { {10,20,30}, {40,50,60}, {70,80,90},{100,110,120}, {130,140,150},{160,170,180} };
		
		for(int i[]:a)
		{
			for(int j:i)
			{
				System.out.print(j+"  ");
			}
			
			System.out.println();
		}	
	}
}
