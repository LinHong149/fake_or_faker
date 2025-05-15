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
    
    public void write(String filename, String result){
        try {
            FileWriter write = new FileWriter(filename, true);
            PrintWriter pwrite = new PrintWriter(write);
            pwrite.println("Question: "+ questiongetter()+ " Result: "+ result + " Score: "+ this.score + " Streak:" + this.streak);
            pwrite.close();
            
        } catch (IOException e){
            System.err.println("failed to write ");
        }
        
    }
    
    public String questiongetter(){
        return currQuestion.getQuestion();
    }
}
