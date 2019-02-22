package com.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int unit;
		System.out.println("Enter the unit:");
		unit=obj.nextInt();
		System.out.println("Enter the list of number:");
		List<Integer> li = new ArrayList();
		for(int i=0;i<unit;i++)
		{
			li.add(obj.nextInt());
		}
		
		for(int x:li)
		{
			if(x%2==0)
			{
				System.out.println(x+"--odd");
			}
			else
			{
				System.out.println(x+"--even");
			}
		}

	}

}
