
public class Bowling {

	public Bowling() {
		// TODO Auto-generated constructor stub
	}
	
	public static int calculateScore(String frames) {
		int score = 0;
		boolean spareFlag = false;
		boolean strikeFlag = false;
		String[] game = new String[10];
		game = frames.split(" ");
		for(String frame : game){
			int tempScore = 0;
			if(frame.charAt(0) == 'X'){
				tempScore = 10;
				if(spareFlag || strikeFlag){
					score += tempScore;
					spareFlag = false;
					strikeFlag = false;
				}
				strikeFlag = true;
			}
			else{
				tempScore += Character.getNumericValue(frame.charAt(1));
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
				
				if(strikeFlag){
					score += tempScore;
					strikeFlag = false;
				}
			}
			score += tempScore;
		}
		return score;
	}

}
