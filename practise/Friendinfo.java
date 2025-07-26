class Friends {
	String name;
	int age;
	float cgpa;
	String skills;

	void info () {
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
		System.out.println("CGPA : " + cgpa);
		System.out.println("Skill: " + skills);
	}
}

public class Friendinfo {
	public static void main (String[] args) {
		// Zayeed
		Friends zayeed = new Friends();
		zayeed.name = "Zayeed";
		zayeed.age = 23;
		zayeed.cgpa = 3.53f;
		zayeed.skills = "Shibir";
	
		// Shafin
		Friends shafin = new Friends();
		shafin.name = "Shafin";
		shafin.age = 22;
		shafin.cgpa = 3.52f;
		shafin.skills = "SEO";
		// showing info
		// Shafin
		shafin.info();
		System.out.println("");
		zayeed.info();
	}
}

