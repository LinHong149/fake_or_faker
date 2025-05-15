import java.util.*;
import java.io.*;

/**
 * The Headline class represents a headline, its truth value, and its explanation.
 * It reads data from a file ("database.txt") to fetch the details of a randomly selected headline.
 * The class also keeps track of previously visited headlines to ensure random selection without repetition.
 * 
 * @author linhong
 */
public class Headline {

    // The headline text
    private String text;

    // Explanation for the headline
    private String explanation;

    // Whether the headline is true or not (boolean value)
    private boolean isTrue;

    // The index of the selected headline in the file
    private int index;

    // List to track which indices have been visited (to avoid duplicates)
    public static ArrayList<Integer> visited = new ArrayList<>();

    // The filename where headlines are stored
    private static final String FILENAME = "database.txt";

    // Random object to generate random numbers
    private static final Random RANDOM = new Random();

    /**
     * Default constructor. This constructor reads a random headline from the file,
     * ensures it's not a previously visited one, and assigns its text, explanation, and truth value.
     */
    public Headline() {
        // Find the total number of lines in the file
        int totalLines = countLines();

        // Generate a random index and ensure it's not already visited
        do {
            index = RANDOM.nextInt(totalLines); 
        } while (visited.contains(index));  // Keep trying until an unvisited index is found

        // Add this index to the visited list
        visited.add(index); 

        // Get the text, explanation, and truth value for the selected index from the file
        try {
            // Open the file for reading
            Scanner file = new Scanner(new File(FILENAME));

            int count = 0;
            // Read through the file line by line
            while (file.hasNext()) {
                // Split each line into parts by the '|' character
                String[] line = file.nextLine().split("\\|");

                // If we match the selected index, set the fields
                if (index == count) {
                    this.text = line[0];       // First part is the text
                    this.isTrue = Boolean.parseBoolean(line[1]);  // Second part is the truth value
                    this.explanation = line[2]; // Third part is the explanation
                }
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }

    // Getter for the text of the headline
    public String getText() {
        return text;
    }

    // Getter for the explanation of the headline
    public String getExplanation() {
        return explanation;
    }

    // Getter for the truth value of the headline
    public boolean getIsTrue() {
        return isTrue;
    }

    // Getter for the visited list (keeps track of visited indices)
    public static ArrayList<Integer> getVisited() {
        return visited;
    }

    /**
     * Counts the total number of lines in the "database.txt" file.
     * This helps to know how many headlines are available for random selection.
     * 
     * @return the number of lines in the file
     */
    public static int countLines() {
        int counter = 0;
        try {
            // Open the file for reading
            Scanner file = new Scanner(new File(FILENAME));

            // Count the number of lines in the file
            while (file.hasNext()) {
                file.nextLine();
                counter++;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return counter;
    }
}
