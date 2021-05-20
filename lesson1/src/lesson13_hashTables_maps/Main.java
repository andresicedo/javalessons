package lesson13_hashTables_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// hash map, tree map, linked hash map
		// A map is a key value pair
		// Most common***
		Map m = new HashMap();
		m.put("andres", 21);
		m.put("anderson", 21);
		m.put("dre", 21);
		System.out.println(m);
		System.out.println(m.get("andres"));
		m.containsValue(21);//true
		m.containsKey("andres");//true
		m.values();//21,21,21
		m.remove("anderson");
		m.clear();//{}
		m.isEmpty();//false
		
		
		//keys have to be the same data type and
		//will sort by key
		Map a = new TreeMap();
		a.put("z", 21);
		a.put("i", 24);
		a.put("a", 3);
		System.out.println(a);//{a=3, i=24, z=21}
		
		
		//keeps things in same order that their 
		//added into the linked hash map
		Map i = new LinkedHashMap();
		i.put("z", 21);
		i.put("i", 9);
		i.put("a", 3);
		System.out.println(i);//{z=21, i=9, a=3}
		
		
	}

}
