package Lec_15;
import java.util.*;
public class Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
//Print1(n);
Print2(1,n);


	}
public static void Print1(int n)
{
	if(n==0)
		return;
	Print1(n-1);
	System.out.println(n);
}
public static void Print2(int a, int n)
{
	if(a>n)
		return;
	System.out.println(a);
	Print2(a+1,n);
}
}
