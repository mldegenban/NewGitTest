package com.ml.single;

public class SingleTon2 {
	// 构造器私有化
	private SingleTon2() {

	}

	private static SingleTon2 instance;

	// 每次调用getInstance()方法都要同步，并fa效率较低。
	public static synchronized SingleTon2 getInstance() {
		if (instance != null) {
			instance = new SingleTon2();
		}
		return instance;
	}
}
