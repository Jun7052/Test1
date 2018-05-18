package Management;

public class StudentDAO {
	String name;
	int age;
	String tel;
	String number;
	
	public StudentDAO(String name, int age, String tel, String number) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
