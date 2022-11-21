package Lec_15;
import java.util.*;
public class Fibonaaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ans=Fibo(n);
System.out.println(ans);
	}
public static int Fibo(int n)
{
	if(n<=1)
		return n;
	int sp1=Fibo(n-1);
	int sp2=Fibo(n-2);
	return sp1+sp2;
}
}
