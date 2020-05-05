package www.ml.com;

import java.util.HashMap;
import java.util.Map;

public class Test_4 {

	public Map<Integer, Object> test(Integer t1,String s1){
		Map<Integer,Object> map = new HashMap<Integer, Object>();
		map.put(1, t1);//   把int对象塞进map
		map.put(2, s1);//   把String对象塞进map
		return map;
	}
	public static void main(String[] args) {
		Map<Integer,Object> map = new HashMap<Integer, Object>();
		Test_4 T4 = new Test_4();
		map = T4.test(2333, "wwww");   //传进来的参数（int，String对象塞进map）
		Integer T1 = (Integer) map.get(1); //取出INT
		String S1 = (String) map.get(2);// 取出 String
		System.out.println(T1+S1);
		
		
	}
}
