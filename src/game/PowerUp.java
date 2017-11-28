package game;

public class PowerUp extends NPC {
	
	private static final String[] questions = {
			 			"What animal has valuable blue blood?",
			 			"True or false: Humans are a threat to estuaries.",
			 			"Estuaries contain a mix of fresh and ________ water",
			 			"This small bird feeds on horshoe crab eggs"
			 	};
			 	
			 	private static final String[] answers = {
			 			"horseshoe crab",
			 			"true",
			 			"salt",
			 			"red knot"
			 			
			 	};
			 	
			 	/**Default Constructor
			 	 * 
			 	 */
			 	public PowerUp() {
			 		value = 300;
			 	}
			 	public int getValue() {
					return value;
				}
			 	
			 	public static String[] getQuestionAndAnswer()
			 	{
			 		int i = (int) (Math.random() * questions.length);
			 		return new String[] {questions[i],answers[i]};
			 	}

}
