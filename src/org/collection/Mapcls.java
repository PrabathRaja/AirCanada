package org.collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Mapcls {
	public static void main(String[] args) {
	Map<String, String> m=new LinkedHashMap<>();
	
	m.put("a", "b");
	m.put("c", "d");
	m.put("e", "f");
	
	System.out.println(m);
	int size = m.size();
	System.out.println(size);
	String string = m.get("e");
	System.out.println(string);
	Set<String> keySet = m.keySet();
	System.out.println(keySet);
	Collection<String> values = m.values();
	System.out.println(values);
	boolean containsKey = m.containsKey("a");
	System.out.println(containsKey);
	boolean containsValue = m.containsValue("h");
	System.out.println(containsValue);
	boolean empty = m.isEmpty();
	System.out.println(empty);
	String remove = m.remove("a");
	System.out.println(remove);
	System.out.println(m);
	}

}
