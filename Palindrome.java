package week2.day1;

public class Palindrome {
	public static void main(String[] args) {
		
		
		  String str = "Madam";
		  String rev = "";
		
		  for(int i=str.length()-1;i>=0;i--)
		  {			 
			  char ch = str.charAt(i);			
			  rev = ch+rev;
			  System.out.println(rev);
			  
		  }
		  if(str.equals(rev))
		  {
			System.out.println("Palindrome");
			
		  }
		  
		
	}

	
}
