package week2.day1;

public class Palindrome {
	public static void main(String[] args) {
		
		
		  String str = "Madam";
		  String rev = "";
		  for(int i=str.length();i<=0;i--)
		  {
			  char ch = str.charAt(i);
			  rev = ch+rev;  
			  
		  }
		  
		  if(str.equals(rev))
		  {
			System.out.println("Palindrome");
			
		  }
		  
		
	}

	
}
