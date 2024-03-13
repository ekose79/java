package Java101.pratik;

import java.util.Scanner;

public class TaksimetreTutari {
	public static void main(String[] args) {
		int km;
		float price, result;
		Scanner input = new Scanner(System.in);
		System.out.print("Katedilen mesafeyi giriniz: ");
		km = input.nextInt();
		price = 10 + (km * 2.20f);
		result = (price < 20) ? 20: price;
		System.out.println("Fiyat : " + result);
	}

}
