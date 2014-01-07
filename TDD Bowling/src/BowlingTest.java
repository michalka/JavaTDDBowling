

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
	
	@Test
	public void spare(){
		assertEquals("A spare score should include the first roll of the next frame",13,Bowling.calculateScore("1/ 11"));
	}
	
	@Test
	public void strike(){
		assertEquals("A strike score should include the the next frame",14,Bowling.calculateScore("X 11"));
	}
}
