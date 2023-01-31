package ucakBileti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double mesafe,indirim = 0,tutar,mtutar;
		int yas,yolculuktipi;
		
		System.out.print("Mesafeyi kilometre türünden giriniz : ");
		mesafe = input.nextDouble();
		System.out.print("Yaşınızı giriniz :");
		yas = input.nextInt();
		System.out.print("Yolculuk tipini girininiz (1 -> Tek Yön / 2 -> Gidiş-Dönüş) : ");
		yolculuktipi = input.nextInt();
		
		
		if(mesafe >= 0 && yas >= 0 && ((yolculuktipi==1) || yolculuktipi == 2)) {
			
			if(yas<12) {
				indirim = 0.5;
			}
			else if(yas>=12 && yas<=24){
				indirim = 0.1;
			}
			else if(yas >= 65) {
				indirim = 0.3;
			}
			mtutar = (mesafe*0.1);
			tutar = mtutar-(mtutar*indirim);
			
			if(yolculuktipi == 2) {
				tutar -= (tutar*0.2);
			}
			
			
			
			System.out.println("Toplam Tutar : " + tutar);
			
		}else {
			System.out.println("Hatalı veri girdiniz!");
		}
		
		
		
		
	}

}
