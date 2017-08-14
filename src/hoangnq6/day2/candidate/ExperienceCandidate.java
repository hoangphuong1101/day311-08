package hoangnq6.day2.candidate;

import java.util.ArrayList;
import java.util.Date;

/**
 * ExperienceCandidate
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
public class ExperienceCandidate {

	private int canID;
	private int expInYear;
	private String proSkill;

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
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return expInYear;
	}

	/**
	 * @param expInYear
	 *            the expInYear to set
	 */
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return proSkill;
	}

	/**
	 * @param proSkill
	 *            the proSkill to set
	 */
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	
	/**
	 * @param canID
	 * @param expInYear
	 * @param proSkill
	 */
	public ExperienceCandidate(int canID, int expInYear, String proSkill) {
		super();
		this.canID = canID;
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	public String showInfo() {
		// TODO Auto-generated method stub
		return "\n expInYear: " + this.getExpInYear() + "\n proSkill: " + this.getProSkill();
	}

}
