import java.util.Scanner;

public class second{
	public static void main(String args[]){
		Scanner sun=new Scanner(System.in);
		
		double no1,no2,ans;
		
		System.out.println("enter first number");
		no1=sun.nextDouble();
		
		System.out.println("enter second number");
		no2=sun.nextDouble();
		
		ans=no1+no2;
		
		System.out.println("Answer is " + ans); 
	}
}