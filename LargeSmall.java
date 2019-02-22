package com.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargeSmall {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int unit;
		System.out.println("Enter the unit:");
		unit = obj.nextInt();
		System.out.println("Enter the list of number:");
		List<Integer> li = new ArrayList();
		for (int i = 0; i < unit; i++) {
			li.add(obj.nextInt());
		}

		Collections.sort(li);
		System.out.println("smallest number" + li.get(0));
		System.out.println("Largest number" + li.get(li.size() - 1));
	}

}
