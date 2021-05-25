package lesson22_enums;

public enum Level {
	LOW(1),
	MEDIUM(2),
	HIGH(3);
	
	
	private int lvlNum;
	
	private Level(int num) {
		this.lvlNum = num;
	}
	
	public int getLvl() {
		return this.lvlNum;
	}
	
	public void setLvl(int num) {
		this.lvlNum = num;
	}
}
