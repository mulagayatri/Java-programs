import java.util.Scanner;

class StringRev{
	public static void main(String args[]) {
		String original,reverse="";
		System.out.println("Enter the string to reverse");
		Scanner sc=new Scanner(System.in);
		original =sc.nextLine();		
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse +original.charAt(i);
			}
		System.out.println(reverse);

	sc.close();
	}
}