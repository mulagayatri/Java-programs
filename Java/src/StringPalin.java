import java.util.Scanner;
public class StringPalin {
		public static void main(String args[]) {
			String original,reverse="";
			System.out.println("Enter the string to check if it is a palindrome or not");
			Scanner sc=new Scanner(System.in);
			original =sc.nextLine();		
			int length=original.length();
			for(int i=length-1;i>=0;i--) {
				reverse=reverse +original.charAt(i);
				}
			if(reverse.equals(original)) {
				System.out.println("the string is palindrome");
			}
			else {System.out.println("NOt  a palidrome");}

		sc.close();
		}
	}

