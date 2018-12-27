package introduction;

// TODO 最終的にはCSV?からデータ呼び出し
public class Student {
	private String id; // TODO 最終的には自動で連番に
	private String firstName;
	private String lastName;
	private String mei;
	private String sei;
	private Gender gender;
	private Department department;
	private int grade;
	
	// TODO 成績のHashMap持たせようか？？？
	
	@Override
	public String toString() {
		return id + " " + lastName + " " + firstName + "[" + sei + " " + mei + "](" + gender +") | " + getDepartment() + " " + getGrade() + "年生";
	}
	
	public Student(String id, String lastName, String firstName, String sei, String mei, Gender gender) {
		this(id, lastName, firstName, sei, mei, gender, Department.UNASSIGNED, 0);
	}
	
	public Student(String id, String lastName, String firstName, String sei, String mei, Gender gender, Department department, int grade) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMei(mei);
		this.setSei(sei);
		this.setGender(gender);
		this.setDepartment(department);
		this.setGrade(grade);
	}
	
	public void placement(Department department, int grade) {
		this.setDepartment(department);
		this.setGrade(grade);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getName() {
		return lastName + " " + firstName;
	}

	public String getMei() {
		return mei;
	}

	public void setMei(String mei) {
		this.mei = mei;
	}

	public String getSei() {
		return sei;
	}

	public void setSei(String sei) {
		this.sei = sei;
	}
	
	public String getKana() {
		return sei + " " + mei;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
