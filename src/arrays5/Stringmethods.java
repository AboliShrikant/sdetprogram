package arrays5;

public class Stringmethods {

	public static void main(String[] args) {

		String s="Welcome";
		
	//length
		System.out.println("length method "); 
		System.out.println(s.length());  //no. of caharacter in string
		
	//concatenation
		System.out.println("concatenation method"); 
		String s1= "Welcome to";
		String s2="My project";
		System.out.println(s1+s2);     ///s1+s2
		
		System.out.println(s1.concat(s2));  ///s1.concat(s2)
		
		System.out.println("Welcome to" +"My project");
		
	//Equals	
		System.out.println("Equals method"); 

		String s3="Welcome";
		String s4="WELCOME";
		
		System.out.println(s3.equals(s4));      //s3.equals(S4)
		
		System.out.println(s3.equals(s));      //s3.equals(S4)
		
	//EqualIgnorecase	
		System.out.println("EqualIgnorecase method");
				
		System.out.println(s3.equalsIgnoreCase(s4));     //s3.equalsIgnoreCase(s4)
		
		
	//contains 	
		System.out.println("contains method");	

		System.out.println(s3.contains("Wel"));
		System.out.println(s3.contains("wel"));
		System.out.println(s3.contains("abc"));
			
	//Substring	
		System.out.println("Substring method");	
		

		System.out.println(s.substring(0, 4));
		System.out.println(s.substring(3, 7));
		System.out.println(s.substring(3, 6));
		System.out.println(s.substring(2, 5));


	//replace	
		System.out.println("replace  method");	

		System.out.println(s.replace('e', 'a'));
		System.out.println(s.replace("come", "done"));
	}

}
