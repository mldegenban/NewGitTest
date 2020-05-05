package com.ml.single;

/**
 * 
 * @author Administrator 如果永远不调用getInstance方法，会造成资源浪费哦
 */
public class Singleton1 {
	// 初始化的时候直接加载这个对象，天然线程安全
	private static Singleton1 Singleton1 = new Singleton1();

	// 构造方法私有化，
	private Singleton1() {
	}

	// 方法没有同步，调用效率高！
	public static Singleton1 getInstance() {
		return Singleton1;
	}
}
