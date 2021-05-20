package lesson15_maps_example_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new HashMap();
		String str = "Hello World, my name is Andres";
		
		for(char i:str.toCharArray()) {
			if(m.containsKey(i)) {
				int old = (int) m.get(i);
				m.put(i, old+1);
			} else {
				m.put(i, 1);
			}
		}
		m.remove(' ');
		m.remove(',');
		System.out.println(m);
		
		
		
		
		int[] x = {-21,0,45,33,2,24,1,9,3,3};
		Arrays.sort(x);
		
		for(int n:x) {
			System.out.print(n + ",");
		}
	}

}
