package hoangnq6.day1;

import java.util.Scanner;

/**			
 * cau9			
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
public class cau9 {
	/**
	 * a.	In ra chuỗi đảo ngược của chuỗi đã cho
	 * @param str
	 */
	public static void chuoiDoiNguoc(String str){
		String st="";
		for(int i=0;i<str.length();i++)st=str.charAt(i)+st;
		System.out.println(st);
	}
	
	/**
	 * chuoi sang chữ hoa
	 * @param st
	 */
	public static void chuoiHoa(String st){
		System.out.println(st.toUpperCase());
	}
	
	/**
	 * chuỗi sang chữ thường
	 * @param st
	 */
	public static void chuoiThuong(String st){
		System.out.println(st.toLowerCase());
	}
	
	/**
	 * d.	Đổi chuỗi đã cho sang vừa chữ hoa 
	 * vừa chữ thường (các ký tự chữ hoa thì thành chữ thường và ngược lại)
	 * @param st
	 */
	public static void chuoiThuongHoa(String st){
		String str="";
		for(int i=0;i<st.length();i++){
			if((int)st.charAt(i)>96)
			str+=st.toUpperCase().charAt(i);
			else 
			str+=st.toLowerCase().charAt(i);
		}
		System.out.println(str);
	}
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao chuoi ki tu : ");
		String st= scanner.nextLine();
		chuoiDoiNguoc(st);
		chuoiHoa(st);
		chuoiThuong(st);
		chuoiThuongHoa(st);
		
	}
}
