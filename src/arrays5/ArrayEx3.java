package arrays5;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		//if I don't know array length then use below declare method instead of String s[]=new String [3];
		//WE Can store any number of element
		
		int a[]= {100, 200, 300, 400, 500}; 
		
		int sum=0;
		
		for(int i:a)
		{
			System.out.println(i);
			
			sum=sum+i;
		}
			System.out.println("Sumation all elements is" +sum);
			
		
			
		
		
		
		
		
	}

}
