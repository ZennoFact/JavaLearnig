package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StudentManager {
	private static StudentManager manager = new StudentManager();
	
	private List<Student> list;
	
	private StudentManager() {
		list = new ArrayList<>();
	}
	
	public void loadData(String mode) {
		switch (mode) {
		case "demo":
			FileLoader.loadStudentDemo(manager);			
			break;
		default:
			list = new ArrayList<>();
			break;
		}
	}
	
	public static StudentManager getInstance() {
		return manager;
	}
	
	public void register(Student information) {
		List<Student> registeredStudents = list.stream()
				.filter(s -> s.getEnteringYear() == information.getEnteringYear() && s.getDepartment() == information.getDepartment() )
				.collect(Collectors.toList());
		
		information.setId(createId(information, registeredStudents.size()));
		list.add(information);
	}
	
	private String createId(Student student, int number) {
		return student.getDepartment().getSchool().getId() +
				(student.getEnteringYear() % 100) +
				student.getDepartment().getBits() +
				String.format("%03d", (number + 1));
	}
	
	
	public List<Student> search(String text) {
		try {
			int year = Integer.parseInt(text);
			return search(year, SearchCategory.GRADE);
		} catch (NumberFormatException e) {
			System.out.println(text.substring(text.length() - 2).equals("-d"));
			if (text.equals("男") || text.equals("女")) return search(text, SearchCategory.GENDER);
			else if (text.matches("[A-Z0-9]+?")) return search(text, SearchCategory.ID);
			else if (text.matches("^[ｦ-ﾟ]*$")) return search(text, SearchCategory.KANA);
			else if (text.substring(text.length() - 2).equals("-d")) return search(text.substring(0, text.length() -3), SearchCategory.DEPARTMENT);
			else return search(text, SearchCategory.NAME);
		}
	}
	
	public List<Student> search(String keyword, SearchCategory category ) {
		return list.stream()
				.filter(s -> {
					switch (category) {
					case ID:
						return s.getId().matches(".*" + keyword + ".*");
					case DEPARTMENT:
						return s.getDepartment().toString().matches(".*" + keyword + ".*");
					case GENDER:
						return s.getGender().toString().equals(keyword);
					case GRADE:
						// GUIを作り始めると必要
						return s.getGrade() == Integer.parseInt(keyword);
					case KANA:
						return s.getKana().matches(".*" + keyword + ".*");
					default:
						return s.getName().matches(".*" + keyword + ".*");						
					}
				})
				.collect(Collectors.toList());
	}
	
	public List<Student> search(int year, SearchCategory category ) {
		return list.stream()
				.filter(s -> {
					switch (category) {
					case GRADE:
						return s.getGrade() == year;
					default:
						// TODO: そのうち，入学年とかで検索できるようにする
						return s.getGrade() == year;
					}
				})
				.collect(Collectors.toList());
	}
	

	public void show(Student student) {
		System.out.println(student);
	}
	
	public void show(List<Student> list) {
		list.forEach(System.out::println);
	}
	
	public void showStudentsAll() {
		show(list);
	}
}
