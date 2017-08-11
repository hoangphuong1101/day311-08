package hoangnq6.day1;

import java.util.Scanner;

/**			
 * cau7			
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
public class cau7 {
	/**
	 * tổng các chữ số của một số nguyên dương m 
	 * @param n
	 * @return
	 */
	public static int tong(int n){
		int tong=0;
		while(true){
			tong+=n%10;
			n/=10;
			if(n==0)break;
		}
		return tong;
	}
	
	/**
	 * tích các chữ số của một số nguyên dương m 
	 * @param n
	 * @return
	 */
	public static int tich(int n){
		int tong=1;
		while(true){
			tong*=n%10;
			n/=10;
			if(n==0)break;
		}
		return tong;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao n");
		int n= scanner.nextInt();
		System.out.println("tong cua "+n+" la: "+tong(n));
		System.out.println("tich cua "+n+" la: "+tich(n));
	}
}
