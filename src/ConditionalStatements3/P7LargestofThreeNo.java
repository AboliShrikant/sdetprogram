package ConditionalStatements3;

public class P7LargestofThreeNo {

	public static void main(String[] args) {
		int a=10;
		int b=30;
		int c=100;
		
		if((a>b) && (a>c))
		{
			System.out.println("A is lagest no among thrre value");
			
		}
		else if((b>c) && (b>c))
		{
			System.out.println("B is lagest number among three values");
		}
		else
		{
			System.out.println("C is largest number among three values");
		}

	}

}
