import java.util.Scanner;
public class QuizApp {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Participant p=new Participant();
			System.out.println("Enter ur Name");
			p.Name=sc.next();
			System.out.println("Enter ur Address");
			p.Address=sc.next();
			System.out.println("Enter ur age");
			p.age=sc.nextInt();
			System.out.println("Enter ur Qualification");
			p.Qualification=sc.next();
			System.out.println("Enter ur MobileNumber");
			p.MobileNumber=sc.nextInt();
			System.out.println("Enter ur emailid");
			p.emailid=sc.next();
			System.out.println(p.getName());
			System.out.println(p.getAddress());
			System.out.println(p.getage());
			System.out.println(p.getQualification());
			System.out.println(p.getMobileNumber());
			System.out.println(p.getemailid());	
			System.out.println(p);
		}
	}
