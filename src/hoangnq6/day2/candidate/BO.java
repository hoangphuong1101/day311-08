package hoangnq6.day2.candidate;

import java.util.ArrayList;

public class BO {
	DAO dao = new DAO();

	/**
	 * 
	 * @param candidate
	 */
	public void addCandidate(Candidate candidate) {
		dao.addCandidate(candidate);
	}

	/**
	 * add one Intern Candidate for database
	 * @param can
	 */
	public void addInternCandidate(InternCandidate can) {
		dao.addInternCandidate(can);
	}

	/**
	 * add one Experience Candidate for database
	 * 
	 * @param can
	 */
	public void addExperienceCandidate(ExperienceCandidate can) {
		dao.addExperienceCandidate(can);
	}

	/**
	 * add one Fresher Candidate for database
	 * @param can
	 */
	public void addFresherCandidate(FresherCandidate can) {
		dao.addFresherCandidate(can);
	}

	/**
	 * add Certificated for database
	 * @param certificated
	 */
	public void addCertificated(Certificated certificated) {
		dao.addCertificated(certificated);
	}

	/**
	 * 
	 * @return
	 */
	public int getCandidateIDForDatabase() {
		return dao.getCandidateIDForDatabase();
	}
	
	public ArrayList<Candidate> getListCandidate(){
		return dao.getListCandidate();
	}
	
	public ArrayList<Certificated> getListCertificated(int canID) {
		return dao.getListCertificated(canID);
	}
	
	public InternCandidate getInternCandidate(int canID) {
		return dao.getInternCandidate(canID);
	}
	
	public ExperienceCandidate getExperienceCandidate(int canID) {
		return dao.getExperienceCandidate(canID);
	}
	
	public FresherCandidate getFresherCandidate(int canID) {
		return dao.getFresherCandidate(canID);
	}
	
}
