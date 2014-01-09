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
		assertEquals("A spare score should include the roll",13,Bowling.calculateScore("1/ 11"));
	}
	
	@Test
	public void strike(){
		assertEquals("A strike score should include the next two balls",14,Bowling.calculateScore("X 11"));
	}
	
	@Test
	public void twoStrikes(){
		assertEquals("A strike score should include the next two balls, even if it's in different frames",35,Bowling.calculateScore("X X 11"));
	}
	
	@Test
	public void bonusRoll(){
		assertEquals("A spare in the tenth frame should get one bonus roll",56,Bowling.calculateScore("01 02 03 04 05 06 07 08 09 1/1"));
	}
	
	@Test
	public void bonusStrike(){
		assertEquals("A strike in the tenth frame should get two bonus rolls",58,Bowling.calculateScore("01 02 03 04 05 06 07 08 09 X12"));
	}
	
	/*@Test
	public void bonusTurkey(){
		assertEquals("A turkey in the tenth frame should provide a score of 30 for the frame",75,Bowling.calculateScore("01 02 03 04 05 06 07 08 09 XXX"));
	}*/
	
	/*@Test
	public void fullGame(){
		assertEquals("This is a full game",14,Bowling.calculateScore("X 11 5/ 90 X X "));
	}*/
}
