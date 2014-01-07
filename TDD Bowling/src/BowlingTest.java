

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingTest {

	@Test
	public void testCalculateScore() {
		assertEquals("A frame of all ones should be 20 points",20,Bowling.calculateScore("11 11 11 11 11 11 11 11 11 11"));
	}

}
