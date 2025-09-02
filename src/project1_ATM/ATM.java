package project1_ATM;

import java.util.Scanner;

public class ATM {
	static char response;
	public static void Success(Scanner sc) {
		do {
			System.out.println("Select Options");
			System.out.println("1. Deposit  2. Withdraw  3. BalEnquiry");
			int option=sc.nextInt();
			switch(option){
				case 1: System.out.println("Enter the amount to be deposited: ");
						int depositedAmount=sc.nextInt();
						System.out.println(Transaction.deposit(depositedAmount));
						break;
				case 2: System.out.println("Enter the amount to be Withdraw: ");
						int WithDraw=sc.nextInt();
						System.out.println(Transaction.withdraw(WithDraw));
						break;
				case 3: System.out.println(Transaction.getBal());
						break;
				default:System.out.println("Invalid Options");
			}
			System.out.println("If you want to continue: (y/n)");
			response=sc.next().charAt(0);
			}while(response=='y');
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BankServer server=new BankServer();
		int attempts=0;
		int maxAttempts=3;
		System.out.println("Welcome to Canara Bank!!!");
		System.out.println("Connecting to the Server. Please Wait!!!");
		Thread.sleep(3000);
		while(true) {
			System.out.println("Enter your Secret key");
			int secretKey=sc.nextInt();
			if(server.validatekeyLength(secretKey)&&server.getSecretKey()==secretKey) {
				Success(sc);
				break;
				}
			else {
				attempts++;
				System.out.println("Wrong Secretkey. "+(maxAttempts-attempts)+" attempts left");
				if(attempts==maxAttempts) {
					System.out.println("Do u want to try with otp: (y/n)");
					char otpLogin=sc.next().charAt(0);
				    if(otpLogin=='y') {
				    	int generatedOtp=server.otpLogin();
				    	System.out.println(generatedOtp);
				    	System.out.println("Enter the otp: ");
				    	int otp=sc.nextInt();
				    	
				
				    	if(otp==generatedOtp) {
				    		Success(sc);
				    		break;
				    	}
				    }
					System.out.println("Max attempts reached. card blocked. connect to your nearest branch");
					break;
				}
				
				
			}
		}
		System.out.println("Thank you for using our Service");
	}

}
