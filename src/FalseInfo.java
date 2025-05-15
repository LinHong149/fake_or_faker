import java.util.Random; // Importing the Random class to generate random numbers

/**
 * The FalseInfo class extends (inherits from) the Lesson class.
 * It represents a lesson about different types of false or misleading information.
 */
class FalseInfo extends Lesson {

    // An array of different types of false information
    static String[] falseInformation = {
        "Fabricated Content: Completely false content;",
        "Manipulated Content: Genuine information or imagery that has been distorted, e.g. a sensational headline or populist ‘click bait’; ",
        "Imposter Content: Impersonation of genuine sources, e.g. using the branding of an established agency;",
        "Misleading Content: Misleading information, e.g. comment presented as fact;",
        "False Context: Factually accurate content combined with false contextual information, e.g. when the headline of an article does not reflect the content;",
        "Satire and Parody: Humorous but false stories passed off as true. There is no intention to harm but readers may be fooled;",
        "False Connections: When headlines, visuals or captions do not support the content;",
        "Sponsored Content: Advertising or PR disguised as editorial content;",
        "Propaganda: Content used to manage attitudes, values and knowledge;",
        "Error: A mistake made by established news agencies in their reporting."
    };

    /**
     * This method picks and returns a random false information description from the list.
     * It overrides the getRandomRecord() method from the Lesson class.
     * 
     * @return a randomly selected false information description from the list
     */
    @Override
    public String getRandomRecord() {
        Random random = new Random(); // Create a Random object
        // Pick a random index and return the corresponding false information description
        return falseInformation[random.nextInt(falseInformation.length)];
    }
}
