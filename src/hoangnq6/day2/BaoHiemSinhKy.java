package hoangnq6.day2;
/**			
 * BaoHiemSinhKy			
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

public class BaoHiemSinhKy extends GoiBaoHiem{
	private Date thoiGianKetThuc;
	private int thoiGianTroCap;
	/**
	 * @return the thoiGianKetThuc
	 */
	public Date getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}
	/**
	 * @param thoiGianKetThuc the thoiGianKetThuc to set
	 */
	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}
	/**
	 * @return the thoiGianTroCap
	 */
	public int getThoiGianTroCap() {
		return thoiGianTroCap;
	}
	/**
	 * @param thoiGianTroCap the thoiGianTroCap to set
	 */
	public void setThoiGianTroCap(int thoiGianTroCap) {
		this.thoiGianTroCap = thoiGianTroCap;
	}
	/**
	 * @param tenGoiBaoHiem
	 * @param thoiGianDong
	 * @param mucDongPhi
	 * @param mucDich
	 * @param cachThucDong
	 * @param thoiGianBatDau
	 * @param thoiGianKetThuc
	 * @param thoiGianTroCap
	 */
	public BaoHiemSinhKy(String tenGoiBaoHiem, String thoiGianDong, int mucDongPhi, String mucDich, String cachThucDong,
			Date thoiGianBatDau, Date thoiGianKetThuc, int thoiGianTroCap) {
		super(tenGoiBaoHiem, thoiGianDong, mucDongPhi, mucDich, cachThucDong, thoiGianBatDau);
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.thoiGianTroCap = thoiGianTroCap;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "tên gói bảo hiểm : "+this.getTenGoiBaoHiem()+"\n Thời gian đóng bảo hiểm: "
				+this.getThoiGianDong()+"\n mức đóng phí: "+this.getMucDongPhi()+"\n mục đích: "+this.getMucDich()
				+"\n cách thức đóng: "+this.getCachThucDong()+"\n thời gian bắt đầu: "+this.getThoiGianBatDau()+"\n"
						+ "thời gian kết thúc: "+this.thoiGianKetThuc+"\n thời gian trợ cấp: "+this.thoiGianTroCap;
	}
}
