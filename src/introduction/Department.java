package introduction;

public enum Department {
	COMPUTER_SCIENCE('C', "情報科学科", 4),
	MULTIMEDIA_COMPUTING('K', "メディア情報学科", 3),
	COMPUTER_NETWORKING('L', "ネットワーク学科", 3),
	COMPUTER_PROCESSING('P', "情報処理科", 2),
	UNASSIGNED(' ', "学科未決定", 0);
	
	private String name;
	private int years;
	private char id;
	
	private Department(char id, String name, int year) {
		setId(id);
		setName(name);
		setYears(year);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "（" + years + "年過程）";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public char getId() {
		return id;
	}

	public void setId(char id) {
		this.id = id;
	}
}
