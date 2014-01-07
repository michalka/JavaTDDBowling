

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingTest {

	@Test
	public void testCalculateScore() {
		assertEquals("A frame with two rolls of one should be 2",2,Bowling.calculateScore("11"));
	}

}
