import java.util.Random; // Import the Random class to help choose random values

/**
 * The Manipulation class extends the Lesson class.
 * It represents a lesson on different types of information manipulation.
 */
class Manipulation extends Lesson {

    // A list of examples of how information can be manipulated
    static String[] manipulating = {
        "True information under a false title",
        "Out of context quotations",
        "Opinion or fact?",
        "Distorting facts",
        "No citation/sources for information (Made up) or using unverified people or 'experts'.",
        "Leaving pieces of information that could change the context",
        "False translations/wrong translations that can be misleading"
    };

    /**
     * This method picks and returns one random example of manipulation.
     * It overrides the getRandomRecord() method from the Lesson class.
     * 
     * @return a randomly selected manipulation technique from the list
     */
    @Override
    public String getRandomRecord() {
        Random random = new Random(); // Create a Random object
        // Pick a random index and return the corresponding item
        return manipulating[random.nextInt(manipulating.length)];
    }
}
