package com.ml.ja;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo04 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 10);
		map.put("c", 11);
		map.put("d", 100);
		Collection<String> keySet = map.keySet();
		for(String key : keySet){
			System.out.println(key);
		}
		
		
		Iterable<Integer> values = map.values();
		Iterator<Integer> iterator = values.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		Collection<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()){
			Entry<String, Integer> entry = iterator2.next();
			String key1 = entry.getKey();
			Integer value1 = entry.getValue();
			System.out.println(key1+"----"+value1);
		}
		
		
	}
}
