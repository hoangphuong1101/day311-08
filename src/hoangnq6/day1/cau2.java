package hoangnq6.day1;
/**			
 * cau2			
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
public class cau2 {
	/**
	 * 2.	Nhập vào tháng, năm bất kỳ. In ra số ngày tương ứng với tháng, năm đó.
	 * @param mm
	 * @param yyyy
	 */
	public static void ngayThang(int mm,int yyyy){
		switch (mm) {
		case 1:;
		case 3:;
		case 5:;
		case 7:;
		case 8:;
		case 10:;
		case 12:
			for(int i=1;i<32;i++){
				System.out.print(i+" ");
				if(i%10==0)System.out.println();
			}
			break;
		case 4:;
		case 6:;
		case 9:;
		case 11:
			for(int i=1;i<31;i++){
				System.out.print(i+" ");
				if(i%10==0)System.out.println();
			}
			break;
		case 2:
			if(yyyy%4==0&&yyyy%100!=0){
				for(int i=1;i<30;i++){
					System.out.print(i+" ");
					if(i%10==0)System.out.println();
				}
			}else{
				for(int i=1;i<29;i++){
					System.out.print(i+" ");
					if(i%10==0)System.out.println();
				}
			}
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		ngayThang(2, 2000);
	}
}
