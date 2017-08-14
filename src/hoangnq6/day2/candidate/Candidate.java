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
	private int canID;
	private String candidateID;
	private String fullName;
	private String birthDate;
	private String phone;
	private String email;
	private String candidateType;
	static int canidateCount=0;
	private ArrayList<Certificated> listCertificated= new ArrayList<>();

	
	/**
	 * @param canID
	 * @param candidateID
	 * @param fullName
	 * @param birthDate
	 * @param phone
	 * @param email
	 * @param candidateType
	 * @param listCertificated
	 */
	public Candidate(int canID, String candidateID, String fullName, String birthDate, String phone, String email,
			String candidateType, ArrayList<Certificated> listCertificated) {
		super();
		this.canID = canID;
		this.candidateID = candidateID;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
		this.candidateType = candidateType;
		this.listCertificated = listCertificated;
	}


	/**
	 * @param canID the canID to set
	 */
	public void setCanID(int canID) {
		this.canID = canID;
	}


	/**
	 * 
	 */
	public Candidate() {
		super();
		canidateCount++;
	}


	/**
	 * @return the canID
	 */
	public int getCanID() {
		return canID;
	}

	
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
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate
	 *            the birthDate to set
	 */
	public void setBirthDate(String birthDate) {
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
	public Candidate(String candidateID, String fullName, String birthDate, String phone, String email,
			String candidateType, ArrayList<Certificated> listCertificated) {
		super();
		this.candidateID = candidateID;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
		this.candidateType = candidateType;
		this.listCertificated = listCertificated;
		canidateCount++;
	}

	
	
	/**
	 * @param candidateID
	 * @param fullName
	 * @param birthDate
	 * @param phone
	 * @param email
	 * @param candidateType
	 */
	public Candidate(String candidateID, String fullName, String birthDate, String phone, String email,
			String candidateType) {
		super();
		this.candidateID = candidateID;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
		this.candidateType = candidateType;
		canidateCount++;
	}

	/**
	 * đếm số lượng ứng viên nhập vào
	 * @param candidateCount
	 */
	public void numberCadidate(int candidateCount){
		canidateCount++;
	}
	
	/**
	 * kiểm tra số lượng ứng viên được nhập
	 * 
	 */
	public void showNumberCandidate(){
		System.out.println("số lượng ứng viên được nhập vào là "+ canidateCount);
	}
	
	/**
	 * hiển thị danh sách các bằng tốt nghiệp của mỗi loại ứng viên
	 * @param listCertificated
	 * @return
	 */
	public String showListCertificated(ArrayList<Certificated> listCertificated){
		String show="";
		for(int i=0;i<listCertificated.size();i++){
			show=show+"\nThông tin bằng thứ "+i+" là: \n "+listCertificated.get(i).showInfo();
		}
		return show;
	}
	
	/**
	 * hiển thi thông tin của 1 ứng viên
	 * @return
	 */
	public String showInfo () {
		// TODO Auto-generated method stub
		return "candidateID: " + this.getCandidateID() + "\n fullName: " + this.getFullName() + "\n birthDate: "
				+ this.getBirthDate() + "\n phone: " + this.getPhone()
				+ "\n email: " + this.getEmail() + "\n candidateType: " + this.getCandidateType() + "\n listCertificated: "
				+ this.showListCertificated(listCertificated);
	}
}
