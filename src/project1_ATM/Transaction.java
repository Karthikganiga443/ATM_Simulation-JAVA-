package project1_ATM;

public class Transaction {
	private static final int minBal=500;
	private static int currentBal=minBal;
	public static int getBal() {
		return currentBal;
	}
	public static String deposit(int depositAmount) {
		if(depositAmount<=0) {
			return "Can't perform deposit action";
		}
		currentBal=getBal()+depositAmount;
		return "Amount Rs."+depositAmount+" is credited to your saving account";
	}
	public static String withdraw(int withdrawAmount) {
		if(withdrawAmount<=0) {
			return "cant perform withdraw action";
		}
		if(withdrawAmount<=(getBal()-minBal)) {
			currentBal=getBal()-minBal;
			return "Amount Rs."+withdrawAmount+" is debited from your saving account";
		}
		return "Insufficient balance";
	}
}
