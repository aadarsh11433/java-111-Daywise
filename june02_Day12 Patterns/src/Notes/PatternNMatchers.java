package Notes;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class PatternNMatchers {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("[^abc]");
		
		Matcher m=p.matcher("a7b@z#9");
		
		int count =0;
//		if(m.find())
//		System.out.println(m.start());
//		
//		System.out.println(m.group()+"ab");
		
		while (m.find()) {
			
			System.out.println(m.start() + "------" + m.end() + "------" + m.group());
			}
			System.out.println("The no of occurences:" + count);
			
			System.out.println("======================");
			
			
			Pattern p2 = Pattern.compile("a{2}|b");
			Matcher m2 = p2.matcher("abaabaaab");
			while (m2.find()) {
				count++;
				System.out.println(m2.start() + "-------" + m2.group());
			}
			
			System.out.println("The no of occurences:" + count);
			
			System.out.println("======================");
			
			System.out.println(Pattern.matches("[ab]", "abcd"));//false (not a or m or n)
			System.out.println(Pattern.matches("[amn]", "m"));//true (among a or m or n)
			System.out.println(Pattern.matches("a{1}m{1,}[a-z]a", "ammmna"));//false (m and a comes more than once)
			
			System.out.println("======================");
			
			System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9053038949"));//true
			System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true
			System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
			System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)
			System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true
			System.out.println("by metacharacters ...");
			System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true
			System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)

			
			
			Pattern p3 = Pattern.compile("\\s");
			String[] s = p3.split("Hello how are you");
			for(String s1:s) {
			System.out.println(s1);
			}
			
			
			String str = "Hello how are you";
			String[] s2 = str.split("howdfdd");
			for(String s1:s2) {
			System.out.println(s1);
			}
			
	}

}
