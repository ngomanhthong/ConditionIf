package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// khai báo
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

	}
}
