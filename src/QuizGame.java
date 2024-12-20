import java.util.Scanner;
class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you ready to take the quiz? (yes/no): ");
        String response = scanner.nextLine().trim().toLowerCase();
        if (response.equals("yes")) {
            System.out.println("Great! Let's get started with the quiz!");
            displayRules();
        } else if (response.equals("no")) {
            System.out.println("No worries! Come back when you're ready.");
        } else {
            System.out.println("Invalid response. Please answer with 'yes' or 'no'.");
        }
        scanner.close();
    }
    public static void displayRules() {
        System.out.println("\n*** Quiz Rules ***");
        System.out.println("1. You will be asked a series of questions.");
        System.out.println("2. Start first question with 4 options and 2 life lines.");
        System.out.println("3. Remember the life line can be used be used only once.");
        System.out.println("4. So.Choose the correct answer from the options provided.");
        System.out.println("5. You will earn points for each correct answer.");
        System.out.println("6. There is no time limit, but try to an quickly!");
        System.out.println("7. If he say correct answerswer!\n reward an amount!\n go to next question!\n");
        System.out.println("8. At the end of the quiz, your score will be displayed.");
        System.out.println("Good luck and have fun!\n");
	}
  }
public void Question1()
{
	try {
		System.out.println("Question1:");
		System.out.println("1.Which is the national river of India?");
		System.out.println("1) Thngabadhra");
		System.out.println("2) Godavari");
		System.out.println("3) Ganga ");
		System.out.println("4) kaveri");
		System.out.println("5) Lifeline");
		System.out.println("6) Quit");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int choice1=sc.nextInt();
		switch(choice1)
		{
		case 1:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
		case 2:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);


		case 3:
			System.out.println("this is the right answer");
			System.out.println("You secured 5 points");
			//call the question7




		case 4:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
			
		case 5:
			
			System.out.println("Use Lifeline and Audience poll");
		
		case 6:
			System.out.println("Quit");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
public void Question2()
{
	try {
		System.out.println("Question2:");
		System.out.println("1.Which is the largest producer of copper in India?");
		System.out.println("1) Jharkhand");
		System.out.println("2) Bihar");
		System.out.println("3) Madhya Pradesh ");
		System.out.println("4) Rajasthan");
		System.out.println("5) Chattisgarh");
		System.out.println("6) Quit");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int choice2=sc.nextInt();
		switch(choice2)
		{
		case 1:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
		case 2:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);


		case 3:
			System.out.println("this is the right answer");
			System.out.println("You secured 5 points");
			//call the question7




		case 4:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
			
		case 5:
			
			System.out.println("Use Lifeline and Audience poll");
		
		case 6:
			System.out.println("Quit");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
public void Question3()
{
	try {
		System.out.println("Question3:");
		System.out.println("1.Which one of the following gases is considered as atmospheric pollutant?");
		System.out.println("1) Oxygen");
		System.out.println("2) Ozone");
		System.out.println("3) Sulphur dioxide(So2) ");
		System.out.println("4) Nitrogen");
		System.out.println("5) Carbondioxide");
		System.out.println("6) null");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int choice3=sc.nextInt();
		switch(choice3)
		{
		case 1:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
		case 2:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);


		case 3:
			System.out.println("this is the right answer");
			System.out.println("You secured 5 points");
			//call the question7




		case 4:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
			
		case 5:
			
			System.out.println("Use Lifeline and Audience poll");
		
		case 6:
			System.out.println("Quit");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
public void Question4()
{
	try {
		System.out.println("Question4:");
		System.out.println("4.Which of the following rivers of India crosses the tropic of cancer twice?");
		System.out.println("1) Mahi");
		System.out.println("2) Chambali");
		System.out.println("3) Narmada ");
		System.out.println("4) Yamuna");
		System.out.println("5) Luni");
		System.out.println("6) not all");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int choice4=sc.nextInt();
		switch(choice4)
		{
		case 1:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
		case 2:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);


		case 3:
			System.out.println("this is the right answer");
			System.out.println("You secured 5 points");
			//call the question7




		case 4:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
			
		case 5:
			
			System.out.println("Use Lifeline and Audience poll");
		
		case 6:
			System.out.println("Quit");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
public void Question5()
{
	try {
		System.out.println("Question5:");
		System.out.println("1.In which Indian state is the Flamingo festival celebrated?");
		System.out.println("1) Rajasthan");
		System.out.println("2) Assam");
		System.out.println("3) Manipur ");
		System.out.println("4) Andhra Pradesh");
		System.out.println("5) Kolar");
		System.out.println("6) all");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int choice5=sc.nextInt();
		switch(choice5)
		{
		case 1:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
		case 2:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);


		case 3:
			System.out.println("this is the right answer");
			System.out.println("You secured 5 points");
			//call the question7




		case 4:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
			
		case 5:
			
			System.out.println("Use Lifeline and Audience poll");
		
		case 6:
			System.out.println("Quit");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
public void Question6()
{
	try {
		System.out.println("Question6:");
		System.out.println("1.Who among the following performing artists bagged the best actress for Meena Gurjari in 1975?");
		System.out.println("1) Sonal Masingh");
		System.out.println("2) Sitara Devi");
		System.out.println("3) Shovana Narayana");
		System.out.println("4) Mallika Sarabhai");
		System.out.println("5) Lifeline");
		System.out.println("6) null");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int choice6=sc.nextInt();
		switch(choice6)
		{
		case 1:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
		case 2:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);


		case 3:
			System.out.println("this is the right answer");
			System.out.println("You secured 5 points");
			//call the question7




		case 4:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
			
		case 5:
			
			System.out.println("Use Lifeline and Audience poll");
		
		case 6:
			System.out.println("Quit");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
public void Question7()
{
	try {
		System.out.println("Question7:");
		System.out.println("1.The author of world famous Harry Potter series is ?");
		System.out.println("1) Arundhati Roy ");
		System.out.println("2) J K Rowling");
		System.out.println("3) Taslima Nasrin ");
		System.out.println("4) Salman Rushdie");
		System.out.println("5) all");
		System.out.println("6) All");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int choice7=sc.nextInt();
		switch(choice7)
		{
		case 1:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
		case 2:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);


		case 3:
			System.out.println("this is the right answer");
			System.out.println("You secured 5 points");
			//call the question7




		case 4:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
			
		case 5:
			
			System.out.println("Use Lifeline and Audience poll");
		
		case 6:
			System.out.println("Quit");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
public void Question8()
{
	try {
		System.out.println("Question8:");
		System.out.println("1. Who was the court poet of Samudragupta?");
		System.out.println("1) Bnabhatta");
		System.out.println("2) Harishen");
		System.out.println("3) Chand Bardai ");
		System.out.println("4) Bhavabhuti");
		System.out.println("5) Null");
		System.out.println("6) all");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int choice8=sc.nextInt();
		switch(choice8)
		{
		case 1:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
		case 2:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);


		case 3:
			System.out.println("this is the right answer");
			System.out.println("You secured 5 points");
			//call the question7




		case 4:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
			
		case 5:
			
			System.out.println("Use Lifeline and Audience poll");
		
		case 6:
			System.out.println("Quit");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
public void Question9()
{
	try {
		System.out.println("Question9:");
		System.out.println("1.Which state does not share its boundary with Myanmar?");
		System.out.println("1) Arunachal Pradesh");
		System.out.println("2) Mizoram");
		System.out.println("3) Manipur ");
		System.out.println("4) Sikkim");
		System.out.println("5) Zero");
		System.out.println("6) null");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int choice9=sc.nextInt();
		switch(choice9)
		{
		case 1:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
		case 2:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);


		case 3:
			System.out.println("this is the right answer");
			System.out.println("You secured 5 points");
			//call the question7




		case 4:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
			
		case 5:
			
			System.out.println("Use Lifeline and Audience poll");
		
		case 6:
			System.out.println("Quit");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
public void Question10()
{
	try {
		System.out.println("Question10:");
		System.out.println("1.Which of the followings was Not a Harappan city?");
		System.out.println("1) Lothal");
		System.out.println("2) Dholavira");
		System.out.println("3) Mehrgarh");
		System.out.println("4) Sokhta Koh");
		System.out.println("5) Canada");
		System.out.println("6) Quit");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int choice10=sc.nextInt();
		switch(choice10)
		{
		case 1:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
		case 2:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);


		case 3:
			System.out.println("this is the right answer");
			System.out.println("You secured 5 points");
			//call the question7




		case 4:
			System.out.println("this is the wrong answer");
			System.out.println("Answer is wrong,Thank you for your participation");
			System.exit(0);
			
		case 5:
			
			System.out.println("Use Lifeline and Audience poll");
		
		case 6:
			System.out.println("Quit");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}