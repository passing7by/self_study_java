package example;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//List-ArrayList 선언, 생성
		//List<String> list = new ArrayList<>(); 로도 작성 가능
		
		System.out.println("============== 맨 끝에 값 추가 =============");
		list.add("Jenny");
		System.out.println(list);
		
		System.out.println("============== 1번 인덱스에 값 추가 =============");
		list.add(1, "Jenny");
		System.out.println(list);
		
		System.out.println("============== 1번 인덱스에서 값을 가져와서 출력 =============");
		String str = list.get(1);
		System.out.println(str);
		
		System.out.println("============== Jenny 삭제 1 =============");
		list.remove("Jenny");
		System.out.println(list);
		//중복된 2개의 값 중 1개만 삭제됨
		
		System.out.println("============== Jenny 삭제 2 =============");
		list.remove("Jenny");
		System.out.println(list);
		
		System.out.println("============== 값 자체가 아닌, 참조변수를 추가, 삭제하는 경우에는? =============");
		String s1 = "Jenny";
		list.add(s1);
		System.out.println(list);
		list.add(s1);
		System.out.println(list);
		list.remove(s1);
		System.out.println(list);
		list.remove(s1);
		System.out.println(list);
		//같은 결과
		
		System.out.println("============== 이미 값이 들어있는 인덱스에 값을 넣는 경우에는? =============");
		list.add("Jenny");
		System.out.println(list);
		list.add("Surl");
		System.out.println(list);
		list.add(1, "Gon");
		System.out.println(list);
		//해당 인덱스에 원래 있던 값이 뒤로 한 칸 밀려나고, 그 자리에 새로운 값이 삽입됨



		
	}

}
