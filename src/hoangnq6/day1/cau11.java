package hoangnq6.day1;
/**			
 * cau11			
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

import javax.swing.SortingFocusTraversalPolicy;

public class cau11 {
	/**
	 * a.	Nhập một mảng a gồm n phần tử kiểu nguyên int
	 * @param a
	 * @param n
	 */
	public static void nhapArr(int a[],int n){
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<n;i++){
			System.out.println("phan tu a["+i+"]");
			a[i]=scanner.nextInt();
		}
	}
	
	/**
	 * b.	Tính tổng số dương lẻ mảng a
	 * @param a
	 * @return
	 */
	public static int tongSoLe(int a[]){
		int tong=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0)tong+=a[i];
		}
		return tong;
	}
	
	/**
	 * in mảng
	 * @param a
	 */
	public static void inArr(int a[]){
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	/**
	 * c.	Nhập phần tử k, tìm xem k có xuất hiện
	 *  trong mảng a không. Nếu có chỉ ra phần tử ở vị trí đầu tiên
	 * @param k
	 * @param a
	 */
	public static void kienTraK(int k, int a[]){
		for(int i=0;i<a.length;i++){
			if(a[i]==k){
				System.out.println(k+ "có trong mảng a, và vị"
						+ " trí đầu tiên là :a["+ i+"]");
			}
		}
	}
	
	/**
	 * d.	Sắp sếp mảng a theo thứ tự tăng dần..
	 * @param a
	 */
	public static void sortArr(int a[]){
		for(int i=0;i<a.length-1;i++)
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
	}
	
	/**
	 * e.	Chèn phần tử p vào mảng a sao cho mảng a 
	 * vẫn đảm bảo tăng dần và xuất lại mảng a.
	 * @param p
	 * @param a
	 */
	
	public static void chenP(int p,int a[]){
		int m=a.length;
		int b[]= new int[m+1];
		b[m]=p;
		for(int i=0;i<m;i++){
			b[i]=a[i];
		}
		sortArr(b);
		System.out.println("mang sao khi chen p vao: ");
		for(int i=0;i<=m;i++){
			System.out.print(b[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("nhap n: ");
		int n= scanner.nextInt();
		int a[] = new int[n];
		nhapArr(a, n);
		System.out.println("mang sao khi nhap");
		inArr(a);
		tongSoLe(a);
		System.out.println("kiem tra k: ");
		int k= scanner.nextInt();
		kienTraK(k, a);
		sortArr(a);
		System.out.println("mang sau khi sap xep");
		inArr(a);
		System.out.println();
		System.out.println("chen p: ");
		int p= scanner.nextInt();
		chenP(p, a);
	}
}
