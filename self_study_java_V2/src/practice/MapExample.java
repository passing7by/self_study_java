package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; //최고 점수를 받은 아이디 저장
		int maxScore = 0; //최고 점수 저장
		int totalScore = 0; //점수 합계 저장
		
		//작성 위치
		Set<String> set = map.keySet();
		for(String s : set) {
			if(map.get(s)>maxScore) {
				maxScore = map.get(s);
				name = s;
			}
			totalScore += map.get(s);
		}
		int avgScore = totalScore/map.size();
		
		System.out.println("최고 점수를 받은 아이디 : "+name+" | 최고 점수 : "+maxScore+" | 점수 평균 : "+avgScore);
	}
}
