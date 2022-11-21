package Lec_15;
import java.util.*;
public class Decreasing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//Print1(n);
		Print2(n);
		// TODO Auto-generated method stub

	}
public static void Print1(int n)
{
	if(n==0)
		return;
	System.out.println(n);

	Print1(n-1);
}
public static int Print2(int n)
{
	if(n==0)
		return 0;
	else
	{
		System.out.println(n);
	}
	return Print2(n-1);
}
}
