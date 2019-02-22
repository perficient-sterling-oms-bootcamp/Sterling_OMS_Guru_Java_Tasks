package com.task6;

import java.util.Scanner;

public class Question9 {
	
	Question9(String str1, String str2) {
		try {
			new Question9(Integer.parseInt(str1), Integer.parseInt(str2));
		} catch (NumberFormatException e) {
			System.out.println(str1.toUpperCase()+"_"+str2.toUpperCase());
			
		}
	}
	
	Question9(int n1, int 	n2) {
		System.out.println(n1+n2);
	}
	
	
	public static void main(String[] args) {
		String str1;
		String str2;
		Scanner obj = new Scanner(System.in);
		str1=obj.next();
		str2=obj.next();
		/*if(isNumericValue(str1) || isNumericValue(str2)) {
			new Question9(str1,str2);
		} */
		new Question9(str1, str2);

	}
}
 