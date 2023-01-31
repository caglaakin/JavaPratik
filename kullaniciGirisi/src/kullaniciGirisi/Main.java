package kullaniciGirisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName,password,reselect,newpass;
		String syspass = "java1234"; 
		String sysname = "patika";
		while(true) {
			System.out.print("Kullanici adinizi giriniz : ");
			userName = scan.next();
			System.out.print("Şifrenizi giriniz : ");
			password = scan.next();
		
			if(userName.equals(sysname) && password.equals(syspass)) {
				System.out.print("Başarıyla giriş yaptınız");
				break;
			}else if(!(userName.equals(sysname)) && password.equals(syspass)) {
				System.out.print("Kullanici adini hatali girdiniz. Yeniden deneyin.\n");
			}
		
			else if(userName.equals(sysname) && !(password.equals(syspass))) {
				System.out.print("Şifrenizi yanlış girdiniz. Şifrenizi sıfırlamak ister misiniz? E/H : ");
				reselect = scan.next();
				if(reselect.equals("E") || reselect.equals("e")) {
					while(true) {
						System.out.print("Yeni şifrenizi giriniz : ");
						newpass = scan.next();
						if(newpass.equals("java123")) {
							System.out.print("Şifre oluşturulamadı, başka şifre giriniz.\n");
						}else {
							System.out.print("Şifre oluşturuldu.\n");
							syspass = newpass;
							break;
						}
					}
				}else if(reselect.equals("H") || reselect.equals("h")) {
					System.out.println("Giriş yapılamadı.");
					break;
				}
			}
			else {
				System.out.print("Giriş başarısız oldu");
				break;
			}
		
			
		}scan.close();
	}
}