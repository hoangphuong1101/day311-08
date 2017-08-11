package hoangnq6.day2.candidate;

import java.util.ArrayList;
import java.util.Date;

public class TestMain {
	ArrayList<Candidate> can = new ArrayList<>();

	ArrayList<Certificated> listCertificated = new ArrayList<>();

	void addCertificated() {
		Certificated c1 = new Certificated("ádds", "fdsfsdf", "dfdsf", new Date("1/1/2011"));
		Certificated c2 = new Certificated("ádds", "fdsfsdf", "dfdsf", new Date("1/1/2011"));
		Certificated c3 = new Certificated("ádds", "fdsfsdf", "dfdsf", new Date("1/1/2011"));
		Certificated c4 = new Certificated("ádds", "fdsfsdf", "dfdsf", new Date("1/1/2011"));
		Certificated c5 = new Certificated("ádds", "fdsfsdf", "dfdsf", new Date("1/1/2011"));
		listCertificated.add(c1);
		listCertificated.add(c2);
		listCertificated.add(c3);
		listCertificated.add(c4);
		listCertificated.add(c5);
	}

	public void addCan() {
		FresherCandidate candidate = new FresherCandidate("can1", "hoàng", new Date("1/1/2011"), "0123456789" + "",
				"ga@gmail.com", "Fresher", listCertificated, new Date("1/1/2011"), "sdsada", "đáadasd");
		InternCandidate candidate2 = new InternCandidate("can1", "hoàng", new Date("1/1/2011"), "0123456789",
				"ga@gmail.com", "Intern", listCertificated, "asad", "sadadsad", "ádsad");
		can.add(candidate);
		can.add(candidate2);
	}

	void showCan() {
		for (int i = 0; i < can.size(); i++) {
			Candidate can1 = can.get(i);
			if (can1 instanceof FresherCandidate) {
				FresherCandidate candidate = (FresherCandidate) can1;
				System.err.println(" Tất cả thông tin của ứng viên thứ " + i + " là :\n");
				System.out.println(candidate.showInfo());
			}
			if (can1 instanceof InternCandidate) {
				InternCandidate candidate1 = (InternCandidate) can1;
				System.err.println(" Tất cả thông tin của ứng viên thứ " + i + " là :\n");
				System.out.println(candidate1.showInfo());
			}
			if (can1 instanceof ExperienceCandidate) {
				ExperienceCandidate candidate2 = (ExperienceCandidate) can1;
				System.err.println(" Tất cả thông tin của ứng viên thứ " + i + " là :\n");
				System.out.println(candidate2.showInfo());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMain c = new TestMain();
		c.addCertificated();
		c.addCan();
		c.showCan();

	}

}
