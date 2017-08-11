package hoangnq6.day1;

import java.util.Scanner;

/**			
 * cau4			
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
public class cau4 {
	/**
	 * tính giai thừa
	 * @param n
	 * @return
	 */
	public static int giaiThua(int n){
		if(n<1)return 1;
		if(n<3)return n;
		return n*giaiThua(n-1);
	}
	/**
	 * Viết chương trình tính : 
		S=15-1+1/2-1/3!+....+(-1)n  1/n!
	 * @param n
	 * @return
	 */
	public static float tinhTong(int n){
		if(n<1)return 15;
		return (float) Math.pow(-1, n)/(float)giaiThua(n)+tinhTong(n-1);
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao n");
		int n= scanner.nextInt();
		System.out.println(tinhTong(n));
		
	}
}
