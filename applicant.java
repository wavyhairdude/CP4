
public class applicant {
	private double SAT;
	private double ACT;
	private double GPA;
	private double score;
	//declares values of applicants score
	public double getSAT() {
		return SAT;
	}
	public void setSAT(double sAT) {
		SAT = sAT;
	}
	public double getACT() {
		return ACT;
	}
	public void setACT(double aCT) {
		ACT = aCT;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public double getScore() {
		if (SAT==0) {
			score = ACT + GPA;
			
		} else if (ACT==0) {
			score = SAT + GPA;
		}
		return score;
	}
	

	
}
