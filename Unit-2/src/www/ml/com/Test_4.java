package www.ml.com;

import java.util.HashMap;
import java.util.Map;

public class Test_4 {

	public Map<Integer, Object> test(Integer t1,String s1){
		Map<Integer,Object> map = new HashMap<Integer, Object>();
		map.put(1, t1);//   ��int��������map
		map.put(2, s1);//   ��String��������map
		return map;
	}
	public static void main(String[] args) {
		Map<Integer,Object> map = new HashMap<Integer, Object>();
		Test_4 T4 = new Test_4();
		map = T4.test(2333, "wwww");   //�������Ĳ�����int��String��������map��
		Integer T1 = (Integer) map.get(1); //ȡ��INT
		String S1 = (String) map.get(2);// ȡ�� String
		System.out.println(T1+S1);
		
		
	}
}
