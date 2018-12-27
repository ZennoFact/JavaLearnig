package introduction;

import java.util.ArrayList;

public class FileLoader {
	public static ArrayList<Student> loadStudentDemo() {
		return new ArrayList<Student>() {
			{
				add(new Student("E15C1001", "蘇我", "馬子", "ｿｶﾞﾉ", "ｳﾏｺ", Gender.MALE, Department.COMPUTER_SCIENCE, 4));
				add(new Student("E15C1002", "小野", "小町", "ｵﾉﾉ", "ｺﾏﾁ", Gender.FEMALE, Department.COMPUTER_SCIENCE, 4));
				add(new Student("E16C1001", "菅原", "道真", "ｽｶﾞﾜﾗﾉ", "ﾐﾁｻﾞﾈ", Gender.MALE, Department.COMPUTER_SCIENCE, 3));
				add(new Student("E16C2001", "柿本", "人麻呂", "ｶｷﾉﾓﾄﾉ", "ﾋﾄﾏﾛ", Gender.MALE, Department.MULTIMEDIA_COMPUTING, 3));
				add(new Student("E16C3001", "源", "頼光", "ﾐﾅﾓﾄﾉ", "ﾖﾘﾐﾂ", Gender.MALE, Department.COMPUTER_NETWORKING, 3));
				add(new Student("E16C4001", "渡辺", "綱", "ﾜﾀﾅﾍﾞﾉ", "ﾂﾅ", Gender.MALE, Department.COMPUTER_NETWORKING, 3));
				add(new Student("E17C1001", "織田", "信忠", "ｵﾀﾞ", "ﾉﾌﾞﾀﾀﾞ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
				add(new Student("E17C1002", "豊臣", "秀頼", "ﾄﾖﾄﾐ", "ﾋﾃﾞﾖﾘ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
				add(new Student("E17C2001", "黒田", "官兵衛", "ｸﾛﾀﾞ", "ｶﾝﾍﾞｴ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
				add(new Student("E17C2002", "竹中", "半兵衛", "ﾀｹﾅｶ", "ﾊﾝﾍﾞｴ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
				add(new Student("E17C3001", "浅井", "長政", "ｱｻﾞｲ", "ﾅｶﾞﾏｻ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
				add(new Student("E17C3002", "浅野", "長政", "ｱｻｲ", "ﾅｶﾞﾏｻ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
				add(new Student("E17C4001", "小早川", "隆景", "ｺﾊﾞｶﾜ", "ﾀｶｶｹﾞ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
				add(new Student("E17C4002", "島津", "豊久", "ｼﾏﾂﾞ", "ﾄﾖﾋｻ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
				add(new Student("E18C1001", "野口", "英世", "ﾉｸﾞﾁ", "ﾋﾃﾞﾖ", Gender.MALE, Department.COMPUTER_SCIENCE, 1));
				add(new Student("E18C1002", "夏目", "漱石", "ﾅﾂﾒ", "ｿｳｾｷ", Gender.MALE, Department.COMPUTER_SCIENCE, 1));
				add(new Student("E18C2001", "与謝野", "晶子", "ﾖｻﾉ", "ｱｷｺ", Gender.FEMALE, Department.MULTIMEDIA_COMPUTING, 1));
				add(new Student("E18C3001", "島崎", "藤村", "ｼﾏｻﾞｷ", "ﾄｳｿﾝ", Gender.MALE, Department.COMPUTER_NETWORKING, 1));
				add(new Student("E18C4001", "太宰", "治", "ﾀﾞｻﾞｲ", "ｵｻﾑ", Gender.MALE, Department.COMPUTER_PROCESSING, 1));
			}
		};
	}
}
