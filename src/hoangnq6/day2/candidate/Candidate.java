package hoangnq6.day2.candidate;

import java.util.ArrayList;
import java.util.Date;

/**
 * Candidate
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
public class Candidate {
	private String candidateID;
	private String fullName;
	private Date birthDate;
	private String phone;
	private String email;
	private String candidateType;
	static int canidateCount;
	private ArrayList<Certificated> listCertificated= new ArrayList<>();

	/**
	 * @return the listCertificated
	 */
	public ArrayList<Certificated> getListCertificated() {
		return listCertificated;
	}

	/**
	 * @param listCertificated the listCertificated to set
	 */
	public void setListCertificated(ArrayList<Certificated> listCertificated) {
		this.listCertificated = listCertificated;
	}

	/**
	 * @return the candidateID
	 */
	public String getCandidateID() {
		return candidateID;
	}

	/**
	 * @param candidateID
	 *            the candidateID to set
	 */
	public void setCandidateID(String candidateID) {
		this.candidateID = candidateID;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate
	 *            the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the candidateType
	 */
	public String getCandidateType() {
		return candidateType;
	}

	/**
	 * @param candidateType
	 *            the candidateType to set
	 */
	public void setCandidateType(String candidateType) {
		this.candidateType = candidateType;
	}

	/**
	 * @return the canidateCount
	 */
	public int getCanidateCount() {
		return canidateCount;
	}

	

	/**
	 * @param candidateID
	 * @param fullName
	 * @param birthDate
	 * @param phone
	 * @param email
	 * @param candidateType
	 * @param listCertificated
	 */
	public Candidate(String candidateID, String fullName, Date birthDate, String phone, String email,
			String candidateType, ArrayList<Certificated> listCertificated) {
		super();
		this.candidateID = candidateID;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
		this.candidateType = candidateType;
		this.listCertificated = listCertificated;
	}

	/**
	 * đếm số lượng ứng viên nhập vào
	 * @param candidateCount
	 */
	public void numberCadidate(int candidateCount){
		canidateCount++;
	}
	
	public String showListCertificated(ArrayList<Certificated> listCertificated){
		String show="";
		for(int i=0;i<listCertificated.size();i++){
			show=show+"\nThông tin bằng thứ "+i+" là: \n "+listCertificated.get(i).toString();
		}
		return show;
	}
	public String showInfo () {
		// TODO Auto-generated method stub
		return "candidateID: " + this.getCandidateID() + "\n fullName: " + this.getFullName() + "\n birthDate: "
				+ this.getBirthDate() + "\n phone: " + this.getPhone()
				+ "\n email: " + this.getEmail() + "\n candidateType: " + this.getCandidateType() + "\n listCertificated: "
				+ this.showListCertificated(listCertificated);
	}
}
