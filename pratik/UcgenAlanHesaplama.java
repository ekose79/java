package Java101.pratik;

import java.util.Scanner;
public class UcgenAlanHesaplama {
	public static void main(String[] args) {

		int a, b, c, u, alan_k;
		Scanner input = new Scanner(System.in);
		System.out.print("1. Dik köşe uzunluğunu giriniz: ");
		a = input.nextInt();
		System.out.print("2. Dik köşe uzunluğunu giriniz: ");
		b = input.nextInt();
		System.out.print("Hipotenüs uzunluğunu giriniz: ");
		c = input.nextInt();
		u = (a + b + c) / 2;
		alan_k = u * (u - a) * (u - b) * (u - c);
		System.out.println("Alan : " + Math.pow(alan_k, 1/2));
	}
}
