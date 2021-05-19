package lesson12_sets_sorted_tree_hash;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// Set - collection of unordered elements
		// that are unique
		Set<Integer> t = new HashSet<Integer>();
		t.add(3);
		t.add(6);
		t.add(21);
		t.add(9);
		t.remove(9);
//		t.clear();
		t.isEmpty();
		t.size();
		boolean x = t.contains(21);//true
		System.out.println(t);
	}

}
