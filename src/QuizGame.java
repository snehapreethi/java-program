import java.util.Scanner;
	class Participant{
		public String Name;
		public String Address;
		public int age;
		public String Qualification;
		public int MobileNumber;
		public String emailid;
			public void setName(String Name){
				this.Name=Name;
			}
			public String getName() {
				return Name;
			}
			public void setAddress(String Address) {
				this.Address=Address;
		}
			public String getAddress() {
				return Address;
			}
			public void setage(int age) {
				this.age=age;
		}
			public int getage() {
				return age;
			}
			public void setQualification(String Qualification) {
				this.Qualification=Qualification;
			}
			public String getQualification() {
				return Qualification; 
			}
			public void setMobileNumber(int MobileNumber) {
				this.MobileNumber=MobileNumber;
			}
			public int getMobileNumber() {
				return MobileNumber;
			}
			public void setemailid(String emailid) {
				this.emailid=emailid;
			}
			public String getemailid() {
				return emailid;
			}		
	}
	public class Quizgame {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
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
	        System.out.print("Are you ready to take the quiz? (yes/no): ");
	        System.out.println("1.Yes");
	        System.out.println("2.No");
	        int response = sc.nextInt();
	        if (response==1) {
	            System.out.println("Great! Let's get started with the quiz!");
	            displayRules();
	            //call Question1
	            Question1();
	        } else if (response==2) {
	            System.out.println("No worries! Come back when you're ready.");
	        } else {
	            System.out.println("Invalid response. Please answer with 'yes' or 'no'.");
	        }
	         sc.close();
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
	    	String questiontext;
	    	String[] options;
	    	int correctAnswer;
	    	boolean isLifelineUsed=false;{
	    		this.questiontext=questiontext;
	    		this.options=options;
	    		this.correctAnswer=correctAnswer;
	    	}
	    	public static void Question1()
	    	{
	    		try {
	    			System.out.println("Question1:");
	    			System.out.println("1.What is th;e capital of India?");
	    			System.out.println("1) Delhi");
	    			System.out.println("2) Bangalore");
	    			System.out.println("3) Chennai");
	    			System.out.println("4) Hyderabad");
	    			System.out.println("5) Lifeline");
	    			System.out.println("6) Quit");
	    			System.out.println("Enter your choice");
	    			Scanner sc=new Scanner(System.in);
	    			int choice1=sc.nextInt();
	    	
	    					
	    			switch(choice1)
	    			{
	    			case 1:
	    				System.out.println("this is the right answer");
	    				System.out.println("You secured 5 points");
	    				Question2();

	    				break;
	    			case 2:
	    				System.out.println("Answer is wrong,Thank you for your participation");
	    				System.exit(0);
	    				break;

	    				
	    			case 3:
	    				System.out.println("Answer is wrong,Thank you for your participation");
	    				System.exit(0);
	    				break;

	    				
	    			case 4:
	    			
	    				System.out.println("Answer is wrong,Thank you for your participation");
	    				System.exit(0);
	    				break;

	    				
	    			
	    			case 5:
	    			
	    				System.out.println("Use Lifeline ");
	    				String response = sc.nextLine().trim().toLowerCase();
	    				if (response.equals("yes")) {
	    		            System.out.println("1. mother  2. father 3.friend  4.teacher ");
	    				}
	    				else {
	    					System.exit(0);
	    		        }
	    				break;

	    		         	
	    			
	    			case 6:
	    				System.out.println("Thankyo for ur participation");
	    				System.exit(0);

	    			}
	    		}
	    		catch(Exception e){
	    			e.printStackTrace();
	    		}
	    	}
				public static void Question2()
	        	{
	    			try {
	        			System.out.println("Question2:");
	        			System.out.println("2.What is the capital of Andhrapradesh?");
	        			System.out.println("1) Delhi");
	        			System.out.println("2) Amaravathi");
	        			System.out.println("3) Chennai");
	        			System.out.println("4) Hyderabad");
	        			System.out.println("5) Lifeline");
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
	        				break;


	        			case 2:
	        				System.out.println("this is the right answer");
	        				System.out.println("You secured 5 points");
	                         Question3();//call the question3
	                         break;

	        			case 3:
	        				System.out.println("this is the wrong answer");
	        				System.out.println("Answer is wrong,Thank you for your participation");
	        				System.exit(0);
	        				break;




	        			case 4:
	        				System.out.println("this is the wrong answer");
	        				System.out.println("Answer is wrong,Thank you for your participation");
	        				System.exit(0);
	        				break;

	        				
	        			case 5:
	            			
	        				System.out.println("Use Lifeline");
	        				String response = sc.nextLine().trim().toLowerCase();
	        				if (response.equals("yes")) {
	        		            System.out.println("1. mother  2. father 3.friend  4.teacher ");
	        				}
	        				else {
	        					System.exit(0);
	        		        }
	        				break;

	        		        	
	        			
	        			case 6:
	        				System.out.println("Thankyo for ur participation");
	        				System.exit(0);

	        			}
	        		}
	        		catch(Exception e){
	        			e.printStackTrace();
	        		}
	        	}
	    		public  static void Question3()
	        	{
	    			try {
	        			System.out.println("Question3:");
	        			System.out.println("3.Name the process by which plants prepare food.?");
	        			System.out.println("1) carbondioxide");
	        			System.out.println("2) oxygen");
	        			System.out.println("3) photosynthesis");
	        			System.out.println("4) methane");
	        			System.out.println("5) Lifeline");
	        			System.out.println("6) Quit");
	        			System.out.println("Enter your choice");
	        			Scanner sc=new Scanner(System.in);
	        			int choice3=sc.nextInt();
	        			switch(choice3)
	        			{
	        			case 1:
	        				System.out.println("this is the wrong answer");
	        				System.out.println("Answer is wrong,Thank you for your participation");
	        				System.exit(0);
	        				break;



	        				
	        			case 2:
	        				System.out.println("this is the wrong answer");
	        				System.out.println("Answer is wrong,Thank you for your participation");
	        				System.exit(0);
	        				break;



	        			case 3:
	        				System.out.println("this is the right answer");
	        				System.out.println("You secured 5 points");
	                        Question4(); //call the question4
	                        break;



	        			case 4:
	        				System.out.println("this is the wrong answer");
	        				System.out.println("Answer is wrong,Thank you for your participation");
	        				System.exit(0);
	        				break;

	        				
	        			case 5:
	            			
	        				System.out.println("Use Lifeline");
	        				String response = sc.nextLine().trim().toLowerCase();
	        				if (response.equals("yes")) {
	        		            System.out.println("1. mother  2. father 3.friend  4.teacher ");
	        				}
	        				else {
	        					System.exit(0);
	        		        }
	        				break;
	        		         	
	        			
	        			case 6:
	        				System.out.println("Thankyo for ur participation");
	        				System.exit(0);

	        			}
	        		}
	        		catch(Exception e){
	        			e.printStackTrace();
	        		}
	        	}
	    		public  static void Question4()
	        	{
	    			try {
	        			System.out.println("Question4:");
	        			System.out.println("4.Which planet is called a red planet?");
	        			System.out.println("1) earth");
	        			System.out.println("2) jupiter");
	        			System.out.println("3) mars");
	        			System.out.println("4) mercury");
	        			System.out.println("5) Lifeline");
	        			System.out.println("6) Quit");
	        			System.out.println("Enter your choice");
	        			Scanner sc=new Scanner(System.in);
	        			int choice4=sc.nextInt();
	        			switch(choice4)
	        			{
	        			case 1:
	        				System.out.println("this is the wrong answer");
	        				System.out.println("Answer is wrong,Thank you for your participation");
	        				System.exit(0);
	        				break;
	        			case 2:
	        				System.out.println("this is the wrong answer");
	        				System.out.println("Answer is wrong,Thank you for your participation");
	        				System.exit(0);
	        				break;


	        			case 3:
	        				System.out.println("this is the right answer");
	        				System.out.println("You secured 5 points");
	        				Question5();//call the question5
	        				break;



	        			case 4:
	        				System.out.println("this is the wrong answer");
	        				System.out.println("Answer is wrong,Thank you for your participation");
	        				System.exit(0);
	        				break;
	        				
	        			case 5:
	            			
	        				System.out.println("Use Lifeline");
	        				String response = sc.nextLine().trim().toLowerCase();
	        				if (response.equals("yes")) {
	        		            System.out.println("1. mother  2. father 3.friend  4.teacher ");
	        				}
	        				else {
	        					System.exit(0);
	        		        }
	        				break;
	        		         	
	        			
	        			case 6:
	        				System.out.println("Thankyo for ur participation");
	        				System.exit(0);

	        			}
	        		}
	        		catch(Exception e){
	        			e.printStackTrace();
	        		}
	        	}
	    		public static void Question5()
	        	{
	    			try {
	        			System.out.println("Question5:");
	        			System.out.println("1.The solar system is a part of which galaxy?");
	        			System.out.println("1) earth");
	        			System.out.println("2) Milky Way Galaxy");
	        			System.out.println("3) mars");
	        			System.out.println("4) mercury");
	        			System.out.println("5) Lifeline");
	        			System.out.println("6) Quit");
	        			System.out.println("Enter your choice");
	        			Scanner sc=new Scanner(System.in);
	        			int choice5=sc.nextInt();
	        			switch(choice5)
	        			{
	        			case 1:
	        				System.out.println("this is the wrong answer");
	        				System.out.println("Answer is wrong,Thank you for your participation");
	        				System.exit(0);
	        				break;

	        			case 2:
	        				System.out.println("this is the right answer");
	        				System.out.println("You secured 5 points");
	        				Question6();// call question 6
	        				break;



	        			case 3:
	        				System.out.println("this is the wrong answer");
	        				System.out.println("Answer is wrong,Thank you for your participation");
	        				System.exit(0);
	        				break;


	        			case 4:
	        				System.out.println("this is the wrong answer");
	        				System.out.println("Answer is wrong,Thank you for your participation");
	        				System.exit(0);
	        				break;
	        				
	        			case 5:
	            			
	        				System.out.println("Use Lifeline");
	        				String response = sc.nextLine().trim().toLowerCase();
	        				if (response.equals("yes")) {
	        		            System.out.println("1. mother  2. father 3.friend  4.teacher ");
	        				}
	        				else {
	        					System.exit(0);
	        		        }
	        				break;
	        		        	
	        			
	        			case 6:
	        				System.out.println("Thankyo for ur participation");
	        				System.exit(0);

	        			}
	        		}
	        		catch(Exception e){
	        			e.printStackTrace();
	        		}
	        	}

	    			public  static void Question6()
	            	{
	        			try {
	            			System.out.println("Question6:");
	            			System.out.println("1.Which is the national river of India?");
	            			System.out.println("1) Thngabadhra");
	            			System.out.println("2) Godavari");
	            			System.out.println("3) Ganga ");
	            			System.out.println("4) kaveri");
	            			System.out.println("5) Lifeline");
	            			System.out.println("6) Quit");
	            			System.out.println("Enter your choice");
	            			Scanner sc=new Scanner(System.in);
	            			int choice6=sc.nextInt();
	            			switch(choice6)
	            			{
	            			case 1:
	            				System.out.println("this is the wrong answer");
	            				System.out.println("Answer is wrong,Thank you for your participation");
	            				System.exit(0);
	            				break;
	            			case 2:
	            				System.out.println("this is the wrong answer");
	            				System.out.println("Answer is wrong,Thank you for your participation");
	            				System.exit(0);
	            				break;


	            			case 3:
	            				System.out.println("this is the right answer");
	            				System.out.println("You secured 5 points");
	            				Question7();//call the question7
	            				break;



	            			case 4:
	            				System.out.println("this is the wrong answer");
	            				System.out.println("Answer is wrong,Thank you for your participation");
	            				System.exit(0);
	            				break;
	            				
	            			case 5:
	                			
	            				System.out.println("Use Lifeline");
	            				String response = sc.nextLine().trim().toLowerCase();
	            				if (response.equals("yes")) {
	            		            System.out.println("1. mother  2. father 3.friend  4.teacher ");
	            				}
	            				else {
	            					System.exit(0);
	            		        }
	            				break;
	            		         	
	            			
	            			case 6:
	            				System.out.println("Thankyo for ur participation");
	            				System.exit(0);

	            			}
	            		}
	            		catch(Exception e){
	            			e.printStackTrace();
	            		}
	            	}
	    			public static void Question7()
	            	{
	        			try {
	            			System.out.println("Question7:");
	            			System.out.println("7.Which is the national river of India?");
	            			System.out.println("1) Thngabadhra");
	            			System.out.println("2) Godavari");
	            			System.out.println("3) Ganga ");
	            			System.out.println("4) kaveri");
	            			System.out.println("5) Lifeline");
	            			System.out.println("6) Quit");
	            			System.out.println("Enter your choice");
	            			Scanner sc=new Scanner(System.in);
	            			int choice7=sc.nextInt();
	            			switch(choice7)
	            			{
	            			case 1:
	            				System.out.println("this is the wrong answer");
	            				System.out.println("Answer is wrong,Thank you for your participation");
	            				System.exit(0);
	            				break;
	            			case 2:
	            				System.out.println("this is the wrong answer");
	            				System.out.println("Answer is wrong,Thank you for your participation");
	            				System.exit(0);
	            				break;


	            			case 3:
	            				System.out.println("this is the right answer");
	            				System.out.println("You secured 5 points");
	            				Question8();//call the question8
	            				break;



	            			case 4:
	            				System.out.println("this is the wrong answer");
	            				System.out.println("Answer is wrong,Thank you for your participation");
	            				System.exit(0);
	            				break;
	            				
	            			case 5:
	                			
	            				System.out.println("Use Lifeline");
	            				String response = sc.nextLine().trim().toLowerCase();
	            				if (response.equals("yes")) {
	            		            System.out.println("1. mother  2. father 3.friend  4.teacher ");
	            				}
	            				else {
	            					System.exit(0);
	            		        }
	            				break;
	            		       	
	            			
	            			case 6:
	            				System.out.println("Thankyo for ur participation");
	            				System.exit(0);
	                       }
	            			
	            			
	            		}
	        			
	            		catch(Exception e){
	            			e.printStackTrace();
	            		}
	            	}
	    			public  static void Question8()
	            	{
	        			try {
	            			System.out.println("Question8:");
	            			System.out.println("8.How many continents are there in the world?");
	            			System.out.println("1) 5");
	            			System.out.println("2) 6");
	            			System.out.println("3) 8 ");
	            			System.out.println("4) 7");
	            			System.out.println("5) Lifeline");
	            			System.out.println("6) Quit");
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
	            				break;


	            			case 3:
	            				System.out.println("this is the wrong answer");
	            				System.out.println("Answer is wrong,Thank you for your participation");
	            				System.exit(0);
	            				break;



	            			case 4:
	            				System.out.println("this is the right answer");
	            				System.out.println("You secured 5 points");
	            				Question9();//call the question9
	            				break;

	            				
	            			case 5:
	                			
	            				System.out.println("Use Lifeline");
	            				String response = sc.nextLine().trim().toLowerCase();
	            				if (response.equals("yes")) {
	            		            System.out.println("1. mother  2. father 3.friend  4.teacher ");
	            				}
	            				else {
	            					System.exit(0);
	            		        }
	            				break;
	            		         	
	            			
	            			case 6:
	            				System.out.println("Thankyo for ur participation");
	            				System.exit(0);
	            				break;

	            			}
	            		}
	            		catch(Exception e){
	            			e.printStackTrace();
	            		}
	            	}
	    			public static  void Question9()
	            	{
	        			try {
	            			System.out.println("Question9:");
	            			System.out.println("9.How many continents are there in the world?");
	            			System.out.println("1) 5");
	            			System.out.println("2) 6");
	            			System.out.println("3) 8 ");
	            			System.out.println("4) 7");
	            			System.out.println("5) Lifeline");
	            			System.out.println("6) Quit");
	            			System.out.println("Enter your choice");
	            			Scanner sc=new Scanner(System.in);
	            			int choice9=sc.nextInt();
	            			switch(choice9)
	            			{
	            			case 1:
	            				System.out.println("this is the wrong answer");
	            				System.out.println("Answer is wrong,Thank you for your participation");
	            				System.exit(0);
	            				break;
	            			case 2:
	            				System.out.println("this is the wrong answer");
	            				System.out.println("Answer is wrong,Thank you for your participation");
	            				System.exit(0);
	            				break;


	            			case 3:
	            				System.out.println("this is the wrong answer");
	            				System.out.println("Answer is wrong,Thank you for your participation");
	            				System.exit(0);
	            				break;


	            			case 4:
	            				System.out.println("this is the right answer");
	            				System.out.println("You secured 5 points");
	            				 Question10();//call the question10
	            				 break;

	            				
	            			case 5:
	                			
	            				System.out.println("Use Lifeline");
	            				String response = sc.nextLine().trim().toLowerCase();
	            				if (response.equals("yes")) {
	            		            System.out.println("1. mother  2. father 3.friend  4.teacher ");
	            				}
	            				else {
	            					System.exit(0);
	            		        }	
	            				break;
	            			
	            			case 6:
	            				System.out.println("Thankyo for ur participation");
	            				System.exit(0);
	            				break;
	            			}
	            		}
	            		catch(Exception e){
	            			e.printStackTrace();
	            		}
	            	}
	    			public static void Question10()
	            	{
	        			try {
	            			System.out.println("Question10:");
	            			System.out.println("10.Which is the mountain range located in the northern part of India?");
	            			System.out.println("1) Govardhanagiri");
	            			System.out.println("2) mount everest");
	            			System.out.println("3) Avani ");
	            			System.out.println("4) Himalayas ");
	            			System.out.println("5) Lifeline");
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
	            				break;
	            			case 2:
	            				System.out.println("this is the wrong answer");
	            				System.out.println("Answer is wrong,Thank you for your participation");
	            				System.exit(0);
	            				break;


	            			case 3:
	            				System.out.println("this is the wrong answer");
	            				System.out.println("Answer is wrong,Thank you for your participation");
	            				System.exit(0);
	            				break;


	            			case 4:
	            				System.out.println("this is the right answer");
	            				System.out.println("You secured 5 points");
	            				break;

	            				
	            			case 5:
	            			{
	            				System.out.println("Use Lifeline");
	            				System.out.println("1.yes");
	            				int response = sc.nextInt();
	            				if (response==1) {
	            		            System.out.println("1. mother  2. father 3.friend  4.teacher ");
	            				}
	            				else {
	            					System.exit(0);
	            				}
	            					break;
	            			}
	            			
	            			case 6:{
	            				System.out.println("Thankyou for ur participation");
	            				System.exit(0);
	            			}
	            			}
	            			System.out.println("Game Over");
	            		}
	            		catch(Exception e){
	            			e.printStackTrace();
	            		}
	    			
	            	}
	}

