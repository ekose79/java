package Java101.pratik;

import java.util.Scanner;
public class VucutKitle {
	public static void main(String[] args) {
		double kg, boy , indeks;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
		boy = input.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz :");
		kg = input.nextDouble();
		indeks = kg / (boy * boy);
		System.out.println("Vücut kitle indeksiniz :" + indeks);
	}
}
