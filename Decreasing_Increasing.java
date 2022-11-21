package Lec_15;
import java.util.*;
public class Decreasing_Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Print1(n);
	}
public static void Print1(int n)
{
	if(n==0)
		return;
	System.out.println(n);
	Print1(n-1);
	System.out.println(n);
}
}
