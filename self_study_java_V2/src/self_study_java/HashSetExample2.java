package self_study_java;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("Gildong", 30));
		set.add(new Member("Gildong", 30));
		
		System.out.println("총 객체 수 : " + set.size());
	}

}
