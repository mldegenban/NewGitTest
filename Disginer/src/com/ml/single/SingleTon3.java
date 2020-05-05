package com.ml.single;

public class SingleTon3 {
	// 延迟加载
	private static SingleTon3 instance;

	// 私有化构造方法
	private SingleTon3() {
	}

	public static SingleTon3 getInstance() {
		if (instance == null) {
			SingleTon3 s3;
			synchronized (SingleTon3.class) {
				s3 = instance;
				if (s3 == null) {
					synchronized (SingleTon3.class) {
						if (s3 == null) {
							s3 = new SingleTon3();
						}
					}
					instance = s3;
				}

			}

		}

		return instance;
	}

}
