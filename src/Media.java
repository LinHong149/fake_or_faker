import java.util.Random; // Importing the Random class to generate random numbers

/**
 * The Media class extends (inherits from) the Lesson class.
 * It represents a lesson about types of media manipulation.
 */
class Media extends Lesson {

    // An array of different types of media manipulation
    static String[] mediaManipulate = {
        "Photo Editing",
        "Out of Context Photos",
        "Video Editing",
        "Fake Videos"
    };

    /**
     * This method picks a random media manipulation technique from the list.
     * It overrides the getRandomRecord() method from the Lesson class.
     * 
     * @return a randomly chosen media manipulation technique
     */
    @Override
    public String getRandomRecord() {
        Random random = new Random(); // Create a Random object
        // Return a random item from the mediaManipulate array
        return mediaManipulate[random.nextInt(mediaManipulate.length)];
    }
}
