package introduction;

import java.util.List;
import java.util.Scanner;
import java.util.Locale.Category;

public class StudentManagementSystem {
	public static void main(String[] args) {

		StudentManager studentManager = StudentManager.getInstance();
	
		// TODO　学科込みで追加したら，自動でID
		Student transfer = new Student("E16C2002", "中臣", "鎌足", "ﾅｶﾄﾐﾉ", "ｶﾏﾀﾘ", Gender.MALE);
		transfer.placement(Department.MULTIMEDIA_COMPUTING, 3);
		studentManager.register(transfer);
		
		System.out.println("[all students data]");
		studentManager.showStudentsAll();
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input > search_word [category_number] | exit (is close)");
		System.out.println("[Category] 0: ID, 1: 学科, 2: 性別, 3: 学年, 4: カナ, 5: 氏名");
		System.out.print("> ");
		String[] inputs = scanner.nextLine().split(" ");
		
		while( ! inputs[0].equals("exit") ) {
			String word = inputs[0];
			System.out.println("[search '" + word + "']");
			int categoryID = 5;
			if (inputs.length > 1) categoryID = Integer.parseInt(inputs[1]);
			List<Student> findStudents = studentManager.search(word, SearchCategory.get(categoryID));
			if (findStudents.size() > 0) studentManager.show(findStudents);
			else System.out.println("条件に一致する学生は見つかりませんでした。");
			
			System.out.println();
			System.out.println("input > search_word [category_number] | exit (is close)");
			System.out.println("[Category] 0: ID, 1: 学科, 2: 性別, 3: 学年, 4: カナ, 5: 氏名");
			System.out.print("> ");
			inputs = scanner.nextLine().split(" ");
		}

		System.out.println("bye.");
		scanner.close();
	}
}
