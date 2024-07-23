package self_study_java;

public class Member {
	public String name;
	public int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Member) {
			Member m = (Member) o;
			return m.name.equals(name) && (m.age==age);
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		return name.hashCode() + age;
	}
}
