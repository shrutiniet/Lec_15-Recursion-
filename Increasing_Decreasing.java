package Lec_15;
import java.util.*;
public class Increasing_Decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Print1(1,n);

	}
	public static void Print1(int a, int n)
	{
		if(a>n)
			return;
		System.out.println(a);
		Print1(a+1,n);
		System.out.println(a);
	}

}
