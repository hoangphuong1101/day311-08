package hoangnq6.day2;
/**			
 * GoiBaoHiem			
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

public class GoiBaoHiem {
	private String tenGoiBaoHiem;
	private String thoiGianDong;
	private int mucDongPhi;
	private String mucDich;
	private String cachThucDong;
	private Date thoiGianBatDau;
	/**
	 * @return the tenGoiBaoHiem
	 */
	public String getTenGoiBaoHiem() {
		return tenGoiBaoHiem;
	}
	/**
	 * @param tenGoiBaoHiem the tenGoiBaoHiem to set
	 */
	public void setTenGoiBaoHiem(String tenGoiBaoHiem) {
		this.tenGoiBaoHiem = tenGoiBaoHiem;
	}
	/**
	 * @return the thoiGianDong
	 */
	public String getThoiGianDong() {
		return thoiGianDong;
	}
	/**
	 * @param thoiGianDong the thoiGianDong to set
	 */
	public void setThoiGianDong(String thoiGianDong) {
		this.thoiGianDong = thoiGianDong;
	}
	/**
	 * @return the mucDongPhi
	 */
	public int getMucDongPhi() {
		return mucDongPhi;
	}
	/**
	 * @param mucDongPhi the mucDongPhi to set
	 */
	public void setMucDongPhi(int mucDongPhi) {
		this.mucDongPhi = mucDongPhi;
	}
	/**
	 * @return the mucDich
	 */
	public String getMucDich() {
		return mucDich;
	}
	/**
	 * @param mucDich the mucDich to set
	 */
	public void setMucDich(String mucDich) {
		this.mucDich = mucDich;
	}
	/**
	 * @return the cachThucDong
	 */
	public String getCachThucDong() {
		return cachThucDong;
	}
	/**
	 * @param cachThucDong the cachThucDong to set
	 */
	public void setCachThucDong(String cachThucDong) {
		this.cachThucDong = cachThucDong;
	}
	/**
	 * @return the thoiGianBatDau
	 */
	public Date getThoiGianBatDau() {
		return thoiGianBatDau;
	}
	/**
	 * @param thoiGianBatDau the thoiGianBatDau to set
	 */
	public void setThoiGianBatDau(Date thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}
	/**
	 * @param tenGoiBaoHiem
	 * @param thoiGianDong
	 * @param mucDongPhi
	 * @param mucDich
	 * @param cachThucDong
	 * @param thoiGianBatDau
	 */
	public GoiBaoHiem(String tenGoiBaoHiem, String thoiGianDong, int mucDongPhi, String mucDich, String cachThucDong,
			Date thoiGianBatDau) {
		super();
		this.tenGoiBaoHiem = tenGoiBaoHiem;
		this.thoiGianDong = thoiGianDong;
		this.mucDongPhi = mucDongPhi;
		this.mucDich = mucDich;
		this.cachThucDong = cachThucDong;
		this.thoiGianBatDau = thoiGianBatDau;
	}
	
	
	
}
