package hoangnq6.day1;

import java.util.Scanner;

/**			
 * cau1			
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

public class cau1 {
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao n");
		int n= scanner.nextInt();
		chieuCaoThap(n);
	}
	/**
	 * in ra chiều cao của tháp khi nhập vào n
	 * @param n
	 */
	public static void chieuCaoThap(int n){
		int index=0;
		while(true){
			for(int i=0;i<index;i++){
				System.out.print("* ");
			}
			System.out.println();
			index++;
			if(index>n)break;
		}
	}
}
