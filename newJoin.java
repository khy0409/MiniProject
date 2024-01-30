package JavaJoin;

import java.util.ArrayList;
import java.util.Scanner;

public class newJoin {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		ArrayList<String> Id = new ArrayList<>();
		ArrayList<String> Pw = new ArrayList<>();
		boolean check = false;
		while(true) {
		System.out.println("1.로그인 2.회원가입 3.로그아웃 4.회원목록 5.종료");
		int List = Sc.nextInt();
		if (List==1) {
			if(check==true) {
				System.out.println("로그아웃 후 다시 시도해주세요");
			}
			else{
			System.out.println("로그인을 실시합니다");
			System.out.println("ID를 입력하세요");
			String id=Sc.next();
			System.out.println("PW를 입력하세요");
			String pw=Sc.next();
			for(int i=0; i<Id.size(); i++) {
				if (id.equals(Id.get(i))) {
					for(int ii=0; ii<Pw.size(); ii++) {
						if(pw.equals(Pw.get(ii))) {
							System.out.println("로그인 성공");
							check = true;
							break;
						}
						}
					
				}
			}
				if(check==false) {
				System.out.println("로그인 실패");
				}
			}

		}
		
		if(List==2) {
			if(check==true) {
				System.out.println("로그아웃 후 다시 시도해주세요");
			}
			if(check==false){
			System.out.println("회원가입을 실시합니다");
			System.out.println("ID를 입력하세요");
			String newId=Sc.next();
			for(int i=0; i<Id.size(); i++) {
				if (newId.equals(Id.get(i))) {
					System.out.println("아이디가 같습니다 다시 입력하세요");
					newId=Sc.next(); 
				}
				}
			Id.add(newId);
			System.out.println("PW를 입력하세요");
			String newPw=Sc.next();
			Pw.add(newPw);
			int newPw_len = newPw.length(); 
			String[] Pw2= new String[newPw_len]; 
			if(newPw_len<4) { 
				 Pw.remove(newPw); 
				 System.out.println("4자리 이상으로 입력해주세요");
				 newPw=Sc.next(); 
				 Pw.add(newPw); 
			} for (int i=0; i<Pw2.length; i++) {
				Pw2[i]=newPw.substring(i, i+1); 
				if(Pw2[i].matches("[0-9]")) {
					Pw.remove(newPw);
					System.out.println("알파벳을 포함해주세요");
					newPw=Sc.next();
					Pw.add(newPw);
					break;
				}
			}
			System.out.printf("가입 Id : %s\n가입 PW : %s\n", newId, newPw);
		}
		}
		if(List==3) {
			if(check==false) {
				System.out.println("로그인 후 다시 시도해주세요");
			}
			else{
			System.out.println("로그아웃 하시겠습니까? (y/n)");
			String logout=Sc.next();
			if(logout.equals("y")) {
				System.out.println("로그아웃합니다");
				check=false;
			}
			else if(logout.equals("n")) {
				System.out.println("로그아웃 취소");
			}
		}
		}
		if(List==4) {
			if(check==false) {
				System.out.println("로그인 후 다시 시도해주세요");
			}
			else {
			System.out.println("회원목록을 보여드리겠습니다.");
			System.out.printf("ID 목록(%d) : ", Id.size());
			for (int i=0; i<Id.size(); i++);
			System.out.printf("%s \n", Id);
			}
		}
		if(List==5) {
		    System.out.println("종료 하시겠습니까? (y/n)");
		    String end=Sc.next();
		    if(end.equals("y")) {
		    	System.out.println("종료하겠습니다.");
		    	Sc.close();
		    	break;
		    	}
		    else if(end.equals("n")){
		    	System.out.println("종료 취소");
		    	}
		}
	
	}
}
	}
