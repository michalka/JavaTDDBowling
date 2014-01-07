
public class Bowling {

	public Bowling() {
		// TODO Auto-generated constructor stub
	}
	
	public static int calculateScore(String frames) {
		int score = 0;
		boolean spareFlag = false;
		int strikeFlag = 0;
		String[] game = new String[10];
		game = frames.split(" ");
		for(String frame : game){
			int tempScore = 0;
			if(frame.charAt(0) == 'X'){
				tempScore = 10;
				if(spareFlag || strikeFlag > 0){
					score += tempScore;
					if(!spareFlag)strikeFlag--;
					spareFlag = false;
				}
				strikeFlag += 2;
			}
			else{
				tempScore += Character.getNumericValue(frame.charAt(1));
				if(spareFlag || strikeFlag % 2 == 1){
					score += tempScore;
					if(!spareFlag) strikeFlag--;
					spareFlag = false;
				}
				
				if(frame.charAt(1) == '/'){
					tempScore = 10; 
					spareFlag = true;
				}
				else{
					tempScore += Character.getNumericValue(frame.charAt(1));
				}
				
				
				if(strikeFlag > 0){
					score += tempScore;
					strikeFlag -= 2;
				}
			}
			score += tempScore;
		}
		return score;
	}

}
