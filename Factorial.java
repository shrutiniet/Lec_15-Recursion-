package Lec_15;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=Factorial(n);
		System.out.println(ans);

	}
public static int Factorial(int n)
{
	if(n==0 || n==1)
		return 1;
	return n*Factorial(n-1);
}
}
