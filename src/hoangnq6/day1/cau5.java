package hoangnq6.day1;

import java.util.Scanner;

/**			
 * cau5			
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
public class cau5 {
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
	 * 5.	Viết chương trình tính  :
		S=1+1/3!+1/5!+…..+1/(2n-1)!
	 * @param n
	 * @return
	 */
	public static float tinhTong(int n){
		if(n<2)return 1;
		return 1/(float)giaiThua(2*n-1)+tinhTong(n-1);
	}
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao n");
		int n= scanner.nextInt();
		System.out.println(tinhTong(n));
		
	}
}
