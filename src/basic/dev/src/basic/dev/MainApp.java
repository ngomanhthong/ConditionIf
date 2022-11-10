package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 9.1.Viết chương trình nhập vào một sốnguyên. Kiểm tra sốđónguyên
		// dươnghay nguyên âm. In ra màn hình kết quả
		System.out.println("nhap vao n");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("so am");
		} else if (n == 0) {
			System.out.println("so ko am ko duong");
		} else {
			System.out.println("so duong");
		}

		// 9.2.Viết chương trình nhập vào một sốnguyên n. Kiểm tra n chia hết
		// cho 3hay 5. In kết quảra màn hình
		if (n % 3 == 0) {
			System.out.println("chia het cho 3");
		} else if (n % 5 == 0) {
			System.out.println("chia het cho 5");
		} else {
			System.out.println("ko chia het cho 3 va 5");
		}
		// 9.3.Viết chương trình nhập vào tháng trong năm.In ra sốngày của
		// tháng đó
		System.out.println("nhap vao thang");
		int s = sc.nextInt();
		if (s == 1 || s == 3 || s == 5 || s == 7 || s == 8 || s == 10 || s == 12) {
			System.out.println("co 31 ngay");
		} else if (s == 2 || s == 4 || s == 6 || s == 9 || s == 11) {
			System.out.println("co 30 ngay");
		} else {
			System.out.println("nhap so lieu ko dung");
		}

		// 9.4.Viết chương trình giải phương trình bậc 2
		double x1, x2, delta, a, b, c;
		System.out.println("nhap vao a");
		a = sc.nextDouble();
		System.out.println("nhap vao b");
		b = sc.nextDouble();
		System.out.println("nhap vao c");
		c = sc.nextDouble();
		// tính delta
		delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0) {
			System.out.println("pt vo nghiem");
		} else if (delta == 0) {
			x1 = x2 = -b / (2 * a);
			System.out.println("pt co nghiem kep" + x1);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("pt co 2 nghiem: x1= " + x1 + " && x2= " + x2);
		}

		// 9.5.Viết chương trình nhập vào 3 sốa, b, c. Kiểm tra cóphải là3
		// cạnh của một tam giác không?
		if (a + b > c && a + c > b && c + b > a) {
			System.out.println("la 3 canh cua mot tam giac");
		} else {
			System.out.println("ko phai 3 canh cua mot tam giac");
		}
	}
}
