package Java101.pratik;

import java.util.Scanner;

public class manav {
	public static void main(String[] args) {
		int armut, elma, domates, muz, patlican;
		float toplam;
		Scanner input = new Scanner(System.in);
		System.out.print("Armut kaç kilo : ");
		armut = input.nextInt();
		System.out.print("Elma kaç kilo : ");
		elma = input.nextInt();
		System.out.print("Domates kaç kilo : ");
		domates = input.nextInt();
		System.out.print("Muz kaç kilo : ");
		muz = input.nextInt();
		System.out.print("Patlican kaç kilo : ");
		patlican = input.nextInt();
		toplam = (armut * 2.14f) + (elma * 3.67f) + (domates * 1.11f) + (muz * 0.95f)
		+ (patlican * 5f);
		System.out.println("Toplam tutar:" + toplam + " Tl");
	}
}
