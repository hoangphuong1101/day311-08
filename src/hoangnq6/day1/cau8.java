package hoangnq6.day1;

/**			
 * cau8			
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
import java.util.Scanner;

public class cau8 {
	/**
	 * ước chung lớn nhất 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int UCLN(int a,int b){
		if(a==b)return a;
		if(a<b){
			if(b%a==0)return a;
			return UCLN(b%a,a);
		} 
		return UCLN(b, a);

	}
	/**
	 * bội chung nhỏ nhất
	 * @param a
	 * @param b
	 * @return
	 */
	public static int BCNN(int a,int b){
		return a*b/UCLN(a, b);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao a");
		int a= scanner.nextInt();
		System.out.println("nhap vao b");
		int b= scanner.nextInt();
		System.out.println("ước chug lớn nhất ");
		System.out.println(UCLN(a, b));
		System.out.println("bội chung nhỏ nhất");
		System.out.println(BCNN(a, b));
	}
}
