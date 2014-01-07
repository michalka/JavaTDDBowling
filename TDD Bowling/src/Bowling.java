
public class Bowling {

	public Bowling() {
		// TODO Auto-generated constructor stub
	}
	
	public static int calculateScore(String frames) {
		int score = 0;
		for(int i =0; i< frames.length(); i++){
			score += Character.getNumericValue(frames.charAt(0));
		}
		return score;
	}

}
