package th.ac.kku.member;

public class Member {
	private int ID;
	private final String Level;
	private final int SpecialPoint;
	
	public Member(int ID, String Level, int SpecialPoint) {
		this.ID = ID;
		this.Level = Level;
		this.SpecialPoint = SpecialPoint;
	}
	
	public int getID() {
		return ID;
	}

	public String getLevel() {
		return Level;
	}

	public int getSpecialPoint() {
		return SpecialPoint;
	}
	
}
