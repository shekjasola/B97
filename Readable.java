package com.cts.oops2;

public interface Readable {
	
	default void Hello() {
		System.out.println("hello");
	}
	
	final static double pi=3.14;
	
	public abstract void getName();
	

}


interface Readable2 {
	public abstract void getName2();
}


interface Readable3 extends Readable,Readable2{
	
}


class Test {
	
	public void display() {
	System.out.println("hello");	
	}
}