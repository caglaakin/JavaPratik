package hipotenusHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int kenar1,kenar2,kenar3;
		System.out.println("---Hipotenüs Hesaplama---");
		Scanner girdi = new Scanner(System.in);
		System.out.print("1. Kenarı Giriniz : ");
		kenar1 = girdi.nextInt();
		System.out.print("2. Kenarı Giriniz : ");
		kenar2 = girdi.nextInt();		
		
		kenar3 = (int) Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
		System.out.println("Hipotenüs : " + kenar3);
		
		
		System.out.println("---Çevre ve Alan Hesaplama---");
		int k1,k2,k3;
		double u,cevre,alan;
		System.out.print("1. kenarı giriniz : ");
		k1 = girdi.nextInt();
		System.out.print("2. kenarı giriniz : ");
		k2 = girdi.nextInt();
		System.out.print("3. kenarı giriniz : ");
		k3 = girdi.nextInt();
		
		u = (k1+k2+k3)/2;
		cevre = 2*u;
		alan = Math.sqrt(u*(u-k1)*(u-k2)*(u-k3));
		
		System.out.println("Girilen kenarların çevresi : " + cevre + "\nGirilen kenarların alanı : " + alan);
		
		
		
		

	}

}
