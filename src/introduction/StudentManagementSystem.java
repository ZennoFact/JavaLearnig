package introduction;

import java.util.List;
import java.util.Locale.Category;

public class StudentManagementSystem {
	public static void main(String[] args) {

		StudentManager studentManager = StudentManager.getInstance();
	
		// TODO　学科込みで追加したら，自動でID
		Student transfer = new Student("E16C2002", "中臣", "鎌足", "ﾅｶﾄﾐﾉ", "ｶﾏﾀﾘ", Gender.MALE);
		transfer.placement(Department.MULTIMEDIA_COMPUTING, 3);
		studentManager.register(transfer);
		
		studentManager.showStudentsAll();
		
		String[] searchWords = {"ﾗﾉ", "E17", "情報.?学科", "3", "女"};
		SearchCategory[] categories = {SearchCategory.KANA, SearchCategory.ID, SearchCategory.DEPARTMENT, SearchCategory.GRADE, SearchCategory.GENDER};
		
		for (int i = 0; i < categories.length; i++) {
			String searchWord = searchWords[i];
			System.out.println("[search '" + searchWord + "']");
			List<Student> findStudents = studentManager.search(searchWord, categories[i]);
			if (findStudents.size() > 0) studentManager.show(findStudents);
			else System.out.println("条件に一致する学生は見つかりませんでした。");
		}
		
	}
}
