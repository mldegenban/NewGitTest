package com.ml.single;

/**
 * 
 * @author Administrator �����Զ������getInstance�������������Դ�˷�Ŷ
 */
public class Singleton1 {
	// ��ʼ����ʱ��ֱ�Ӽ������������Ȼ�̰߳�ȫ
	private static Singleton1 Singleton1 = new Singleton1();

	// ���췽��˽�л���
	private Singleton1() {
	}

	// ����û��ͬ��������Ч�ʸߣ�
	public static Singleton1 getInstance() {
		return Singleton1;
	}
}
