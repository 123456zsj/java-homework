package week2;

import java.util.Scanner;

public class thirdquestion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int j, i,k,n;
		System.out.println("请输入边长");
		n = scan.nextInt();
		for (i = 0; i < n; i++) {
			for(j=0;j<n-i;j++) {
				System.out.print(" ");

			}
			for(k=0;k<i;k++) System.out.print("* ");
			System.out.println(" ");

		}

	}

}
