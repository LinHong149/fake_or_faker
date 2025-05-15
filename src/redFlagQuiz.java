/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jacob Zheng
 */
public class redFlagQuiz {
    private TFQuest currQuestion;
    private int score;
    private int streak;
    
    public redFlagQuiz(){
        this.currQuestion = new randTFQuestion();
        this.score = 0;
        this.streak = 0;
        currQuestion.setStuff();
    }
    
    public TFQuest getCurrQuestion(){
        return currQuestion;
    }
    public void addscore(){
        score++;
    }
    public void resetscore(){
        score = 0;

    }
    public void addstreak(){
        if (score> streak)
        streak++;
    }
    public int getscore(){
        return score;
    }
    public int getstreak(){
        return streak;
    } 
}
