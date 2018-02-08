import java.util.Scanner;
public class Array {
	public static void main(String args[]) {
		int n;
		System.out.println("Enter n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int  s[]= new int [n];
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter the numbers to be stored");
			s[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		System.out.println("the numbers are:"+s[i]);

		sc.close();
	     }
	}
}