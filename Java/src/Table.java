import java.util.Scanner;

public class Table {
	public static void main(String args[]) {
		int n,i;
		System.out.println("Enter the number whoose table you want to generate");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<=10;i++) {
			System.out.println(n + " " +"*"+ " " + i + " " + "=" + (n*i));
			
		}
		
	}
}
