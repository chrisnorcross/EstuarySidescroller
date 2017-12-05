package game;

/**
 * @author ericallen
 *
 */
public class PowerUp extends NPC {

	/**
	 * Questions
	 */
	private static final String[] questions = { "What animal has valuable blue blood?",
			"True or false: Humans are a threat to estuaries.", "Estuaries contain a mix of fresh and ________ water",
			"This small bird feeds on horseshoe crab eggs", "The biotic community and its abiotic environment",
			"A partially enclosed body of water where two different bodies of water meet and mix",
			"The arrangement of organisms detailing the order in which things are produced/consumed.",
			"Organism that manufactures its own food energy by photosynthesis. Green plants and some bacteria are producers.",
			"An animal that hunts, kills, and eats other animals.",
			"An animal that is hunted, killed and eaten by other animals. ",
			"Microscopic photosynthesizing organisms that drift with the currents; microalgae including diatoms and dinoflagellates. ",
			"process by which plants, using chlorophyll and/or other photosynthetic pigments, manufacture food energy from sunlight & CO2, generating O2 as a byproduct. ",
			"An inherited change in a living thing that helps it survive better in its environment. ",
			" When an animal ________, they travel a long-distance, to a find a new habitat temporarily, usually on a seasonal basis.  ",
			"The particular part of the environment where a plant or animal naturally lives. ",
			"Structure that demonstrates the movement of food energy through an ecosytem. “Producers” (plants) serve as the foundation level and an apex consumer is at the top level.",
			"A network of interacting food chains. ",
			"True or False: A microorganism that breaks down dead tissue and returns the nutrients to the ecosystem is called a Decomposer",
			"Organism that feeds upon something else.",
			"Level within a food pyramid demonstrating an organism’s place in the feeding order within an ecosystem. "

	};

	private static final String[] answers = { "horseshoe crab",
			"true",
			"salt",
			"red knot",
			"ecosystem",
			"estuary",
			"food chain",
			"producer",
			"predator",
			"prey",
			"phytoplankton",
			"photosynthesis",
			"adaptation",
			"migrates",
			"habitat",
			"food pyramid",
			"food web",
			"true",
			"consumer",
			"trophic level"
	};

	/**
	 * Default Constructor
	 * 
	 */
	public PowerUp() {
		value = 300;
	}
	/*
	 * @see game.NPC#getValue() get value
	 */

	public int getValue() {
		return value;
	}

	/**
	 * @return String question and answers
	 */
	public static String[] getQuestionAndAnswer() {
		int i = (int) (Math.random() * questions.length);
		return new String[] { questions[i], answers[i] };
	}
}
