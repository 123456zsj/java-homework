package week10.vo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {

	public static void main(String[] args) {
		//正则表达式
		while(true){
//		String regxMobile = "1[3578]\\d{9}";
//		String regxMobile = "(0\\d{2,3}-?)?[1-9]\\d{6,7}";
//		String regxMobile = "\\w+@\\w+(.\\w+)+";
		String regxMobile = "[1-9]+[.\\d+]+[\\+|-|\\*|/][1-9]+[.\\d+]+";
		Scanner scan = new Scanner(System.in);
		String phone = scan.nextLine();
//		if(Pattern.compile(regxMobile).matches(phone).matches()){
//			System.out.println("输入合法");
//		}else{
//			System.out.println("不合法");
//		}
		Pattern p = Pattern.compile(regxMobile);
		Matcher m = p.matcher(phone);
		if(m.matches()){
			System.out.println("输入合法");
			break;
		}else{
			System.out.println("不合法");
			System.out.println("请重新输入");
		}
	}
	}
}