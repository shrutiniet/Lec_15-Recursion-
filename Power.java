package Lec_15;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int n=sc.nextInt();
int ans=Power(1,x,n);
System.out.println(ans);
	}
public static int Power(int a, int x, int n)
{
	if(n==0 || a>n)
		return 1;
	return x*Power(a+1,x,n);
	
}
}
