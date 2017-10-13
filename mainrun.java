import java.util.Scanner;

public class mainrun {
	
	
	public static void main(String[] args) {
		int temp;
		intro();
		Scanner s = new Scanner(System.in);
		System.out.println("Please type number corresponding to desired scores 1.) SAT 2.)ACT for first applicant");
		temp = s.nextInt();
		applicant aone = new applicant();
		applicant atwo = new applicant();
		/*if (temp==1) {
			System.out.println("You Chose SAT");
			sat(s, aone);
		} else if (temp==2) {
			System.out.println("You Chose ACT");
			act(s, aone);
		}*/
		iffy(s,temp,aone);
		System.out.print("Please type number corresponding to desired scores 1.) SAT 2.)ACT for second applicant");
		temp = s.nextInt();
		iffy(s,temp,atwo);
		System.out.println("Applicant one had an overall score of" + aone.getScore()+"\nApplicant 2 has a score of "+atwo.getScore());
		printhigh(aone, atwo);
	s.close();	
	}//mainrun end
	
	static void intro() {
		System.out.println("This program compares two applicants to\ndetermine which one seems like the stronger\napplicant.  For each candidate I will need\neither SAT or ACT scores plus a weighted GPA.");
	}
	
	static void iffy(Scanner s,int opt, applicant num) {
		if (opt==1) {
			System.out.println("You Chose SAT");
			sat(s, num);
		} else if (opt==2) {
			System.out.println("You Chose ACT");
			act(s, num);
		}
	}
	
	public static void act(Scanner s, applicant a) {
		System.out.print("ACT English?");
		int ae = s.nextInt();
		System.out.print("ACT math?");
		int am = s.nextInt();
		System.out.print("ACT reading?");
		int ar = s.nextInt();
		System.out.print("ACT science?");
		int as = s.nextInt();
		double temp = (ae+2*am+ar+as)/1.8;
		System.out.println("exam score = "+temp);
		gpa(s,a);                                                                                                                                                                            
	}//end act
	
	public static void sat(Scanner s, applicant a) {
		System.out.print("SAT math?");
		int smath = s.nextInt();
		System.out.print("SAT Critical reading?");
		int scr = s.nextInt();
		System.out.print("SAT writing?");
		int sw = s.nextInt();
		double temp = (2*smath+scr+sw)/32.0;
		a.setSAT(temp);
		System.out.println("exam score = "+temp);
		gpa(s, a);
	}//end sat
	
	public static void gpa(Scanner s, applicant a) {
		System.out.print("Overall GPA?");
		double og = s.nextDouble();
		System.out.print("Max GPA?");
		double mx = s.nextDouble();
		System.out.print("Transcript Multiplier?");
		double mply = s.nextDouble();
		double temp = (og/mx)*100*mply;
		a.setGPA(temp);
		System.out.println("GPA score = "+temp);
	}//end gpa
	
	static void printhigh(applicant a, applicant b) {
		if (a.getScore()>b.getScore()) {
			System.out.println("Applicant 1 seems to have a better overall score");
		} else if (a.getScore()<b.getScore()) {
			System.out.println("Applicant 2 seems to have a higher score");
		}
	}
	
}
