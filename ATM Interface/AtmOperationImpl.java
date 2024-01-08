import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf{
	ATM atm=new ATM();
	Map<Double,String> ministmt=new HashMap<>();

	@Override
	public void TransactionHistory() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance is : "+ atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(withdrawAmount%500==0) {
		if(withdrawAmount<=atm.getBalance()) {
			ministmt.put(withdrawAmount,"Amount Withdrawn");
			System.out.println(withdrawAmount + "Collect the Cash...!");
			atm.setBalance(atm.getBalance()-withdrawAmount);
			TransactionHistory();
		}
		else {
			System.out.println("Insufficient Balance...!");
		}
		}
		else {
			System.out.println("Pleas enter the amount in multiple of 500/-");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		ministmt.put(depositAmount,"Amount Depoisted");
		System.out.println(depositAmount  + "Deposited Successfully...!");
		atm.setBalance(atm.getBalance()+depositAmount);
		TransactionHistory();
	}

	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double,String>m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
