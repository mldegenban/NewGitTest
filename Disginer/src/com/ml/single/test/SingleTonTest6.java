package com.ml.single.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import com.ml.single.SingleTon4;

public class SingleTonTest6 {

	public static void main(String[] args) throws Exception {

		SingleTon4 s1 = SingleTon4.getInstance();
		SingleTon4 s2 = SingleTon4.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);

		// 通过反射的方式直接调用私有构造器
		Class<SingleTon4> clazz = (Class<SingleTon4>) Class.forName("com.ml.single.SingleTon4");
		Constructor<SingleTon4> c = clazz.getDeclaredConstructor(null);
		c.setAccessible(true);
		SingleTon4 s3 = c.newInstance();
		SingleTon4 s4 = c.newInstance();
		System.out.println(s3);
		System.out.println(s4);
		;

		// 通过反序列化的方式构造多个对象
		/*
		 * FileOutputStream fos = new FileOutputStream("d:/a.txt");
		 * ObjectOutputStream oos = new ObjectOutputStream(fos);
		 * oos.writeObject(s1);
		 * 
		 * 
		 * ObjectInputStream ois = new ObjectInputStream(new
		 * FileInputStream("d:/a.txt")); SingleTon4 s3 = (SingleTon4)
		 * ois.readObject(); oos.close(); fos.close(); ois.close();
		 * System.out.println(s3);
		 */
	}

}
