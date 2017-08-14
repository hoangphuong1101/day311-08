
package hoangnq6.day2.candidate;

import java.util.Date;

/**
 * Certificated
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
public class Certificated {
	private int canID;
	private String certificatedID;
	private String certificateName;
	private String certificateRank;
	private String ertificatedDate;

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
	 * @return the certificatedID
	 */
	public String getCertificatedID() {
		return certificatedID;
	}

	/**
	 * @param certificatedID
	 *            the certificatedID to set
	 */
	public void setCertificatedID(String certificatedID) {
		this.certificatedID = certificatedID;
	}

	/**
	 * @return the certificateName
	 */
	public String getCertificateName() {
		return certificateName;
	}

	/**
	 * @param certificateName
	 *            the certificateName to set
	 */
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	/**
	 * @return the certificateRank
	 */
	public String getCertificateRank() {
		return certificateRank;
	}

	/**
	 * @param certificateRank
	 *            the certificateRank to set
	 */
	public void setCertificateRank(String certificateRank) {
		this.certificateRank = certificateRank;
	}

	/**
	 * @return the ertificatedDate
	 */
	public String getErtificatedDate() {
		return ertificatedDate;
	}

	/**
	 * @param ertificatedDate
	 *            the ertificatedDate to set
	 */
	public void setErtificatedDate(String ertificatedDate) {
		this.ertificatedDate = ertificatedDate;
	}

	
	/**
	 * @param canID
	 * @param certificatedID
	 * @param certificateName
	 * @param certificateRank
	 * @param ertificatedDate
	 */
	public Certificated(int canID, String certificatedID, String certificateName, String certificateRank,
			String ertificatedDate) {
		super();
		this.canID = canID;
		this.certificatedID = certificatedID;
		this.certificateName = certificateName;
		this.certificateRank = certificateRank;
		this.ertificatedDate = ertificatedDate;
	}

	public String showInfo() {
		// TODO Auto-generated method stub
		return "\n certificatedID : " + this.certificatedID + "\n certificateName: " + this.certificateName
				+ "\n certificateRank" + this.certificateRank + "\n ertificatedDate: " + this.ertificatedDate;
	}
}
