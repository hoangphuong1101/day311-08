package hoangnq6.day2;
/**			
 * BaoHiemTheoThoiHanHopDong			
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

public class BaoHiemTheoThoiHanHopDong extends GoiBaoHiem{
	private Date thoiGianKetThuc;
	private String sanPhamDiKem;
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
	 * @return the sanPhamDiKem
	 */
	public String getSanPhamDiKem() {
		return sanPhamDiKem;
	}
	/**
	 * @param sanPhamDiKem the sanPhamDiKem to set
	 */
	public void setSanPhamDiKem(String sanPhamDiKem) {
		this.sanPhamDiKem = sanPhamDiKem;
	}
	/**
	 * @param tenGoiBaoHiem
	 * @param thoiGianDong
	 * @param mucDongPhi
	 * @param mucDich
	 * @param cachThucDong
	 * @param thoiGianBatDau
	 * @param thoiGianKetThuc
	 * @param sanPhamDiKem
	 */
	public BaoHiemTheoThoiHanHopDong(String tenGoiBaoHiem, String thoiGianDong, int mucDongPhi, String mucDich,
			String cachThucDong, Date thoiGianBatDau, Date thoiGianKetThuc, String sanPhamDiKem) {
		super(tenGoiBaoHiem, thoiGianDong, mucDongPhi, mucDich, cachThucDong, thoiGianBatDau);
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.sanPhamDiKem = sanPhamDiKem;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "tên gói bảo hiểm : "+this.getTenGoiBaoHiem()+"\n Thời gian đóng bảo hiểm: "
				+this.getThoiGianDong()+"\n mức đóng phí: "+this.getMucDongPhi()+"\n mục đích: "+this.getMucDich()
				+"\n cách thức đóng: "+this.getCachThucDong()+"\n thời gian bắt đầu: "+this.getThoiGianBatDau()+"\n"
						+ "thời gian kết thúc: "+this.thoiGianKetThuc+"\n sản phẩm đi kèm: "+this.sanPhamDiKem;
	}
}
