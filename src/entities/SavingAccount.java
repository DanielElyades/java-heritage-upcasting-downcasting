package entities;

public class SavingAccount extends Account {
	
	private Double interstRate;
	
	public SavingAccount() {
		super();
	}
	
	public SavingAccount(Integer number, String holder, Double balance, double interstRate) {
		super(number, holder, balance);
		this.interstRate = interstRate;
	}
	
	public double getInterstRate() {
		return interstRate;
	}
	
	public void setInterstRate(double interstRate) {
		this.interstRate = interstRate;
	}
	
	public void updateBalance() {
		balance += balance * interstRate;
	}

}
