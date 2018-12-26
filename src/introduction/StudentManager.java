package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.print.attribute.standard.RequestingUserName;

public class StudentManager {

	private List<Student> list;
	
	public StudentManager() {
		list = FileLoader.loadStudentDemo();
	}
	
	// TODO: IDの重複チェック
	public void register(Student information) {
		Optional<Student> alreadyRegistered = list.stream()
				.filter(s -> s.getId().equals(information.getId()) )
				.findFirst();
		
		if(alreadyRegistered.isPresent()) System.out.println("学生の登録に失敗しました。");
		else list.add(information);
	}
	
	public List<Student> search(String name) {
		return search(name, SearchCategory.NAME);
	}
	
	public List<Student> search(String keyword, SearchCategory category ) {
		
		
		return list.stream()
				.filter(s -> {
					switch (category) {
					case ID:
						return s.getId().matches(".*" + keyword + ".*");
					case KANA:
						return s.getKana().matches(".*" + keyword + ".*");
					default:
						return s.getName().matches(".*" + keyword + ".*");						
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
