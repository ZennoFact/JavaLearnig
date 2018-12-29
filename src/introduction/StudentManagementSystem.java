package introduction;

import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
	public static void main(String[] args) {

		StudentManager studentManager = StudentManager.getInstance();
		studentManager.loadData("demo");
		
		// TODO　学科込みで追加したら，自動でID
		Student transfer = new Student(2016, "中臣", "鎌足", "ﾅｶﾄﾐﾉ", "ｶﾏﾀﾘ", Gender.MALE);
		transfer.placement(Department.MULTIMEDIA_COMPUTING, 3);
		studentManager.register(transfer);
		
		System.out.println("[all students data]");
		studentManager.showStudentsAll();
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input > search_word [option] | exit (is close)");
		System.out.print("> ");
		String input = scanner.nextLine();
		
		while( ! input.equals("exit") ) {
			System.out.println("[search '" + input + "']");
			if (input.length() > 0) {				
				List<Student> findStudents = studentManager.search(input);
				if (findStudents.size() > 0) studentManager.show(findStudents);
				else System.out.println("条件に一致する学生は見つかりませんでした。");
			}
			
			System.out.println();
			System.out.println("input > search_word [option] | exit (is close)");
			System.out.print("> ");
			input = scanner.nextLine();
		}

		System.out.println("bye.");
		scanner.close();
	}
}
