package daireAlanCevreDilimAlani;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double pisayisi = 3.14;
		int yaricap,aci;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Yarıçapı giriniz : ");
		yaricap = input.nextInt();
		System.out.print("Merkez açının ölçüsünü giriniz : ");
		aci = input.nextInt();
		
		double alan = pisayisi*yaricap*yaricap;
		double cevre = 2*pisayisi*yaricap;
		double dilimalani = (pisayisi*(yaricap*yaricap)*aci)/360;
		
		System.out.println("Yarıçapı "+ yaricap + " olan dairenin; \n\nÇevresi : " + cevre + "\nAlanı : " + alan);
		System.out.println("Merkez açısının ölçüsü " + aci + " olan daire diliminin alanı : " + dilimalani);
		
	}

}
