package com.ml.single.test;

import com.ml.single.Singleton1;

public class SingleTonTest2 {

	public static void main(String[] args) {

		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		System.out.println(s1 == s2);
	}

}
