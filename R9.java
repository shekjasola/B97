package com.cts.oops2;

class R1 extends Test implements Readable,Readable2 {

	public void getName() {
		System.out.println("Venkat R");

	}

	public void getName2() {
		System.out.println("Laxmipriya");
		
	}

}

class R2 implements Readable3 {

	public void getName() {
		System.out.println("Mounika");

	}

	public void getName2() {
		System.out.println("Ravi");
		
	}

}

public class R9 {

	public static void main(String[] args) {
		Readable r = new R1();
		Readable2 rd= new R1();
		rd.getName2();
		r.Hello();

		System.out.println(Readable.pi);

		r.getName();

		Readable rr = new R2();
		rr.getName();

		
		Readable3 rr3= new R2();
		
		rr3.getName2();
	}

}
