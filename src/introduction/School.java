package introduction;

public enum School {
	KYOTO_EKIMAE("京都駅前校", "E"),
	RAKUHOKU("洛北校", "R"),
	KAMOGAWA("鴨川校", "K"),
	UNKNOWN("校舎未決定", "0");
	
	private String name;
	private String id;
	private School(String name, String id) {
		setName(name);
		setId(id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
