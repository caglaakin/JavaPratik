package kdvTutariHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		double fiyat;
		double kdv;
		
		System.out.print("Ürün fiyatını giriniz : ");
		fiyat = inp.nextDouble();
		if(fiyat>0 && fiyat<=1000) { kdv = 0.18; }
		else { kdv = 0.08; }
		
		double kdvtutari= fiyat*kdv;
		double kdvlitutar = (fiyat*kdv)+fiyat;
		
		
		System.out.println("Ürün Fiyatı : " + fiyat + "\nKDV:" + kdv +"\nKDV'li Tutar: " + kdvlitutar + "\nKDV Tutarı : " + kdvtutari);
		
	}

}
