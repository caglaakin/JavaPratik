package sayiTahmin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();
		int number = random.nextInt(101);
		int right = 0,select = 0,start = 0;
		boolean isWrong = false;
		int[] wrong = new int[5];
		
		while(right < 5) {
			System.out.print("Lütfen tahmininizi giriniz : ");
			select = scan.nextInt();
			
			if(select < 0 || select > 100) {
				System.out.println("Lütfen 0-100 arasında bir değer giriniz!");
				if(!isWrong) {
					isWrong = true;
					System.out.println("Tekrar hatalı tahmin girişinizde hakkınızdan düşülecektir.\n---------------");
				}else {
					right++;
					System.out.println("Çok fazla hatalı giriş yaptınız! Kalan hakkınız : " + (5- right)+"\n---------------");
				}
				continue;
			}
			
			if(number == select) {
				System.out.println("Tebrikler! Doğru tahmin... Tahmin ettiğiniz sayı : " + select);
				break;
			}
			else {
				System.out.println("Yanlış tahmin!");
				right++;
				
				if(select > number) {
					System.out.println("Daha küçük bir sayı girmelisiniz!");
				}else {
					System.out.println("Daha büyük bir sayı girmelisiniz!");
				}
				System.out.println("Kalan hakkınız : " + (5-right)+"\n---------------");
				
				wrong[start++] = select;
				
			}
		}
		
		if(right == 5) {
			System.out.println("Tahmin hakkınız bitmiştir!\nTutulan sayı : " + number);
			System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
		}
		
		

	}

}
