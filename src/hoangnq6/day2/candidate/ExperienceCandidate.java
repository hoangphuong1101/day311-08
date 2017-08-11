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
public class ExperienceCandidate extends Candidate {
	private int expInYear;
	private String proSkill;

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
	 * @param candidateID
	 * @param fullName
	 * @param birthDate
	 * @param phone
	 * @param email
	 * @param candidateType
	 * @param listCertificated
	 * @param expInYear
	 * @param proSkill
	 */
	public ExperienceCandidate(String candidateID, String fullName, Date birthDate, String phone, String email,
			String candidateType, ArrayList<Certificated> listCertificated, int expInYear, String proSkill) {
		super(candidateID, fullName, birthDate, phone, email, candidateType, listCertificated);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return super.showInfo()+"\n expInYear: "
				+ this.getExpInYear() + "\n proSkill: " + this.getProSkill();
	}

}
