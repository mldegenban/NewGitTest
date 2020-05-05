package com.ml.single;

import java.io.Serializable;

/**
 * 静态内部类
 * 
 * – 外部类没有static属性，则不会像饿汉式那样立即加载对象。 – 只有真正调用getInstance(),才会加载静态内部类。加载类时是线程 安全的。
 * instance是static final类型，保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而保证了线程安全性. –
 * 兼备了并发高效调用和延迟加载的优势！
 * 
 * @author Administrator
 *
 */
public class SingleTon4 implements Serializable {
	// 静态内部类，提供实体对象
	private static class SingletonClassInstance {
		private static final SingleTon4 instance = new SingleTon4();
	}

	// 提供对外的获取方法
	public static SingleTon4 getInstance() {

		// 调用instance 方法的时候，加载加载静态内部类
		return SingletonClassInstance.instance;
	}

	// 构造方法私有化
	private SingleTon4() {
	}

}
