package hoangnq6.day2;

import java.util.Date;
import java.util.Scanner;

/**			
 * DangKyBaoHiem			
 *			
 * Version 1.0			
 *			
 * Date: 08-08-2017			
 *			
 * Copyright 			
 *			
 * Modification Logs:			
 * DATE                 AUTHOR          DESCRIPTION			
 * -----------------------------------------------------------------------			
 * 08-08-2017         HoangNQ6            Create			
 */
public class DangKyBaoHiem {
	/**
	 * Thực CRUD – Khách hàng thực hiện đăng ký gói bảo hiểm nào để lưu trữ các thông tin sau: 
	 * Họ tên, Ngày sinh, Nơi thường trú, Số chứng minh thư, Tên gói bảo hiểm, Thời hạn đóng, 
	 * Mức phí đóng, Mục đích, Cách thức đóng, Thời gian bắt đầu, Thời gian kết thúc, Sản phẩm 
	 * bảo hiểm đi kèm, Trường hợp bảo hiểm, Thời gian tối thiểu tham gia, thời gian trợ cấp.
	 */
	public static void dangKy(){
		Scanner scanner =new Scanner(System.in);
		System.out.println("Vui lòng nhập các thông tin sau để đăng ký gói bảo hiểm bạn muốn chọn.");
		System.out.print("Họ tên: ");
		String hoTen=scanner.nextLine();
		System.out.println();
		
		System.out.print("Nhập ngày sinh: ");
		String nS= scanner.nextLine();
		Date ngaySinh= new Date(nS);
		System.out.println();
		
		System.out.print("Nhập nơi thường trú: ");
		String noiThuongTru=scanner.nextLine();
		System.out.println();
		
		System.out.println("Nhập CMND: ");
		String CMND=scanner.nextLine();
		System.out.println();
		
		System.out.println("Vui lòng chọn gói bảo hiểm: \n nhập 1 nếu Chọn Bảo hiểm tử vong\n"
				+ "Chọn 2 nếu chọn Bảo Hiểm Sinh Kỳ\n"
				+ "Chọn 3 nếu Bảo Hiểm Theo Thời Hạn Hợp Đồng\n Bạn chọn bảo hiểm loại 1|2|3 :");
		int loaiBH = scanner.nextInt();
		
		Scanner scanner1 =new Scanner(System.in);
		System.out.println("Thời Hạn Đóng Bảo Hiểm: ");
		String thoiGianDong=scanner1.nextLine();
		System.out.println();
		
		System.out.println("Mức Phí Đóng Bảo Hiểm: ");
		int mucDongPhi=scanner1.nextInt();
		System.out.println();
		Scanner scanner22 =new Scanner(System.in);
		System.out.println("Mục Đích Đóng Bảo Hiểm: ");
		String mucDich=scanner22.nextLine();
		System.out.println();
		
		System.out.println("Nhập Cách Thức Đong Bảo Hiểm: \n Chọn 1 nếu Bạn có thể đóng 1 lần\n "
				+ "Chọn 2 nếu bạn Chọn đóng theo tháng\n Chọn 1|2: ");
		int cachThuc=scanner1.nextInt();
		String cachThucDong="";
		switch (cachThuc) {
		case 1:
			cachThucDong="Đóng 1 lần";
			break;
		case 2:
			cachThucDong="Đóng Theo Tháng";
			break;	
		default:
			System.out.println("Bạn nhập không đúng vui lòng nhập 1 hoặc 2");
			break;
		}
		System.out.println();
		
		Scanner scanner2 =new Scanner(System.in);
		System.out.println("Thời Gian Bắt đầu: ");
		String batD= scanner2.nextLine();
		Date thoiGianBatDau= new Date(batD);
		System.out.println();
		
		String tenGoiBaoHiem="";
		Date thoiGianKetThuc=null;
		String sanPhamDiKem="";
		int thoiGianTroCap=0;
		String truongHopBH="";
		int thoiGianToiThieuThamGia=0;
		switch (loaiBH) {
		case 1:
			Scanner scanner3 =new Scanner(System.in);
			tenGoiBaoHiem="bảo hiểm trong trường hợp tử vong ";
			System.out.println("Trường hợp đóng bảo hiểm: \n"
					+ "Chọn 1 nếu chọn trường hợp tử kỳ\n"
					+ "Chọn 2 nếu trường hợp trọn đời\n"
					+ "Chọn 1|2: ");
			int tH =scanner3.nextInt();
			
				switch (tH) {
				case 1:
					truongHopBH="trường hợp tử kỳ";
					break;
				case 2:
					truongHopBH="trường hợp trọn đời";
					break;	
				default:
					System.out.println("Bạn nhập không đúng vui lòng nhập 1 hoặc 2");
					break;
				}
			System.out.println("thời gian tối thiểu tham gia: ");
			Scanner scanner4 =new Scanner(System.in);
			thoiGianToiThieuThamGia=scanner4.nextInt();
			break;
		case 2:
			Scanner scanner5 =new Scanner(System.in);
			tenGoiBaoHiem="bảo hiểm sinh kỳ";
			System.out.println("Thời gian kết thúc");
			if(thoiGianDong.equals("Không Xác Định"));
			else{
				String ketT= scanner5.nextLine();
				thoiGianKetThuc= new Date(ketT);
				System.out.println();
			}
			
			System.out.println("Thời gian trợ cấp");
			thoiGianTroCap = scanner5.nextInt();
			break;
		case 3:
			Scanner scanner6 =new Scanner(System.in);
			tenGoiBaoHiem="bảo hiểm trong trường hợp tử vong ";
			System.out.println("Thời gian kết thúc");
				String ketT1= scanner6.nextLine();
				thoiGianKetThuc= new Date(ketT1);
				System.out.println();
			System.out.println("Sản phẩm bảo hiểm đi kèm: \n"
					+ "Chọn 1 nếu chọn bảo hiểm nghèo\n"
					+ "chọn 2 nếu trợ cấp nằm viện\n"
					+ "chọn 3 nếu bảo hiểm thương tật vĩnh viễn\n "
					+ "Chọn 1|2|3");
			
			int chonBH=scanner6.nextInt();
			switch (chonBH) {
			case 1:
				sanPhamDiKem="bảo hiểm nghèo";
				break;
			case 2:
				sanPhamDiKem="trợ cấp nằm viện";
				break;
			case 3:
				sanPhamDiKem="bảo hiểm thương tật vĩnh viễn";
				break;
			default:
				System.out.println("Bạn nhập không đúng vui lòng nhập 1 hoặc 2 hoặc 3");
				break;
			}
			
			break;
		default:
			System.out.println("Bạn nhập không đúng vui lòng nhập 1 hoặc 2 hoặc 3");
			break;
		}
		KhachHang khachHang = new KhachHang(hoTen, ngaySinh, noiThuongTru, CMND);
		
		BaoHiemTheoThoiHanHopDong baoHiemTheoThoiHanHopDong = new 
				BaoHiemTheoThoiHanHopDong(tenGoiBaoHiem, thoiGianDong, mucDongPhi, mucDich, 
						cachThucDong, thoiGianBatDau, thoiGianKetThuc, sanPhamDiKem);
		
		BaoHiemSinhKy baoHiemSinhKy =new BaoHiemSinhKy(tenGoiBaoHiem, thoiGianDong, mucDongPhi, mucDich,
				cachThucDong, thoiGianBatDau, thoiGianKetThuc, thoiGianTroCap);
		
		BaoHiemTuVong baoHiemTuVong =new BaoHiemTuVong(tenGoiBaoHiem, thoiGianDong, mucDongPhi,
				mucDich, cachThucDong, thoiGianBatDau, truongHopBH, thoiGianToiThieuThamGia);
		
		System.out.println(khachHang.toString());
		
		switch (loaiBH) {
		case 1:
			System.out.println(baoHiemTuVong.toString());
			break;
		case 2:
			System.out.println(baoHiemSinhKy.toString());
			break;
		case 3:
			System.out.println(baoHiemTheoThoiHanHopDong.toString());
			break;
		default:
			break;
		}
		
		
		
	}
	public static void main(String[] args) {
		dangKy();
	}
}
