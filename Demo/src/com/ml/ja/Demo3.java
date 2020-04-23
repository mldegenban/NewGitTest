package com.ml.ja;

public class Demo3 {
	public static void main(String[] args){
		double d	=12.3;
		Decermenter dec  =new Decermenter();
		dec.decrementer(d);
		System.out.println(d);
	}
}
class Decermenter{
	public void decrementer(double decMe){
		decMe = decMe-1.0;
	}
}