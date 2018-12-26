package introduction;

import java.util.List;

public class StudentManager {

	private List<Student> list;
	
	public StudentManager() {
		list = FileLoader.loadStudentDemo();
	}
	
	// TODO: IDの重複チェック
	public boolean register(Student information) {
		return list.add(information);
	}
	
	public void showStudentsAll() {
		list.forEach(System.out::println);
	}
}
