package Day1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a:");
		int a=sc.nextInt();
		System.out.println("Enter the value for b:");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("The sum of a and b is:" +c);
		int d=(a+b)/2;
		System.out.println("The average of a and b is:" +d);
		int e=a-b;
		System.out.println("The difference of a and b is:" +e);
		int f=a*b;
		System.out.println("The product of a and b is:" +f);

	}

}
