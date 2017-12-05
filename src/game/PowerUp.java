package game;

/**
 * @author ericallen
 *
 */
public class PowerUp extends NPC {
	
	/**
	 * Questions
	 */
	
	//TODO: Add more questions and answers
	//TODO: Alter the frequency of the powerups. Need less
	//FIXME: Do not let the game ask duplicate questions
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
			 	
			 	/**
			 	 * Default Constructor
			 	 * 
			 	 */
			 	public PowerUp() {
			 		value = 300;
			 	}
			 	/* (non-Javadoc)
			 	 * @see game.NPC#getValue()
			 	 * get value
			 	 */

			 	public int getValue() {
					return value;
				}
			 	
			 	/**
			 	 * @return String question and answers
			 	 */
			 	public static String[] getQuestionAndAnswer()
			 	{
			 		int i = (int) (Math.random() * questions.length);
			 		return new String[] {questions[i],answers[i]};
			 	}

}
