import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		AtmOperationInterf op=new AtmOperationImpl();
		// TODO Auto-generated method stub
		int atmnumber=12345;
		int atmpin=123;
		Scanner in=new Scanner(System.in);
		System.out.println("Welcome to ATM Machine...!");
		System.out.print("Enter ATM Number : ");
		int atmNumber=in.nextInt();
		System.out.print("Enter Pin : ");
		int pin=in.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==pin)) {
			while(true) {
				System.out.println("1.Transaction History\n2.withdraw Amount\n3.Deposit Amount\n4.Transfer\n5.Exit.");
				System.out.println("Enter Choice : ");
				int ch=in.nextInt();
				if(ch==1) {
					op.TransactionHistory();			
				}
				else if(ch==2) {
					System.out.println("Enter the Withdraw Amount : ");
					double withdrawAmount=in.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}
				else if(ch==3) {
					System.out.println("Enter Amount to Deposit : ");
					double depositAmount=in.nextDouble();//5000
					op.depositAmount(depositAmount);
				}
				else if(ch==4) {
					op.transfer();
				}
				else if(ch==5) {
					System.out.println("Collect your ATM Card\n Thankyou for using ATM Machine...!");
				}
				else {
					System.out.println("Pleas enter correct chose...!");
					System.exit( 0);
				}
			}
		}
		else {
			System.out.println("Incorrect ATM-Number or PIN");
		}
	}

}
