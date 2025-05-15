/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * This class represents a True/False question.
 * It includes the question text, the correct answer, and feedback for the user.
 * Other classes (like randTFQuestion) can use or extend this class.
 * 
 * Author: Jacob Zheng
 */
public class TFQuest {
    
    // The question text
    protected String question;

    // The correct answer ("True" or "False")
    protected String answer;

    // Feedback or explanation related to the question
    protected String feedback;

    // Default constructor – creates an empty question
    public TFQuest() {
        this("","","");
    }

    // Constructor with parameters – creates a question with provided values
    public TFQuest(String question, String answer, String feedback) {
        this.question = question;
        this.answer = answer;
        this.feedback = feedback;
    }

    // A method to set default or placeholder values
    public void setStuff() {
        this.question = "nothing";
        this.answer = "nothing";
        this.feedback = "nothing";
    }

    /**
     * This method checks if the user's answer is correct.
     * @param userinput The answer given by the user ("True" or "False")
     * @return true if the answer is correct, false otherwise
     */
    public boolean correct(String userinput) {
        return userinput.equals(answer);
    }
}
