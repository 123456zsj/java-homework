package week10.vo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {

	public static void main(String[] args) {
		//������ʽ
		while(true){
//		String regxMobile = "1[3578]\\d{9}";
//		String regxMobile = "(0\\d{2,3}-?)?[1-9]\\d{6,7}";
//		String regxMobile = "\\w+@\\w+(.\\w+)+";
		String regxMobile = "[1-9]+[.\\d+]+[\\+|-|\\*|/][1-9]+[.\\d+]+";
		Scanner scan = new Scanner(System.in);
		String phone = scan.nextLine();
//		if(Pattern.compile(regxMobile).matches(phone).matches()){
//			System.out.println("����Ϸ�");
//		}else{
//			System.out.println("���Ϸ�");
//		}
		Pattern p = Pattern.compile(regxMobile);
		Matcher m = p.matcher(phone);
		if(m.matches()){
			System.out.println("����Ϸ�");
			break;
		}else{
			System.out.println("���Ϸ�");
			System.out.println("����������");
		}
	}
	}
}