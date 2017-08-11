package hoangnq6.day2;
/**			
 * KhachHang			
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
import java.util.Date;

public class KhachHang {
	private String hoTen;
	private Date ngaySinh;
	private String noiThuongTru;
	private String cMND;
	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}
	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	/**
	 * @return the ngaySinh
	 */
	public Date getNgaySinh() {
		return ngaySinh;
	}
	/**
	 * @param ngaySinh the ngaySinh to set
	 */
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	/**
	 * @return the noiThuongTru
	 */
	public String getNoiThuongTru() {
		return noiThuongTru;
	}
	/**
	 * @param noiThuongTru the noiThuongTru to set
	 */
	public void setNoiThuongTru(String noiThuongTru) {
		this.noiThuongTru = noiThuongTru;
	}
	
	/**
	 * @return the cMND
	 */
	public String getcMND() {
		return cMND;
	}
	/**
	 * @param cMND the cMND to set
	 */
	public void setcMND(String cMND) {
		this.cMND = cMND;
	}
	/**
	 * @param hoTen
	 * @param ngaySinh
	 * @param noiThuongTru
	 * @param cMND
	 */
	public KhachHang(String hoTen, Date ngaySinh, String noiThuongTru, String cMND) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.noiThuongTru = noiThuongTru;
		this.cMND=cMND;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Họ Tên: "+this.hoTen+"\nNgay Sinh: "+this.ngaySinh+"\n Thường Trú: "
				+this.noiThuongTru+"chứng minh nhân dân: "+this.cMND;
	}
}
