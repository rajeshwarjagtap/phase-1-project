package com.assistedpractice;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapUses {
  public static void main(String[] args) {
		Map<Integer, String>map=new HashMap<Integer, String>();
		map.put(01, "Joe");
		map.put(02, "Ben");
		map.put(03, "Roy");			
		Set<Integer> keys=map.keySet();
		for(Integer key:keys) {
			System.out.println(key+ " "+map.get(key));		
		}
	}
}
