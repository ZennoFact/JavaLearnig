package introduction;

import java.util.List;

public class StudentManagementSystem {
	public static void main(String[] args) {
		// TODO 学生の情報の検索，登録から開始
		
		List<Student> studentList = FileLoader.loadStudentDemo();
		
		studentList.forEach(System.out::println);
	}
}
