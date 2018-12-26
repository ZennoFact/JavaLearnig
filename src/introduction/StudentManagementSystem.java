package introduction;

import java.util.List;

public class StudentManagementSystem {
	public static void main(String[] args) {
		// TODO 学生の情報の検索，登録から開始
		
		StudentManager studentManager = new StudentManager();
	
		Student transfer = new Student("E11C3016", "中臣", "鎌足", "ﾅｶﾄﾐﾉ", "ｶﾏﾀﾘ");
		studentManager.register(transfer);
		
		studentManager.showStudentsAll();
		
		List<Student> findStudents = studentManager.search("ﾗﾉ", SearchCategory.KANA);
		if (findStudents.size() > 0) studentManager.show(findStudents);
		else System.out.println("条件に一致する学生は見つかりませんでした。");
	}
}
