package introduction;

public enum Department {
	COMPUTER_SCIENCE('C', "情報科学科", 4, "C1", School.KYOTO_EKIMAE),
	MULTIMEDIA_COMPUTING('K', "メディア情報学科", 3, "C2", School.KYOTO_EKIMAE),
	COMPUTER_NETWORKING('L', "ネットワーク学科", 3, "C3", School.KYOTO_EKIMAE),
	COMPUTER_PROCESSING('P', "情報処理科", 2, "C4", School.KYOTO_EKIMAE),
	UNASSIGNED(' ', "学科未決定", 0, "00", School.KYOTO_EKIMAE);
	
	private String name;
	private int years;
	private char id;
	private String bits;
	private School school;
	
	private Department(char id, String name, int year, String bits, School school) {
		setId(id);
		setName(name);
		setYears(year);
		setBits(bits);
		setSchool(school);
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

	public String getBits() {
		return bits;
	}

	public void setBits(String bits) {
		this.bits = bits;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
}
