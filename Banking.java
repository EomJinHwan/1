package l.java.exam08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banking {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 : ");

		Account na = new Account(br.readLine());
				
		NewAccount ac = new NewAccount(br.readLine(), "1234");
		String strWork = null;
		System.in.read(); System.in.read();
		System.out.print("비밀번호 : ");
		strWork = br.readLine();
		if (!ac.passCheck(strWork)) {
			System.out.println("비밀번호가 틀립니다");
			System.exit(0);
			// return; 써도 가능
		}

		do {
			System.err.println("\n \n 작업 내용을 선택하세요");
			System.out.println("=========================");
			System.out.println("입         금 =======>        1");
			System.out.println("출         금 =======>        2");
			System.out.println("잔 고 확 인 =======>         3");
			System.out.println("비밀번호변경 =======>         4");
			System.out.println("종         료 =======>        0");
			System.out.println("=========================");
			System.out.print("작업내용을 선택하세요 : ");
			strWork = br.readLine();
			int switchInt = 0;

			if (strWork.length() != 0)
				switchInt = Integer.parseInt(strWork);
			else {
				System.out.println("작업내용을 입력하지 않았습니다");
				System.exit(0);
			}

			switch (switchInt) {
			case 0:
				break;
			case 1:
				System.out.println("\n =================");
				System.out.print("금액을 입력하세요 : ");
				String strdepositIn = br.readLine();
				long depositLong = Long.parseLong(strdepositIn);
				na.deposit(depositLong);
				break;
			case 2:
				System.out.println("\n =================");
				System.out.print("금액을 입력하세요 : ");
				String strwithdrawIn = br.readLine();
				long withdrawLong = Long.parseLong(strwithdrawIn);
				na.withdraw(withdrawLong);
				break;
			case 3:
				System.out.println(na.getName() + "님의 잔고는 " + na.getBalance() + " 원이고 비밀번호는 " + ac.getPass()+ " 입니다");
				break;
			case 4:
				System.out.print("변경할 비밀번호 : ");
				String imsipass = br.readLine();
				ac.setPass(imsipass);
				System.out.println("비밀번호가 변경되었습니다");
			default:
				System.out.println("0~3 사이 숫자 입력\n");
			}

		} while (!strWork.equals("0"));
	}

}
