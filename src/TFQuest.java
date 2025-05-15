/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jacob Zheng
 */
public class TFQuest {
    protected String question;
    protected String answer;
    protected String feedback;
   
    public TFQuest (){}
    
    public TFQuest(String question, String answer, String feedback){
        this.question = question;
        this.answer= answer;
        this.feedback = feedback;
    }
    
    public void setStuff(){
        this.question = "nothing";
        this.answer = "nothing";
        this.feedback = "nothing";
    }
    
    
    public boolean correct(String userinput){
       return userinput.equals(answer);
    }
}

