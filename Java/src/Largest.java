import java.util.Scanner;

public class Largest {

	int a,b,c;
 public static void main(String args[]){
	 System.out.println("Enter the three numbers");
	 Scanner sc=new Scanner(System.in);
	 int a =sc.nextInt();
	 int b=sc.nextInt();
	 int c=sc.nextInt();
	 if(a>b&&a>c) {
		 System.out.println("a is the largest");
		 
	 }
	 else if(b>a&&b>c) {
		 
		 System.out.println("b is largest");
	 }
	 else {
		 
		 System.out.println("c is largest");
	 }
	 sc.close();
 }
}
