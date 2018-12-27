package introduction;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StudentManager {
	private static StudentManager manager = new StudentManager();
	
	private List<Student> list;
	
	private StudentManager() {
		list = FileLoader.loadStudentDemo();
	}
	
	public static StudentManager getInstance() {
		return manager;
	}
	
	// TODO: IDの重複チェック
	public void register(Student information) {
		Optional<Student> alreadyRegistered = list.stream()
				.filter(s -> s.getId().equals(information.getId()) )
				.findFirst();
		
		if(alreadyRegistered.isPresent()) System.out.println("学生の登録に失敗しました。");
		else list.add(information);
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
