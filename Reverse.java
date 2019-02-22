package com.task6;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int number = obj.nextInt();
		int temp;
		int reverse=0;
		while(number!=0)
		{
			temp= number%10;
				reverse = reverse*10+temp;
		number= number/10;
		}
		System.out.println(reverse);
	}

}
