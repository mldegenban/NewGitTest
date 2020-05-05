package com.ml.single;

public class SingleTon2 {
	// ������˽�л�
	private SingleTon2() {

	}

	private static SingleTon2 instance;

	// ÿ�ε���getInstance()������Ҫͬ������faЧ�ʽϵ͡�
	public static synchronized SingleTon2 getInstance() {
		if (instance != null) {
			instance = new SingleTon2();
		}
		return instance;
	}
}
