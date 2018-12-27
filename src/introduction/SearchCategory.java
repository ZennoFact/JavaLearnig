package introduction;

import java.util.Locale.Category;

public enum SearchCategory {
	ID(0),
	DEPARTMENT(1),
	GENDER(2),
	GRADE(3),
	KANA(4),
	NAME(5);
	
	private int id;
	
	private SearchCategory(int id) {
		this.id = id;
	}
	
	private int getId() {
		return id;
	}
	
	public static SearchCategory get(int i) {
		for (SearchCategory category : SearchCategory.values()) {
			if(category.getId() == i) return category;
		}
		return SearchCategory.NAME;
	}
}
