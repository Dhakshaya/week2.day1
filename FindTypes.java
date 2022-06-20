package week2.day1;

public class FindTypes {
	public static void main(String[] args) {
		
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				int  letter = 0, space = 0, num = 0, specialChar = 0;
                char[] ch = test.toCharArray();
                for(int i=test.length()-1;i>=0;i--)
                {        	
                	
                	if(Character.isLetter(ch[i]))
                	{
                		letter++;        // Count of Letter    
                	
                	}
                	else if(Character.isDigit(ch[i]))
                	{
                		num++;         // Count of num        		
                	
                	}
                	else if(Character.isSpaceChar(ch[i]))
                	{ 
                		space++;      	 // Count of space        	     	
                	}
                	
                	else 
                	{              		
                		
                		specialChar++;  // Count of specialCharacter
                		
                		               		
                	}
                
                }
                System.out.println("letter: " + letter);
                System.out.println("number: " + num);
                System.out.println("space: " + space);	
                System.out.println("specialChar: " + specialChar);
	
	}
}



