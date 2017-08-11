package hoangnq6.day1;
/**			
 * cau3			
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
public class cau3 {
	/**
	 * Viết chương trình tính :
			S=1+1/2+1/3+....+1/n
	 * @param n
	 * @return
	 */
	public static float tinhTong(int n){
		if(n==1)return (float)n;
		return 1/(float)n+tinhTong(n-1);
	}
	public static void main(String[] args) {
		System.out.println(tinhTong(3));
	}
}
