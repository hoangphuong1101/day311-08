package hoangnq6.day2.candidate;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import statics.SQLServer;

public class DAO {

	public void addCandidate(Candidate candidate) {

		// Open connect
		SQLServer.connect();
		PreparedStatement pr = null;
		try {

			String sql = "insert into CANDIDATE(candidateID,fullName,birthDate,phone,email,candidateType)"
					+ " VALUES(?,?,?,?,?,?)";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setString(1, candidate.getCandidateID());
			pr.setString(2, candidate.getFullName());
			pr.setString(3, candidate.getBirthDate());
			pr.setString(4, candidate.getPhone());
			pr.setString(5, candidate.getEmail());
			pr.setString(6, candidate.getCandidateType());
			pr.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
	}

	public void addInternCandidate(InternCandidate can) {

		// Open connect
		SQLServer.connect();
		PreparedStatement pr = null;
		try {

			String sql = "insert into InternCandidate(canID, majors, semester, universityName)" + " VALUES(?,?,?,?)";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setInt(1, can.getCanID());
			pr.setString(2, can.getMajors());
			pr.setString(3, can.getSemester());
			pr.setString(4, can.getUniversityName());
			pr.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
	}

	public void addExperienceCandidate(ExperienceCandidate can) {

		// Open connect
		SQLServer.connect();
		PreparedStatement pr = null;
		try {

			String sql = "insert into ExperienceCandidate(canID, expInYear, proSkill)" + " VALUES(?,?,?)";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setInt(1, can.getCanID());
			pr.setInt(2, can.getExpInYear());
			pr.setString(3, can.getProSkill());
			pr.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
	}

	public void addFresherCandidate(FresherCandidate can) {

		// Open connect
		SQLServer.connect();
		PreparedStatement pr = null;
		try {

			String sql = "insert into FresherCandidate(canID, graduationDate, graduationRank, education)"
					+ " VALUES(?,?,?,?)";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setInt(1, can.getCanID());
			pr.setString(2, can.getGraduationDate());
			pr.setString(3, can.getGraduationRank());
			pr.setString(4, can.getEducation());
			pr.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
	}

	public void addCertificated(Certificated certificated) {

		// Open connect
		SQLServer.connect();
		PreparedStatement pr = null;
		try {

			String sql = "insert into Certificated( canID,  certificatedID, certificateName, certificateRank, ertificatedDate)"
					+ " VALUES(?,?,?,?,?)";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setInt(1, certificated.getCanID());
			pr.setString(2, certificated.getCertificatedID());
			pr.setString(3, certificated.getCertificateName());
			pr.setString(4, certificated.getCertificateRank());
			pr.setString(5, certificated.getErtificatedDate());
			pr.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
	}

	public int getCandidateIDForDatabase() {
		// TODO Auto-generated method stub
		SQLServer.connect();
		ResultSet rs = null;
		PreparedStatement pr = null;
		int canID = 0;
		try {

			String sql = "select top 1 * from CANDIDATE order by canID desc";
			pr = SQLServer.connection.prepareStatement(sql);
			rs = pr.executeQuery();
			try {
				if (rs.next()) {
					canID += rs.getInt("canID");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			pr.close();
			SQLServer.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Close connect
			try {
				rs.close();
			} catch (Exception e2) {
			}
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
		return canID;
	}

	public ArrayList<Certificated> getListCertificated(int canID) {
		ArrayList<Certificated> list = new ArrayList<>();
		SQLServer.connect();
		ResultSet rs = null;
		PreparedStatement pr = null;
		try {

			String sql = "select * from Certificated where canID = ?";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setInt(1, canID);
			rs = pr.executeQuery();
			try {
				while (rs.next()) {
					list.add(new Certificated(canID, rs.getString("certificatedID"), rs.getString("certificateName"),
							rs.getString("certificateRank"), rs.getString("ertificatedDate")));
				}
			} catch (SQLException e) {
				// TODO: handle exception
			}
			pr.close();
			SQLServer.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				rs.close();
			} catch (Exception e2) {
			}
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
		return list;
	}

	public ArrayList<Candidate> getListCandidate() {
		// TODO Auto-generated method stub
		// Open connect
		SQLServer.connect();
		ResultSet rs = null;
		ArrayList<Candidate> temp = new ArrayList<>();
		PreparedStatement pr = null;
		try {

			String sql = "select * from CANDIDATE";
			pr = SQLServer.connection.prepareStatement(sql);
			rs = pr.executeQuery();
			try {
				while (rs.next()) {
					int canID = rs.getInt("canID");
					ArrayList<Certificated> listCertificated = getListCertificated(canID);
					temp.add(new Candidate(rs.getInt("canID"),rs.getString("candidateID"), rs.getString("fullName"),
							rs.getString("birthDate"), rs.getString("phone"), rs.getString("email"),
							rs.getString("candidateType"), listCertificated));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			pr.close();
			SQLServer.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				rs.close();
			} catch (Exception e2) {
			}
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}

		return temp;
	}

	public InternCandidate getInternCandidate(int canID) {
		InternCandidate can=null;
		SQLServer.connect();
		ResultSet rs = null;
		PreparedStatement pr = null;
		try {

			String sql = "select * from InternCandidate where canID = ?";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setInt(1, canID);
			rs = pr.executeQuery();
			try {
				if (rs.next()) {
					can = new InternCandidate(canID, rs.getString("majors"), rs.getString("semester"),
							rs.getString("universityName"));
				}
			} catch (SQLException e) {
				// TODO: handle exception
			}
			pr.close();
			SQLServer.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				rs.close();
			} catch (Exception e2) {
			}
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
		return can;
	}

	public ExperienceCandidate getExperienceCandidate(int canID) {
		ExperienceCandidate can=null;
		SQLServer.connect();
		ResultSet rs = null;
		PreparedStatement pr = null;
		try {

			String sql = "select * from ExperienceCandidate where canID = ? ";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setInt(1, canID);
			rs = pr.executeQuery();
			try {
				if (rs.next()) {
					can=new ExperienceCandidate(canID, rs.getInt("expInYear"), rs.getString("proSkill"));
				}
			} catch (SQLException e) {
				// TODO: handle exception
			}
			pr.close();
			SQLServer.connection.close();
		} catch (SQLException e) {
			System.out.println("loi tai day");
			e.printStackTrace();
		} finally { // Close connect
			try {
				rs.close();
			} catch (Exception e2) {
			}
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
		return can;
	}

	public FresherCandidate getFresherCandidate(int canID) {
		FresherCandidate can = null;
		SQLServer.connect();
		ResultSet rs = null;
		PreparedStatement pr = null;
		try {

			String sql = "select * from FresherCandidate where canID = ?";
			pr = SQLServer.connection.prepareStatement(sql);
			pr.setInt(1, canID);
			rs = pr.executeQuery();
			try {
				if (rs.next()) {
					can = new FresherCandidate(canID, rs.getString("graduationDate"), rs.getString("graduationRank"),
							rs.getString("education"));
				}
			} catch (SQLException e) {
				// TODO: handle exception
			}
			pr.close();
			SQLServer.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Close connect
			try {
				rs.close();
			} catch (Exception e2) {
			}
			try {
				pr.close();
			} catch (Exception e2) {
			}
			SQLServer.disconnect();
		}
		return can;
	}

	
}
