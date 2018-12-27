package introduction;

public enum Gender {
	MALE("男"),
	FEMALE("女");
	
	private String text;
	private Gender(String text) {
		setText(text);
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}
