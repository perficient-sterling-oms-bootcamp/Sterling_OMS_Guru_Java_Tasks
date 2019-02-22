package com.task6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Date date = new Date();
		String sDate1 = obj.next();
      
		Date userDate;

		try {
			userDate = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

			if (userDate.before(date)) {
				String fdate = new SimpleDateFormat("yyyy-MM-dd").format(userDate);
				System.out.println(fdate);

			} else if (userDate.after(date)) {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");

				String day = simpleDateFormat.format(userDate);

				simpleDateFormat = new SimpleDateFormat("MMMM");
				String month = simpleDateFormat.format(userDate);

				simpleDateFormat = new SimpleDateFormat("YYYY");
				String year = simpleDateFormat.format(userDate);
				System.out.println(day + " " + month + " " + year);
			}
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}

}
