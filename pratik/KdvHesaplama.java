package Java101.pratik;

import java.util.Scanner;
public class KdvHesaplama {
	public static void main(String[] args) {

		float price, kdv_price, kdv_amount;
		Scanner input = new Scanner(System.in);
		System.out.print("Fiyat giriniz: ");
		price = input.nextInt();
		if (price > 1000)
		{
			kdv_amount = (price * 18) / 100;
			kdv_price = price + kdv_amount;
		}
		else
		{
			kdv_amount = (price * 8) / 100;
			kdv_price = price + kdv_amount;
		}
		System.out.println("KDV'siz Fiyat = " + price);
		System.out.println("KDV'li Fiyat = " + kdv_price);
		System.out.println("KDV tutari = " + kdv_amount);
	}

}
