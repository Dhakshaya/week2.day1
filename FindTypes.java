package week2.day1;

public class FindTypes {
	public static void main(String[] args) {
		
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				int  letter = 0, space = 0, num = 0, specialChar = 0;
                char[] ch = test.toCharArray();
                for(int i=test.length();i<=0;i--)
                {               	
                	
                	if(Character.isLetter(test.charAt(i)))
                	{
                		letter++;
                		System.out.println("letter: " + letter);
                	}
                	
                	if(Character.isDigit(test.charAt(i)))
                	{
                		num++;
                		System.out.println("number: " + num);
                	}
                
                	if(Character.isSpaceChar(test.charAt(i)))
                	{
                		System.out.println("space: " + space);
                	}
                	else
                	{
                		
                		Character.isSpaceChar(test.charAt(i));
                		specialChar++;
                		System.out.println("specialCharcter: " + specialChar);
                	}
                
                }
                
												
	}

}
