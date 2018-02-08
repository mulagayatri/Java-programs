import java.util.Scanner;
public class Prime {
	public static void main(String args[]) {
		int a;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int m=a/2;
		if(m!=0) {
			
			System.out.println("The number"+a+ "is prime number");;
	     }
		else {
			
			System.out.println("not  a prime number");
		}
		sc.close();
		}
	}

