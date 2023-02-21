package mayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	String[][] minefield;
	int row, col, mine;
	String[][] mineloc;
	boolean isWin = false;
	
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	
	public MineSweeper(int row, int col) {
		this.row = row;
		this.col = col;
		this.minefield = new String[row][col];
		this.mineloc = new String[row][col];
		this.mine = (row *col)/4;
	}
	
	public void run() {
		MineLoc();
		//print(mineloc);
		
		System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!");
		
		int rowNumber, colNumber,step = 0;
		while(!isWin) {
			System.out.print("Satır Giriniz : ");
			rowNumber = scan.nextInt();
			System.out.print("Sütun Giriniz : ");
			colNumber = scan.nextInt();
			if((rowNumber < 0 || rowNumber >= this.row) || (colNumber < 0 || colNumber >= this.col)) {
				System.out.println("Geçersiz koordinat girdiniz!");
				continue;
			}
			
			if(this.mineloc[rowNumber][colNumber] != "*") {
				checkMine(rowNumber,colNumber);
				step++;
				print(minefield);
				System.out.println("================");
				if(step == ((row*col) - this.mine)) {
					System.out.println("Tebrikler! Kazandınız!");
					print(mineloc);
					break;
				}
			}else {
				isWin = false;
				System.out.println("Kaybettiniz!");
				print(mineloc);
				break;
			}
		}
	}
	
	public void checkMine(int row, int col) {
		int value=0;
		if(this.mineloc[row][col] == "-") {
			if((row > 0) && (col > 0) && (this.mineloc[row-1][col-1] == "*")) {
				value++;
			}
			if((row > 0) && (this.mineloc[row-1][col] == "*")) {
				value++;
			}
			if((row > 0) && (col < this.col -1) && (this.mineloc[row-1][col+1] == "*")) {
				value++;
			}
			if((col > 0) && (this.mineloc[row][col-1] == "*")) {
				value++;
			}
			if((col < this.col -1) && (this.mineloc[row][col+1] == "*")) {
				value++;
			}
			if((row < this.row -1) && (col > 0) &&  (this.mineloc[row+1][col-1] == "*")) {
				value++;
			}
			if((row < this.row -1) && (this.mineloc[row+1][col] == "*")) {
				value++;
			}
			if((row < this.row -1) && (col < this.col -1) && (this.mineloc[row+1][col+1] == "*")) {
				value++;
			}
			this.minefield[row][col] = String.valueOf(value);
			this.mineloc[row][col] = String.valueOf(value);
			
		}
	}
	
	public void MineLoc() {
		int a,b,count=0;
		for(int i=0; i<this.minefield.length; i++) {
			for(int j=0; j<this.minefield[i].length; j++) {
				this.minefield[i][j] = "-";
				this.mineloc[i][j] = "-";
			}
		}
		
		while(count != mine) {
			a = rand.nextInt(0,this.row);
			b = rand.nextInt(0,this.col);
			if(this.mineloc[a][b] != "*") {
				this.mineloc[a][b] = "*";
				count++;
			}
		}
		
		
	}
	
	public void print(String[][] arr) {
		for(String[] a: arr) {
			for(String b: a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
}
