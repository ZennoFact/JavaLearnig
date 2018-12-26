package introduction;

// TODO 最終的にはCSV?からデータ呼び出し
public class Student {
	private String id; // TODO 最終的には自動で連番に
	private String firstName;
	private String lastName;
	private String mei;
	private String sei;
	// TODO 成績のHashMap持たせようか？？？
	
	@Override
	public String toString() {
		return id + " " + lastName + " " + firstName + "(" + sei + " " + mei + ")";
	}
	
	public Student(String id, String lastName, String firstName, String sei, String mei) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMei(mei);
		this.setSei(sei);
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
	
	
	
}
