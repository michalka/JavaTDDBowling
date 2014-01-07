
public class Bowling {

	public Bowling() {
		// TODO Auto-generated constructor stub
	}
	
	public static int calculateScore(String frames) {
		int score = 0;
		String[] game = new String[10];
		game = frames.split(" ");
		for(String frame : game){
			score += Character.getNumericValue(frame.charAt(0));
			score += Character.getNumericValue(frame.charAt(1));
		}
		return score;
	}

}
