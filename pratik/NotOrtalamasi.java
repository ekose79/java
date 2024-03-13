package Java101.pratik;

import java.util.Scanner;
public class NotOrtalamasi {
	public static void main(String[] args) {
		int turkish, mat, physics, chemistry, history, music, average;
		Scanner input = new Scanner(System.in);
		System.out.println("Türkçe notunu giriniz:");
		turkish = input.nextInt();
		System.out.println("Mat notunu giriniz:");
		mat = input.nextInt();
		System.out.println("Fizik notunu giriniz:");
		physics = input.nextInt();
		System.out.println("Kimya notunu giriniz:");
		chemistry = input.nextInt();
		System.out.println("Tarih notunu giriniz:");
		history = input.nextInt();
		System.out.println("Müzik notunu giriniz");
		music = input.nextInt();
		average = (mat + turkish+ physics + chemistry + history + music) / 6;
		String result = (average < 60) ? ("KALDI..."):("GECTI...");
		System.out.println(result);
	}
}
