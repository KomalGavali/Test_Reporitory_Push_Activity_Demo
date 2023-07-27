package com.hefshine.classwork;

import java.util.Scanner;

public class Ass3Q1Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t1=0,t2=1,num,i=0;
		int sum;
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		
		/*for(i=0;i<=num;i++)
		{
			System.out.print(t1+ "  ");
			sum=t1+t2;
			t1=t2;
			t2=sum;
		}*/
		
		while(i<=num)
		{
			System.out.print(t1+ "  ");
			System.out.print(t2+" ");
			sum=t1+t2;
			t1=t2;
			t2=sum;
			i++;
			System.out.println();
		}
		


	}

}
