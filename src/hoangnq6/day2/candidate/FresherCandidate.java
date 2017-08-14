package hoangnq6.day2.candidate;

import java.util.ArrayList;
import java.util.Date;

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
public class FresherCandidate {
	private int canID;
	private String graduationDate;
	private String graduationRank;
	private String education;

	/**
	 * @param canID
	 * @param graduationDate
	 * @param graduationRank
	 * @param education
	 */
	public FresherCandidate(int canID, String graduationDate, String graduationRank, String education) {
		super();
		this.canID = canID;
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	/**
	 * @return the canID
	 */
	public int getCanID() {
		return canID;
	}

	/**
	 * @param canID
	 *            the canID to set
	 */
	public void setCanID(int canID) {
		this.canID = canID;
	}

	/**
	 * @return the graduationDate
	 */
	public String getGraduationDate() {
		return graduationDate;
	}

	/**
	 * @param graduationDate
	 *            the graduationDate to set
	 */
	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	/**
	 * @return the graduationRank
	 */
	public String getGraduationRank() {
		return graduationRank;
	}

	/**
	 * @param graduationRank
	 *            the graduationRank to set
	 */
	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}

	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @param education
	 *            the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	public String showInfo() {
		// TODO Auto-generated method stub
		return "\n graduationDate: " + this.graduationDate + "\n graduationRank: "
				+ this.graduationRank + "\n education: " + this.education;
	}
}
