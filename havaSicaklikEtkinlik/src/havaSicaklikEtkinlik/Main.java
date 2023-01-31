package havaSicaklikEtkinlik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sıcaklığı giriniz : ");
		double sicaklik = scan.nextDouble();
		
		if(sicaklik >=5 && sicaklik <= 25) {
			if(sicaklik >= 10) {
				System.out.println("Pikniğe gidebilirsiniz.");
			}
			if(sicaklik <= 15) {
				System.out.println("Sinemaya gidebilirsiniz.");
			}
		}else if(sicaklik > 25) {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}else {
			System.out.println("Kayak yapabilirsiniz.");
		}

	}

}
