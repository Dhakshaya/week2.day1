package week2.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {		
		
		String text1 = "stops";
		String text2 = "potss";
		int text1length = text1.length();
		int text2length = text2.length();		
		
		if(text1length==text2length)
				{
			char[] chtext1 = text1.toCharArray();
			char[] chtext2 = text1.toCharArray();
			Arrays.sort(chtext1);
		//	System.out.println(chtext1);
			Arrays.sort(chtext2);
		//	System.out.println(chtext2);
				
			if(Arrays.equals(chtext1,chtext2))
			{
				System.out.println("Anagram");
			}
				}
				
			
				
				
	}

}
