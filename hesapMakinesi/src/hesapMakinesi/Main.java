package hesapMakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num1,num2,select;
		Scanner scan  = new Scanner(System.in);
		System.out.print("Birinci sayiyi giriniz : ");
		num1 = scan.nextInt();
		System.out.print("İkinci sayiyi giriniz : ");
		num2 = scan.nextInt();
		System.out.println("--------------------------");
		System.out.print("1 - Toplama \n2 - Çıkarma \n3 - Çarpma \n4 - Bölme\nSeçiminizi yapınız : ");
		select = scan.nextInt();
		
		switch(select) {
		case 1:
			System.out.print("Seçiminiz Toplama : " + num1 +  " + " + num2 + " = " + (num1+num2));
			break;
		case 2:
			System.out.print("Seçiminiz Çıkarma : " + num1 +  " - " + num2 + " = " + (num1-num2));
			break;
		case 3:
			System.out.print("Seçiminiz Çarpma : " + num1 +  " * " + num2 + " = " + (num1*num2));
			break;
		case 4:
			System.out.print("Seçiminiz Bölme : " + num1 +  " / " + num2 + " = " + (num1/num2));
			break;
		default :
			System.out.println("Yanlış seçim yaptınız.");
			break;
		
			
		}
		 	

	}

}
