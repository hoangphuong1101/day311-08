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
public class InternCandidate extends Candidate {
	private String majors;
	private String semester;
	private String universityName;

	/**
	 * @return the majors
	 */
	public String getMajors() {
		return majors;
	}

	/**
	 * @param majors
	 *            the majors to set
	 */
	public void setMajors(String majors) {
		this.majors = majors;
	}

	/**
	 * @return the semester
	 */
	public String getSemester() {
		return semester;
	}

	/**
	 * @param semester
	 *            the semester to set
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}

	/**
	 * @return the universityName
	 */
	public String getUniversityName() {
		return universityName;
	}

	/**
	 * @param universityName
	 *            the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	/**
	 * @param candidateID
	 * @param fullName
	 * @param birthDate
	 * @param phone
	 * @param email
	 * @param candidateType
	 * @param listCertificated
	 * @param majors
	 * @param semester
	 * @param universityName
	 */
	public InternCandidate(String candidateID, String fullName, Date birthDate, String phone, String email,
			String candidateType, ArrayList<Certificated> listCertificated, String majors, String semester,
			String universityName) {
		super(candidateID, fullName, birthDate, phone, email, candidateType, listCertificated);
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}

	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return super.showInfo()+"\n majors: "
				+ this.majors + "\n semester: " + this.semester + "\n universityName: " + this.universityName;
	}

}
