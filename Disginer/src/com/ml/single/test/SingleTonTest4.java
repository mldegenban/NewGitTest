package com.ml.single.test;

import com.ml.single.SingleTon4;

public class SingleTonTest4 {

	public static void main(String[] args) {

		SingleTon4 s1 = SingleTon4.getInstance();
		SingleTon4 s2 = SingleTon4.getInstance();
		System.out.println(s1 == s2);
	}

}
