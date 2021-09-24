package week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "paypal india";
		char[] chararr = str.toCharArray();
		Set <Character> charSet = new LinkedHashSet<Character>();
		
		//iterate through the character array and the char to LinkedHashSet
		for (int i=0;i<chararr.length;i++)
		{
			if(chararr[i]!=' ')
			{
				charSet.add(chararr[i]);
			}
			
		}
		System.out.println(charSet);

	}

}
