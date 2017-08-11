package hoangnq6.day2;
/**			
 * BaoHiemTuVong			
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

public class BaoHiemTuVong extends GoiBaoHiem{
	private String truongHopDongBaoHiem;
	private int thoiGianToiThieuThamGia;
	/**
	 * @param tenGoiBaoHiem
	 * @param thoiGianDong
	 * @param mucDongPhi
	 * @param mucDich
	 * @param cachThucDong
	 * @param thoiGianBatDau
	 * @param truongHopDongBaoHiem
	 * @param thoiGianToiThieuThamGia
	 */
	public BaoHiemTuVong(String tenGoiBaoHiem, String thoiGianDong, int mucDongPhi, String mucDich, String cachThucDong,
			Date thoiGianBatDau, String truongHopDongBaoHiem, int thoiGianToiThieuThamGia) {
		super(tenGoiBaoHiem, thoiGianDong, mucDongPhi, mucDich, cachThucDong, thoiGianBatDau);
		this.truongHopDongBaoHiem = truongHopDongBaoHiem;
		this.thoiGianToiThieuThamGia = thoiGianToiThieuThamGia;
	}
	/**
	 * @return the truongHopDongBaoHiem
	 */
	public String getTruongHopDongBaoHiem() {
		return truongHopDongBaoHiem;
	}
	/**
	 * @param truongHopDongBaoHiem the truongHopDongBaoHiem to set
	 */
	public void setTruongHopDongBaoHiem(String truongHopDongBaoHiem) {
		this.truongHopDongBaoHiem = truongHopDongBaoHiem;
	}
	/**
	 * @return the thoiGianToiThieuThamGia
	 */
	public int getThoiGianToiThieuThamGia() {
		return thoiGianToiThieuThamGia;
	}
	/**
	 * @param thoiGianToiThieuThamGia the thoiGianToiThieuThamGia to set
	 */
	public void setThoiGianToiThieuThamGia(int thoiGianToiThieuThamGia) {
		this.thoiGianToiThieuThamGia = thoiGianToiThieuThamGia;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "tên gói bảo hiểm : "+this.getTenGoiBaoHiem()+"\n Thời gian đóng bảo hiểm: "
				+this.getThoiGianDong()+"\n mức đóng phí: "+this.getMucDongPhi()+"\n mục đích: "+this.getMucDich()
				+"\n cách thức đóng: "+this.getCachThucDong()+"\n thời gian bắt đầu: "+this.getThoiGianBatDau()+"\n"
						+ "trường hợp đóng bảo hiểm: "+this.truongHopDongBaoHiem+"\n thời gian tối thiểu tham gia: "+this.thoiGianToiThieuThamGia;
	}
}
