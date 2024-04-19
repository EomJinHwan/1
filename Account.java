package l.java.exam08;

public class Account {
	
	String name;
	long balance;
	
	public Account() {
	}

	public Account(String name) {
		this.name = name;
	}
	
	public void deposit(long amount) { // 입금
		balance += amount;		
	}
	
	public void withdraw(long amount) { // 출금
		if (balance < amount) 
			System.out.println("잔액이 부족합니다");
		else
			balance -= amount;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

}
