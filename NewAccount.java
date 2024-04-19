package l.java.exam08;

public class NewAccount extends Account {
	// 멤버
	private String pass;
	
	// 생성자
	public NewAccount() {
	}

	public NewAccount(String name, String pass) {
		super(name);		// Account 에 있는 this.name = name; 가져다 씀
		this.pass = pass;
	}
	
	// 메소드
	
	public boolean passCheck(String pass) { //입력받은 pass
		if (pass.equals(this.pass)) {	// 입력받은 pass 가 원래 pass 랑 같은가
			return true;
		} else {
			return false;
		}
	}
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
