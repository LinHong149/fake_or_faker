/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author linhong
 */

import java.util.*;
import java.io.*;
    
public class Headline {
    private String text;
    private String explanation;
    private boolean isTrue;
    private int index;
    public static ArrayList<Integer> visited = new ArrayList<>();
    private static final String fileName = "database.txt";
    

    public Headline() {
        // rng the index
        
        this.index = index;
        
        try{
            Scanner file = new Scanner(new File(fileName));
            int count = 1;
            while (file.hasNext()){
                String[] line = file.nextLine().split(",");
                if (index == count){
                    this.text = line[0];
                    this.isTrue = Boolean.parseBoolean(line[1]);
                    this.explanation = line[2];
                }
                count++;
            }
        } catch(FileNotFoundException e){
            System.out.println("Error: "+e);
        }
        
        
    }

    public String getText() { 
        return text; 
    }
    
    public String getExplanation() { 
        return explanation; 
    }
    
    public boolean getIsReal(){
        return isTrue;
    }
    
    public static ArrayList<Integer> getVisited(){
        return visited;
    }
}