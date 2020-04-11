package Strings_Practice;

public class FindVowels {

	public static void main(String[] args) {
		
		String s = "This is your first java program";
		char ch[] = new char[s.length()];
		s.getChars(0, s.length(), ch, 0);
		System.out.println(ch);
		int count = 0;
		
		char c[]= {'a','e','i','o','u'};
		for (int i = 0; i<ch.length;i++)
		{
			
		for (int j =0;j <c.length;j++)
		{
			if (ch[i]==c[j])
			{
				System.out.println(c[j]);
				count++;
			}
			
		}
		
		}
		System.out.println("Total vowels count is : " +count);
	}
	}

