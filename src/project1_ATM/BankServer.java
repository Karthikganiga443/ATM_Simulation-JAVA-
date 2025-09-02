package project1_ATM;
import java.util.Random;
public class BankServer {
	private int SecretKey=1234;
	
	public int getSecretKey() {
		return this.SecretKey;
	}
	public boolean validatekeyLength(int key) {
		boolean isvalid=false;
		int counter=0;
		while(key>0) {
			key=key/10;
			counter++;
		}
		if(counter==4) {
			isvalid=true;
		}
		return isvalid;
	}
	public int otpLogin() {
		 Random random = new Random();
	     return random.nextInt(900000)+100000;
	}
	public static void main(String[] args) {
		BankServer s=new BankServer();
		System.out.println(s.otpLogin());
	}
}
