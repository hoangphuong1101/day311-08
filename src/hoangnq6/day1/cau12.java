package hoangnq6.day1;

/**			
 * cau12			
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

public class cau12 {
	
	/**
	 * 
	 * @param m
	 * @param n
	 */
	public static void matran(int m, int n) {
		int[][] a = new int[m][n];
		//a.	Nhập ma trận a (m dòng, n cột) gồm các phần tử kiểu int
		Scanner prin = new Scanner(System.in);
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				System.out.print("a[" + i + "][" + j + "]=");
				a[i][j] = prin.nextInt();
				System.out.println();
			}
		System.out.println("mang sau khi nhap");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + " ");
				if (j == n - 1)
					System.out.println();
			}
		//b.	Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận a.
		int tich = 1;
		for (int i = 0; i < n; i++) {
			if (a[0][i] % 3 == 0)
				tich = tich * a[0][i];
		}
		
		System.out.println("\ntich= " + tich);
		//c.	Tạo ra mảng một chiều X[i] với X[i] là các giá trị lớn nhất trên dòng i của ma trận a
		int[] x = new int[m];
		int index = 0;

		while (true) {
			int maxLine = 0;
			for (int i = 0; i < n; i++) {
				if (maxLine < a[index][i])
					maxLine = a[index][i];
			}
			x[index] = maxLine;
			index++;
			if (index == m)
				break;
		}
		System.out.println("mang X can tim : ");
		for (int i = 0; i < m; i++) {
			System.out.print(x[i] + " ");
		}
		//d.	Xoá đi phần tử đầu tiên của mảng X[i], xuất lại mảng X[i]. 
		System.out.println("\nmang sau khi xoa phan tu dau tien :");
		for (int i = 0; i < m - 1; i++) {
			x[i] = x[i + 1];
			System.out.print(x[i] + " ");
		}
	}
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap m=");
		int m=scanner.nextInt();
		System.out.println("nhap n=");
		int n=scanner.nextInt();
		matran(m, n);
	}

}
