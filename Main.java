import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int van;
		do{
				System.out.println(" ");
			System.out.println("SWISS Military VLDZ");
			System.out.println("Please choose a function");
			System.out.println("Type 1 to print Author's Name");
			System.out.println("Type 2 for Simp(le) Calculator");
			System.out.println("Type 3 to use Simp(le) Calculator v2");
			System.out.println("Type 4 to use Basic Info Collector");
			System.out.println("Type 5 to use MATH Calculator all Operations");
			System.out.println("Type 6 to use STI Grades PASS/FAIL Checker");
			System.out.println("Type 7 to end the program");
			System.out.println(" ");
			System.out.println("Or enter a random number to get yelled at :v");
			System.out.println(" ");
			System.out.println("Enter Function Number:");
			van = scn.nextInt();
				
//name printer
			if (van == 1) {
				System.out.println("The author of this project is John Andrei L. Valdez, ICT S7 Batch 2 under the supervision of Mr. Richard James Uri.");
			}
			//simp calculator
			else if (van == 2) {
				System.out.println("Simp(le) Calculator");
				System.out.println("Please type 1 to use Addition");
				System.out.println("Please type 2 to use Subtraction");
				System.out.println("Please type 3 to use Multiplication");
				System.out.println("Please type 4 to use Division");

				System.out.println("Please enter the operation number:");
				int op = scn.nextInt();

				System.out.println("Please enter Number one:");
				int a1 = scn.nextInt();

				System.out.println("Please enter Number two:");
				int a2 = scn.nextInt();

				int q1 = a1 + a2;
				int q2 = a1 - a2;
				int q3 = a1 * a2;
				int q4 = a1 / a2;

				if (op == 1) {
					System.out.println("The Sum is: " + q1);
				} else if (op == 2) {
					System.out.println("The difference is: " + q2);
				} else if (op == 3) {
					System.out.println("The product is: " + q3);
				} else if (op == 4) {
					System.out.println("The quotient is: " + q4);
				} else if (op >= 5) {
					System.out.println("Selected number is not even a function!");
				}
			}

//simp calc v2
			else if (van == 3) {
				System.out.println("SIMP(le) Calculator V2");
				System.out.println("Please type ADD for addition");
				System.out.println("Please type SUB for subtraction");
				System.out.println("Please type MUL for multiplication");
				System.out.println("Please type DIV for division");

				System.out.println("Please enter the operation ID:");
				String op2 = scn.next();

				System.out.println("enter first number:");
				int sakura1 = scn.nextInt();

				System.out.println("enter second number:");
				int sakura2 = scn.nextInt();

				int sed1 = sakura1 + sakura2;
				int sed2 = sakura1 - sakura2;
				int sed3 = sakura1 * sakura2;
				int sed4 = sakura1 / sakura2;


				if (op2.equalsIgnoreCase("ADD")) {
					System.out.println("The Sum is: " + sed1);

				} else if (op2.equalsIgnoreCase("SUB")) {
					System.out.println("The Difference is: " + sed2);

				} else if (op2.equalsIgnoreCase("MUL")) {
					System.out.println("The Product is: " + sed3);

				} else  if (op2.equalsIgnoreCase("DIV")) {
					System.out.println("The Quotient is: " + sed4);
				} else {
					System.out.println("Please choose on either ADD, SUB, MUL, or DIV only!");
				}
			}
//basic info
			else if (van == 4) {
				System.out.println("Basic Info Collector");

				System.out.println("Please Enter your First Name:");
				String info1 = scn.next();

				System.out.println("Please Enter your Birthyear (YYYY):");
				int info2 = scn.nextInt();

				System.out.println("Your first name is:" + info1);
				System.out.println("Aaaand, your Birthyear is:" + info2);
			}
//all operands
			else if (van == 5) {
				System.out.println("Math all Operands");

				System.out.println("Please enter the first number:");
				int numer1 = scn.nextInt();

				System.out.println("Please enter the second number:");
				int numer2 = scn.nextInt();

				System.out.println("Please enter the third number:");
				int numer3 = scn.nextInt();

				int azad1 = numer1 + numer2 + numer3;
				int azad2 = numer1 - numer2 - numer3;
				int azad3 = numer1 * numer2 * numer3;
				int azad4 = numer1 / numer2 / numer3;
				int azad5 = numer1 % numer2 % numer3;

				System.out.println("The sum is: " + azad1);
				System.out.println("The difference is: " + azad2);
				System.out.println("The Product is: " + azad3);
				System.out.println("The quotient is: " + azad4);
				System.out.println("The modulo is: " + azad5);


			}
//grade checker
			else if (van == 6) {
				System.out.println("Please enter your ComProg1 Grade:");
				double gr1 = scn.nextDouble();

				System.out.println("Please enter your ComProg2 Grade:");
				double gr2 = scn.nextDouble();

				System.out.println("Please enter your General Mathematics Grade:");
				double gr3 = scn.nextDouble();

				System.out.println("Please enter your Oral Communications Grade:");
                                double gr4 = scn.nextDouble();
				
                                System.out.println("Please enter your Student Organizations & Clubs Grade:");
				double gr5 = scn.nextDouble();

				System.out.println("Please enter your Intro to the Philosophy of Human Grade:");
				double gr6 = scn.nextDouble();

				System.out.println("Please enter your 21st Century Literature Grade:");
				double gr7 = scn.nextDouble();

				System.out.println("Please enter your Homeroom G11 Grade:");
				double gr8 = scn.nextDouble();

				System.out.println("Please enter your Media and Information Literacy Grade:");
				double gr9 = scn.nextDouble();

				double average = gr1 + gr2 + gr3 + gr4 + gr5 + gr6 + gr7 + gr8 + gr9;



				System.out.println("Your General Average is: " + average / 9);

				if (average / 9 >= 75) {
					System.out.println("Final Remarks: Congratulations! You Passed!");
				} else {
					System.out.println("Final Remarks: You Failed! Better Luck Next Time!");
				}
			}
		}while (van<=6);
		System.out.println("Program exit!");
	}
}
