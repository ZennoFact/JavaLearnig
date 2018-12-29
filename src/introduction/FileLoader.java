package introduction;

import java.util.ArrayList;

public class FileLoader {
	public static void loadStudentDemo(StudentManager manager) {
		manager.register(new Student(2015, "蘇我", "馬子", "ｿｶﾞﾉ", "ｳﾏｺ", Gender.MALE, Department.COMPUTER_SCIENCE, 4));
		manager.register(new Student(2015, "小野", "小町", "ｵﾉﾉ", "ｺﾏﾁ", Gender.FEMALE, Department.COMPUTER_SCIENCE, 4));
		manager.register(new Student(2016, "菅原", "道真", "ｽｶﾞﾜﾗﾉ", "ﾐﾁｻﾞﾈ", Gender.MALE, Department.COMPUTER_SCIENCE, 3));
		manager.register(new Student(2016, "柿本", "人麻呂", "ｶｷﾉﾓﾄﾉ", "ﾋﾄﾏﾛ", Gender.MALE, Department.MULTIMEDIA_COMPUTING, 3));
		manager.register(new Student(2016, "源", "頼光", "ﾐﾅﾓﾄﾉ", "ﾖﾘﾐﾂ", Gender.MALE, Department.COMPUTER_NETWORKING, 3));
		manager.register(new Student(2016, "渡辺", "綱", "ﾜﾀﾅﾍﾞﾉ", "ﾂﾅ", Gender.MALE, Department.COMPUTER_NETWORKING, 3));
		manager.register(new Student(2017, "織田", "信忠", "ｵﾀﾞ", "ﾉﾌﾞﾀﾀﾞ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
		manager.register(new Student(2017, "豊臣", "秀頼", "ﾄﾖﾄﾐ", "ﾋﾃﾞﾖﾘ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
		manager.register(new Student(2017, "黒田", "官兵衛", "ｸﾛﾀﾞ", "ｶﾝﾍﾞｴ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
		manager.register(new Student(2017, "竹中", "半兵衛", "ﾀｹﾅｶ", "ﾊﾝﾍﾞｴ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
		manager.register(new Student(2017, "浅井", "長政", "ｱｻﾞｲ", "ﾅｶﾞﾏｻ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
		manager.register(new Student(2017, "浅野", "長政", "ｱｻｲ", "ﾅｶﾞﾏｻ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
		manager.register(new Student(2017, "小早川", "隆景", "ｺﾊﾞｶﾜ", "ﾀｶｶｹﾞ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
		manager.register(new Student(2017, "島津", "豊久", "ｼﾏﾂﾞ", "ﾄﾖﾋｻ", Gender.MALE, Department.COMPUTER_NETWORKING, 2));
		manager.register(new Student(2018, "野口", "英世", "ﾉｸﾞﾁ", "ﾋﾃﾞﾖ", Gender.MALE, Department.COMPUTER_SCIENCE, 1));
		manager.register(new Student(2018, "夏目", "漱石", "ﾅﾂﾒ", "ｿｳｾｷ", Gender.MALE, Department.COMPUTER_SCIENCE, 1));
		manager.register(new Student(2018, "与謝野", "晶子", "ﾖｻﾉ", "ｱｷｺ", Gender.FEMALE, Department.MULTIMEDIA_COMPUTING, 1));
		manager.register(new Student(2018, "島崎", "藤村", "ｼﾏｻﾞｷ", "ﾄｳｿﾝ", Gender.MALE, Department.COMPUTER_NETWORKING, 1));
		manager.register(new Student(2018, "太宰", "治", "ﾀﾞｻﾞｲ", "ｵｻﾑ", Gender.MALE, Department.COMPUTER_PROCESSING, 1));
	}
}
