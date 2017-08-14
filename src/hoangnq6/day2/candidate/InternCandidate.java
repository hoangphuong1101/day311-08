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
public class InternCandidate{
	private int canID;
	private String majors;
	private String semester;
	private String universityName;

	/**
	 * @param canID
	 * @param majors
	 * @param semester
	 * @param universityName
	 */
	public InternCandidate(int canID, String majors, String semester, String universityName) {
		super();
		this.canID = canID;
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}


	/**
	 * @return the canID
	 */
	public int getCanID() {
		return canID;
	}


	/**
	 * @param canID the canID to set
	 */
	public void setCanID(int canID) {
		this.canID = canID;
	}


	/**
	 * @return the majors
	 */
	public String getMajors() {
		return majors;
	}


	/**
	 * @param majors the majors to set
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
	 * @param semester the semester to set
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
	 * @param universityName the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}


	public String showInfo() {
		// TODO Auto-generated method stub
		return "\n majors: "
				+ this.majors + "\n semester: " + this.semester + "\n universityName: " + this.universityName;
	}

}
