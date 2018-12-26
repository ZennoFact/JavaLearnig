package introduction;

import java.util.ArrayList;

public class FileLoader {
	public static ArrayList<Student> loadStudentDemo() {
		return new ArrayList<Student>() {
			{
				add(new Student("E11C3011", "蘇我", "馬子", "ｿｶﾞﾉ", "ｳﾏｺ"));
				add(new Student("E11C3012", "小野", "小町", "ｵﾉﾉ", "ｺﾏﾁ"));
				add(new Student("E11C3013", "菅原", "道真", "ｽｶﾞﾜﾗﾉ", "ﾐﾁｻﾞﾈ"));
				add(new Student("E11C3014", "柿本", "人麻呂", "ｶｷﾉﾓﾄﾉ", "ﾋﾄﾏﾛ"));
				add(new Student("E11C3015", "藤原", "定家", "ﾌｼﾞﾜﾗﾉ", "ｻﾀﾞｲｴ"));
			}
		};
	}
}
