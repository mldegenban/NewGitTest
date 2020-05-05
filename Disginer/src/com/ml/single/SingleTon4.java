package com.ml.single;

import java.io.Serializable;

/**
 * ��̬�ڲ���
 * 
 * �C �ⲿ��û��static���ԣ��򲻻������ʽ�����������ض��� �C ֻ����������getInstance(),�Ż���ؾ�̬�ڲ��ࡣ������ʱ���߳� ��ȫ�ġ�
 * instance��static final���ͣ���֤���ڴ���ֻ������һ��ʵ�����ڣ�����ֻ�ܱ���ֵһ�Σ��Ӷ���֤���̰߳�ȫ��. �C
 * �汸�˲�����Ч���ú��ӳټ��ص����ƣ�
 * 
 * @author Administrator
 *
 */
public class SingleTon4 implements Serializable {
	// ��̬�ڲ��࣬�ṩʵ�����
	private static class SingletonClassInstance {
		private static final SingleTon4 instance = new SingleTon4();
	}

	// �ṩ����Ļ�ȡ����
	public static SingleTon4 getInstance() {

		// ����instance ������ʱ�򣬼��ؼ��ؾ�̬�ڲ���
		return SingletonClassInstance.instance;
	}

	// ���췽��˽�л�
	private SingleTon4() {
	}

}
