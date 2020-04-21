package bank_account_application;

public class bank_account implements Irate
{
	private String account_no;
	private String name;
	private String ssn;
	private static int id=1000;
	double balance;
	
	//Constructor
	public bank_account(String ssn, double init_deposit)
	{
		System.out.println("New Account Created");
		id++;
		balance=init_deposit;
		this.ssn=ssn;
		setAccountno();
		ShowBalance();
	}
	
	//Setting account number
	private void setAccountno()
	{
		int random= (int)Math.random()*100;
		account_no = id+""+random+""+ssn.substring(2, 4);
		System.out.println("Your Account Number is : "+account_no);
	}
	
	//Getter and setter for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Methods
	public void ShowBalance()
	{
		System.out.println("Your current balance is : "+balance);
	}
	public void PayBill(double amount)
	{
		balance = balance-amount;
		System.out.println("Amount Deducted : "+amount);
		ShowBalance();
	}
	public void MakeDeposit(double amount)
	{
		balance=balance+amount;
		System.out.println("Amount Deposited : "+amount);
		ShowBalance();
	}
	@Override
	public void acc_rate() {
		// TODO Auto-generated method stub
		balance=balance*(1+rate/100);
		ShowBalance();
	}
	
	public void Details()
	{
		System.out.println("[Name : "+name+"]\n"+"[Account Number : "+account_no+"]\n"+"[Balance : "+balance+"]");
	}
}
