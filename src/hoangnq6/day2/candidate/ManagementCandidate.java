package hoangnq6.day2.candidate;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * ManagementCandidate
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
public class ManagementCandidate {
//	ArrayList<Candidate> candidates = new ArrayList<>();
	/**
	 * 
	 */
	public void management() {
		BO bo = new BO();
	
		while (true) {
			System.err.println("====Nhập thông tin ứng viên đăng kí======\n");
			Scanner scanner = new Scanner(System.in);
			System.out.println("candidateID : ");
			String candidateID = scanner.nextLine();
			System.out.println();

			Scanner scanner1 = new Scanner(System.in);
			System.out.println("fullName : ");
			String fullName = scanner1.nextLine();
			System.out.println();

			Scanner scanner2 = new Scanner(System.in);
			String birthDate;
			while (true) {
				System.out.println("BirthDate : ");
				birthDate = scanner2.nextLine();

				try {
					Date birth = new Date(birthDate);
					if (common.formatDateYear(birth))
						break;
					else
						System.out.println("vui lòng nhập lại ngày sinh");
				} catch (Exception e) {
					System.out.println("vui lòng nhập lại ngày sinh");
				}
				System.out.println();
			}

			Scanner scanner4 = new Scanner(System.in);
			String phone;

			while (true) {
				System.out.println("Phone : ");
				phone = scanner4.nextLine();
				if (common.checkIsPhone(phone))
					break;
				System.out.println("vui lòng nhập lại số điện thoại ");
			}

			System.out.println();
			Scanner scanner5 = new Scanner(System.in);
			String email;
			while (true) {
				System.out.println("Email : ");
				email = scanner5.nextLine();
				if (common.validate(email))
					break;
				System.err.println("vui lòng nhập lại email đúng định dạng");
			}
			int type;
			while (true) {
				Scanner scanner6 = new Scanner(System.in);
				System.out.println("Candidate_type có giá trị tương ứng là " + "0: Experience \n"
						+ "1: Fresher_ candidate\n" + "2: Intern_ candidate\n" + "Vui lòng nhập 0 hoặc 1 hoặc 2");
				try {
					type = scanner6.nextInt();
					if (type == 0 || type == 1 || type == 2)
						break;
					else
						System.err.println("Thông tin nhập vào " + "không chính xác, vui lòng nhập lại\n");
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println("Thông tin nhập vào " + "không chính xác, vui lòng nhập lại\n");
				}
			}

			String candidateType = "";
			int expInYear = 0;
			String proSkill = "";

			String graduationDate="";
			String graduationRank = "";
			String education = "";

			String majors = "";
			String semester = "";
			String universityName = "";
			
			
			switch (type) {
			case 0:
				candidateType = "Experience";
				break;

			case 1:
				candidateType = "Fresher";
				break;

			case 2:
				candidateType = "Intern";
				break;

			default:
				break;
			}
			
			
			Candidate can = new Candidate(candidateID, fullName, birthDate, phone, email, candidateType);
			// thêm mới 1 candidate for dâtbase
			bo.addCandidate(can);
			int canID=bo.getCandidateIDForDatabase();
			
			switch (type) {
			case 0:

				
				while(true){
					Scanner scanner7 = new Scanner(System.in);
					System.out.println("Số năm kinh nghiệm : ");
					try {
						expInYear = scanner7.nextInt();
						if (common.checkExpInYear(expInYear))
							break;
						System.err.println("vui lòng nhập lại năm kinh nghiêm:");
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println("vui lòng nhập lại năm kinh nghiêm bằng số nguyên:");
					}
				}

				Scanner scanner22 = new Scanner(System.in);
				System.out.println("Kỹ năng chuyên môn  : ");
				proSkill = scanner22.nextLine();
				System.out.println();
				ExperienceCandidate can1 = new ExperienceCandidate(canID, expInYear, proSkill);
				bo.addExperienceCandidate(can1);
				break;

			case 1:
				System.out.println();
				while(true){
					Scanner scanner8 = new Scanner(System.in);
					System.out.println("Thời gian tốt nghiệp  : ");
					graduationDate = scanner8.nextLine();
					try {
						Date date = new Date(graduationDate);
						if (common.formatDateYear(date))
							break;
						else
							System.out.println("vui lòng nhập lại graduation Date");
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println("vui lòng nhập lại graduation Date: ");
					}
				}

				System.out.println();
				Scanner scanner81 = new Scanner(System.in);
				while (true) {
					System.out.println("Xếp loại tốt nghiệp  : ");
					graduationRank = scanner81.nextLine();
					if (common.checkGraduationRank(graduationRank))
						break;
					System.out.println(" nhập xếp loại theo 4 giá trị Excellence, Good, Fair, Poor");
				}

				System.err.println();
				System.out.println("trường tốt nghiệp : ");
				Scanner scanner84 = new Scanner(System.in);
				education = scanner84.nextLine();
				System.out.println("--------^-^----------");
				FresherCandidate can2 = new FresherCandidate(canID, graduationDate, graduationRank, education);
				bo.addFresherCandidate(can2);
				break;

			case 2:

				Scanner scanner9 = new Scanner(System.in);
				System.out.println("Chuyên ngành đang học : ");
				majors = scanner9.nextLine();
				System.out.println("--------^-^----------");

				Scanner scanner10 = new Scanner(System.in);
				System.out.println("Học kì đang học : ");
				semester = scanner10.nextLine();
				System.out.println("--------^-^----------");

				Scanner scanner11 = new Scanner(System.in);
				System.out.println("tên trường đang học : ");
				universityName = scanner11.nextLine();
				System.out.println("--------^-^----------");
				InternCandidate can3 = new InternCandidate(canID, majors, semester, universityName);
				bo.addInternCandidate(can3);
				break;

			default:
				break;
			}

			// add danh sách bằng cấp
//			ArrayList<Certificated> listCertificated = new ArrayList<>();
			// số bằng cấp
			int countCertificated = 0;

			Scanner scanner12 = new Scanner(System.in);
			while (true) {
				System.out.println("Certificated: vui lòng nhập số bằng cấp  bạn đang có (kiểu số nguyên) : ");
				try {
					countCertificated = scanner12.nextInt();
					break;
				} catch (Exception e) {
					System.err.println("bạn đã nhập sai kiểu dữ liệu, vui lòng nhập kiểu số nguyên vd: 1,2,...");
				}
			}

			while (countCertificated > 0) {

				String certificatedID;
				String certificateName;
				String certificateRank;
				String ertificatedDate;

				Scanner scanner13 = new Scanner(System.in);
				System.out.println(" certificatedID: ");
				certificatedID = scanner13.nextLine();

				Scanner scanner14 = new Scanner(System.in);
				System.out.println(" certificateName: ");
				certificateName = scanner13.nextLine();

				Scanner scanner15 = new Scanner(System.in);
				System.out.println(" certificateRank: ");
				certificateRank = scanner15.nextLine();

				Scanner scanner16 = new Scanner(System.in);
				while (true) {
					System.out.println("ertificatedDate : ");
					ertificatedDate = scanner16.nextLine();

					try {
						Date date1 = new Date(ertificatedDate);
						if (common.formatDateYear(date1))
							break;
						else
							System.err.println("vui lòng nhập lại ngày tốt nghiệp");
					} catch (Exception e) {
						System.err.println("vui lòng nhập lại ngày tốt nghiệp");
					}
					System.out.println();
				}

				Certificated certificated = new Certificated(canID, certificatedID, certificateName, certificateRank, ertificatedDate);
				bo.addCertificated(certificated);
				countCertificated--;

			}
			/*
			 * 0: Experience Candidate 1: Fresher Candidate 2: Intern Candidate
			 */
			/*switch (type) {
			case 0:
				ExperienceCandidate candidate1 = new ExperienceCandidate(candidateID, fullName, birthDate, phone, email,
						candidateType, listCertificated, expInYear, proSkill);
				 list.add(candidate1);
//				System.out.println(candidate1.showInfo());
				break;
			case 1:
				FresherCandidate candidate2 = new FresherCandidate(candidateID, fullName, birthDate, phone, email,
						candidateType, listCertificated, graduationDate, graduationRank, education);
				 list.add(candidate2);
//				System.out.println(candidate2.showInfo());
				break;
			case 2:
				InternCandidate candidate3 = new InternCandidate(candidateID, fullName, birthDate, phone, email,
						candidateType, listCertificated, majors, semester, universityName);
				 list.add(candidate3);
//				System.out.println(candidate3.showInfo());
				break;
			default:
				break;
			}*/
			Scanner scanner3 = new Scanner(System.in);
			System.out.print("bạn có muốn nhập thông tin ứng viên tiếp theo không? \n"
					+ "nếu có hãy nhập ok \naction = ");
			String ok=scanner3.nextLine();
			if(!ok.equals("ok")){
				System.out.println("số ứng viên bạn vừa nhập vào là : "+can.canidateCount);
				break;
				
			}
		}
		
	}
	
	/**
	 * 
	 * @param listCandidate
	 */
	public void showListCandidate(ArrayList<Candidate> candidates){
		BO bo = new BO();
		for (Candidate candidate : candidates) {
			int canID = candidate.getCanID();
			switch (candidate.getCandidateType()) {
			case "Fresher":
				System.out.println("qua Fresher");
				System.out.println(candidate.showInfo()+ bo.getExperienceCandidate(canID).showInfo());
				break;
			case "Intern":
				System.out.println(candidate.showInfo()+bo.getInternCandidate(canID).showInfo());
				break;
			case "Experience":
				System.out.println(candidate.showInfo()+bo.getExperienceCandidate(canID).showInfo());
				break;
			default:
				System.out.println("loi show nhes!!!");
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagementCandidate managementCandidate = new ManagementCandidate();
		
//		managementCandidate.management();
		BO bo = new BO();
		ArrayList<Candidate> candidates = bo.getListCandidate();
		managementCandidate.showListCandidate(candidates);
//		managementCandidate.showListCandidate(listCandidate);
//		managementCandidate.showListCandidate();
	}

}
