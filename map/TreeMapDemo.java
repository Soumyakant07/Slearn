package com.sl.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		
		map.put(9, "mahi");
		map.put(14, "sneha");
		map.put(5, "test");
		//map.put(null,null);
		//map.put(null, "som");
		map.put(8, null);
		
		System.out.println(map);
		System.out.println("get element "+map.get(5));
		map.remove(8);
		System.out.println(map);
		
		//iterate using for loop
		for(Map.Entry m :map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}