package bank_account_application;

public class Bank_Account_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main function to call bank account app
		bank_account acc1=new bank_account("44567348", 1000);
		acc1.setName("Sumit");
		acc1.MakeDeposit(1000);
		acc1.MakeDeposit(1000);
		acc1.MakeDeposit(1400);
		acc1.PayBill(500);
		acc1.acc_rate();
		acc1.Details();

	}

}
