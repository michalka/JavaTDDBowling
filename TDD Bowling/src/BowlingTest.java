

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingTest {
	@Test
	public void simpleFrame(){
		assertEquals("A frame with two rolls of one should be 2",2,Bowling.calculateScore("11"));
	}
	
	@Test
	public void twoFrames(){
		assertEquals("Two frames with two rolls of one should be 4",4,Bowling.calculateScore("11 11"));
	}
	
}
