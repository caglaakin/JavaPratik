package manavKasaProgrami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double armut,elma,domates,muz,patlican,total;
		
		double afiyat= 2.14;
		double efiyat= 3.67;
		double dfiyat= 1.11;
		double mfiyat= 0.95;
		double pfiyat= 5.00;
		
		Scanner veri = new Scanner(System.in);
		System.out.print("Armut kaç kilo? :");
		armut = veri.nextDouble();
		System.out.print("Elma kaç kilo? :");
		elma = veri.nextDouble();
		System.out.print("Domates kaç kilo? :");
		domates = veri.nextDouble();
		System.out.print("Muz kaç kilo? :");
		muz = veri.nextDouble();
		System.out.print("Patlıcan kaç kilo? :");
		patlican = veri.nextDouble();
		
		total = (armut*afiyat)+(elma*efiyat)+(domates*dfiyat)+(muz*mfiyat)+(patlican*pfiyat);
		System.out.print("Toplam Tutar : " + total);
		

	}

}
