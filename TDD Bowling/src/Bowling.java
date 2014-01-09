public class Bowling {

	public Bowling() {
		// TODO Auto-generated constructor stub
	}
	
	public static int calculateScore(String game) {
		int score = 0;
		boolean spareFlag = false;
		int strikeFlag = 0;
		String[] frames = new String[10];
		frames = game.split(" ");
		for(String frame : frames){
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
				tempScore += Character.getNumericValue(frame.charAt(0));
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
		
		if(frames.length == 10 && frames[9].length()==3){
			if(frames[9].charAt(0) == 'X'){
				score += Character.getNumericValue(frames[9].charAt(1));
			}
			if(frames[9].charAt(2) == 'X'){
				score += 10;
			}
			else if(frames[9].charAt(2) == '/'){
				score += 10;
				score -= Character.getNumericValue(frames[9].charAt(1));;
			}
			else{
				score += Character.getNumericValue(frames[9].charAt(2));
			}
		}
		return score;
	}

}
