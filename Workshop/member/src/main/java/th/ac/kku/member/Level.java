package th.ac.kku.member;

public class Level {
	private Order order;
	
	public Level(Order order) {
		this.order = order;
	}
	
	// check order more than 4 orders
	
	// targetOrders, order, member id
	// and spend more than 1000 bath
	// and with in 6 months
	
	// and sequence in between 1 - 199 candidates
	
	public Member up(Member member) {
		if (order.getTargetOrder(member.getID()) >= 4) {
			return new Member(member.getID(), "Gold", member.getSpecialPoint() + 200);
		}
		return null;
	}
	
}
