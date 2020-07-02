// Java program to count number of 
// distinct characters in a string 
import java.util.*; 

class Main
{ 
	
	
	// Count the distinct characters in a string 
	static int countDistinct(String s) 
	{ 
		// create a map to store the 
		// frequency of characters 
		Set<Character> m = new HashSet<Character>(); 
	
		// traverse the string 
		for (int i = 0; i < s.length(); i++) 
		{ 
			
			// increase the frequency of character 
			m.add(s.charAt(i)); 
			
		} 
		
		return m.size(); 
	} 
	
	// Driver code 
	public static void main(String []args) 
	{ 
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine() ; 
	
			System.out.println(countDistinct(str)); 
	} 
} 

// Code By Y Prahasith
