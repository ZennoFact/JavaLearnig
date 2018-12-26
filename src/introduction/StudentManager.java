package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	
	public void showStudentsAll() {
		list.forEach(System.out::println);
	}
}
