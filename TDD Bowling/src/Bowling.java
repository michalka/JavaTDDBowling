
public class Bowling {

	public Bowling() {
		// TODO Auto-generated constructor stub
	}
	
	public static int calculateScore(String frames) {
		int score = 0;
		boolean spareFlag = false;
		String[] game = new String[10];
		game = frames.split(" ");
		for(String frame : game){
			int tempScore = Character.getNumericValue(frame.charAt(0));
			if(spareFlag){
				score += tempScore;
				spareFlag = false;
			}
			
			if(frame.charAt(1) == '/'){
				tempScore = 10; 
				spareFlag = true;
			}
			else{
				tempScore += Character.getNumericValue(frame.charAt(1));
			}
			score += tempScore;
		}
		return score;
	}

}
