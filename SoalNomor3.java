package Tugas1SDA;

import java.util.ArrayList;

public class SoalNomor3 {
	public static void main(String[] args) {
		ArrayList<String> nama = new ArrayList<String>();
		nama.add("A");
		nama.add("L");
		nama.add("D");
		nama.add("O");
		
		// Soal 3 
		// get(0),get(2),get(6),get(-3)
		
		System.out.println(nama.get(0));
		System.out.println(nama.get(2));
		System.out.println(nama.get(6));
		System.out.println(nama.get(-3));
	}
}
