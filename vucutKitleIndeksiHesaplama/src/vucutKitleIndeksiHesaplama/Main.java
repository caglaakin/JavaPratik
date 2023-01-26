package vucutKitleIndeksiHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double boy,kilo,indeks;
		
		Scanner veri = new Scanner(System.in);
		System.out.print("Boyunuzu metre cinsinden giriniz : ");
		boy = veri.nextDouble();
		System.out.print("Kilonuzu giriniz : ");
		kilo = veri.nextDouble();
		
		indeks = kilo/(boy*boy);
		System.out.print("Vücut Kitle İndeksiniz : " + indeks);

	}

}
