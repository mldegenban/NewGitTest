package com.ml.single.test;

import com.ml.single.SingleTon2;

public class SingleTonTest3 {

	public static void main(String[] args) {

		SingleTon2 s1 = SingleTon2.getInstance();
		SingleTon2 s2 = SingleTon2.getInstance();
		System.out.println(s1 == s2);
	}

}
