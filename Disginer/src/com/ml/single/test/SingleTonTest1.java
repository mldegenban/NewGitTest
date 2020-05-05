package com.ml.single.test;

import com.ml.single.SingleTon3;

public class SingleTonTest1 {

	public static void main(String[] args) {

		SingleTon3 s1 = SingleTon3.getInstance();
		SingleTon3 s2 = SingleTon3.getInstance();
		System.out.println(s1 == s2);
	}

}
