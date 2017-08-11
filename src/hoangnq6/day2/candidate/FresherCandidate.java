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
public class FresherCandidate extends Candidate {
	private Date graduationDate;
	private String graduationRank;
	private String education;

	/**
	 * @return the graduationDate
	 */
	public Date getGraduationDate() {
		return graduationDate;
	}

	/**
	 * @param graduationDate
	 *            the graduationDate to set
	 */
	public void setGraduationDate(Date graduationDate) {
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

	/**
	 * @param candidateID
	 * @param fullName
	 * @param birthDate
	 * @param phone
	 * @param email
	 * @param candidateType
	 * @param listCertificated
	 * @param graduationDate
	 * @param graduationRank
	 * @param education
	 */
	public FresherCandidate(String candidateID, String fullName, Date birthDate, String phone, String email,
			String candidateType, ArrayList<Certificated> listCertificated, Date graduationDate, String graduationRank,
			String education) {
		super(candidateID, fullName, birthDate, phone, email, candidateType, listCertificated);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return super.showInfo()+"\n graduationDate: "
				+ this.graduationDate + "\n graduationRank: " + this.graduationRank + "\n education: " + this.education;
	}
}
