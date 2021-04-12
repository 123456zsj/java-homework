package week4;

import java.util.Scanner;

public class Adress {
	private String country;
	private String province;
	private String city;
	private String stree;
	private String code;

	public Adress() {
		this.country = null;
		this.province = null;
		this.city = null;
		this.stree = null;
		this.code = null;
	}

	public Adress(String a,String b,String c,String d,String e){
		this.country = a;
		this.province = b;
		this.city = c;
		this.stree = d;
		this.code = e;
	}


	public void getAdress(String a,String b,String c,String d){
		this.country = a;
		this.province = b;
		this.city = c;
		this.stree = d;
		this.code = e;
	}


	public void displayStudent(){
		String info = "";
		info = "国家："+this.country+"    省份："+this.province+
				"    城市："+this.city+"		街道"+this.stree+"	邮政编码"+this.code;
		System.out.println(info);
	}
}