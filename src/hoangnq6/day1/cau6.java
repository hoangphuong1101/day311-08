package hoangnq6.day1;

import java.util.Scanner;

/**			
 * cau6			
 *			
 * Version 1.0			
 *			
 * Date: 07-08-2017			
 *			
 * Copyright 			
 *			
 * Modification Logs:			
 * DATE                 AUTHOR          DESCRIPTION			
 * -----------------------------------------------------------------------			
 * 07-08-2017         HoangNQ6            Create			
 */	
public class cau6 {
	/**
	 * 6.	Tính n!!	=	1*3*5*…..*n(n lẽ)
			=	2*4*6*….*n(n chẵn)
	 * @param n
	 * @return
	 */
	public static int giaiThua(int n){
		if(n<1)return 1;
		if(n<3)return n;
		return n*giaiThua(n-2);
	}
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao n");
		int n= scanner.nextInt();
		System.out.println(giaiThua(n));
	}
}
