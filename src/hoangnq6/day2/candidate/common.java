package hoangnq6.day2.candidate;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * FresherCandidate
 * 
 * Version 1.0
 * 
 * Date: 08-08-2017
 * 
 * Copyright
 * 
 * Modification Logs: DATE AUTHOR DESCRIPTION
 * -----------------------------------------------------------------------
 * 08-08-2017 HoangNQ6 Create
 */
public class common {

	/**
	 * Hàm format date năm lớn hơn 1990
	 * 
	 * @param inDate
	 * @return
	 */
	public static boolean formatDateYear(Date inDate) {
		Date date = new Date();
		int namSinh = inDate.getYear() + 1900;
		int namHienTai = date.getYear() + 1900;
		if (namSinh >= 1900 && namSinh <= namHienTai)
			return true;
		return false;
	}

	/**
	 * 
	 */
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	/**
	 * kiểm tra định dạng mail
	 * 
	 * @param emailStr
	 * @return
	 */
	public static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}

	/**
	 * kiểm tra số điiện thoại đúng định dạng số việt nam
	 * 
	 * @param sPhoneNumber
	 * @return
	 */
	public static boolean checkPhone(String sPhoneNumber) {
		Pattern pattern = Pattern.compile("[0]{1}[1-9]{1}[0-9]{8}");
		Matcher matcher = pattern.matcher(sPhoneNumber);

		if (matcher.matches())
			return true;
		else
			return false;
	}

	/**
	 * kiểm tra trong sdt phaỈ CÓ TRÊN 7 CHỮ SỐ NGUUYEEN DUONG
	 * 
	 * @param sPhoneNumber
	 * @return
	 */
	public static boolean checkSoNguyenDuong(String sPhoneNumber) {
		Pattern pattern = Pattern.compile("[1-9]{1}");
		int dem = 0;
		for (int i = 0; i < sPhoneNumber.length(); i++) {
			String str = "";
			str += sPhoneNumber.charAt(i);
			Matcher matcher = pattern.matcher(str);
			if (matcher.matches())
				dem++;
		}
		if (dem >= 7)
			return true;
		return false;
	}

	/**
	 * Phone: Tối thiểu 7 chữ số nguyên dương
	 * 
	 * @param phone
	 * @return
	 */
	public static boolean checkIsPhone(String phone) {
		if (checkPhone(phone) && checkSoNguyenDuong(phone))
			return true;
		return false;
	}

	/**
	 * kiểm tra số năm kinh nghiệm từ 0->100
	 * 
	 * @param expInYear
	 * @return
	 */
	public static boolean checkExpInYear(int expInYear) {
		if (expInYear >= 0 && expInYear <= 100)
			return true;
		return false;
	}

	/**
	 * kiểm tyra xếp loại 1 trong 4 giá trị (Excellence, Good, Fair, Poor)
	 * 
	 * @param graduationRank
	 * @return
	 */
	public static boolean checkGraduationRank(String graduationRank) {
		if (graduationRank.equals("Excellence") || graduationRank.equals("Good") || graduationRank.equals("Fair")
				|| graduationRank.equals("Poor"))
			return true;
		return false;
	}

}
