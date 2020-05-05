package com.ml.single.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ml.single.SingleTon4;

public class SingleTonTest5 {

	public static void main(String[] args) throws Exception {

		SingleTon4 s1 = SingleTon4.getInstance();
		SingleTon4 s2 = SingleTon4.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);

		// 通过反射的方式直接调用私有构造器
		// Class<SingletonDemo6> clazz = (Class<SingletonDemo6>)
		// Class.forName("com.bjsxt.singleton.SingletonDemo6");
		// Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null);
		// c.setAccessible(true);
		// SingletonDemo6 s3 = c.newInstance();
		// SingletonDemo6 s4 = c.newInstance();
		// System.out.println(s3);
		// System.out.println(s4);

		// 通过反序列化的方式构造多个对象
		FileOutputStream fos = new FileOutputStream("d:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
		SingleTon4 s3 = (SingleTon4) ois.readObject();
		oos.close();
		fos.close();
		ois.close();
		System.out.println(s3);
	}

}
