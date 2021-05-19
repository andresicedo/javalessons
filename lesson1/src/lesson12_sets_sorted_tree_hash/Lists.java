package lesson12_sets_sorted_tree_hash;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> t = new ArrayList<Integer>();
		t.add(1);
		t.add(3);//[1,3]
		t.get(0);//1
		t.set(1, 21);//[1,21]
		t.size();
		t.subList(0, 1);//[1,21]
		
		System.out.println(t);
		
	}

}
