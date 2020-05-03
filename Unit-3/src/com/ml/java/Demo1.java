package com.ml.java;

public class Demo1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		t1.level=1;
		t2.level=2;
		System.out.println(t1.level+"-----"+t2.level);
		t1.level=t2.level;
		t1.level=3;
		System.out.println(t1.level+"-----"+t2.level);
		t1=t2;
		t1.level=3;
		System.out.println(t1.level+"-----"+t2.level);

		
		
		
		
		
	}
}
class Test1 {
	int level;
}
