/**
 * This class represents a simple True/False quiz game.
 * It keeps track of the current question, the player's score, and their best streak.
 */

import java.util.*;
import java.io.*;
public class redFlagQuiz {

    // Stores the current True/False question
    private TFQuest currQuestion;

    // Keeps track of the current score
    private int score;

    // Keeps track of the highest score streak
    private int streak;

    // Constructor - runs when a new redFlagQuiz object is created
    public redFlagQuiz() {
        // Creates a random True/False question
        this.currQuestion = new randTFQuestion();
        
        // Sets the starting score to 0
        this.score = 0;

        // Sets the starting streak to 0
        this.streak = 0;

        // Sets up the question details
        currQuestion.setStuff();
    }

    /**
     * Returns the current question object.
     * 
     * @return the current {@code TFQuest} question
     */
    public TFQuest getCurrQuestion() {
        return currQuestion;
    }

    /**
     * Increments the player's score by one point.
     */
    public void addscore() {
        score++;
    }

    /**
     * Resets the player's score to zero.
     */
    public void resetscore() {
        score = 0;
    }

    /**
     * Updates the player's streak if the current score exceeds the previous streak.
     * Assumes the streak is only updated when a new high score is reached.
     */
    public void addstreak() {
        if (score > streak)
            streak++;
    }

    /**
     * Returns the current score of the player.
     * 
     * @return the current score
     */
    public int getscore() {
        return score;
    }

    /**
     * Returns the highest streak of correct answers achieved by the player.
     * 
     * @return the highest streak
     */
    public int getstreak() {
        return streak;
    }
    
        // Method to write quiz result to a file
    public void write(String filename, String result){
        try {
            // Create a FileWriter in append mode, so new data is added to the end of the file
            FileWriter write = new FileWriter(filename, true);

            // Create PrintWriter to write formatted text to the file
            PrintWriter pwrite = new PrintWriter(write);

            // Write the question, result, score, and streak to the file
            // Using the questiongetter() method to retrieve the current question
            pwrite.println("Question: "+ questiongetter() + " Result: " + result + " Score: " + this.score + " Streak: " + this.streak);

            // Close the PrintWriter to ensure the data is properly written and the file is closed
            pwrite.close();

        } catch (IOException e) {
            // If an IOException occurs (e.g., file not found, unable to write), print an error message
            System.err.println("failed to write ");
        }
    }

    // Method to get the current question (to be logged in the write method)
    public String questiongetter(){
        // Return the question from the current question object (currQuestion)
        return currQuestion.getQuestion();
}


}
