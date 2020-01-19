package th.ac.kku.member;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LevelTest {
	@Test
	public void memberShouldUpLevelToGoldMemberWhenSequenceIs99() {
		Member member = new Member(600201, "Silver", 90);
		Order order = new StubOrder();
		Level level = new Level(order);
		
		Member newMember = level.up(member);
		
		assertEquals(newMember.getLevel(),"Gold");
		assertEquals(newMember.getSpecialPoint(), 290);
	}

}
