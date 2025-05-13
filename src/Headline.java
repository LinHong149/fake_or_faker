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
    private static final String FILENAME = "database.txt";
    private static final Random RANDOM = new Random();
    

    public Headline() {
        // find number of lines
//        int totalLines = countLines();
//        
//        // rng the index
//        do {
//            index = RANDOM.nextInt(totalLines); 
//        } while (visited.contains(index));
//        visited.add(index); 
//        
        // set obj index as rng index
        this.index = 1;
        
        // get the text, explanation, and isTrue from file index
        try{
            Scanner file = new Scanner(new File(FILENAME));
            int count = 0;
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
    
    public boolean getIsTrue(){
        return isTrue;
    }
    
    public static ArrayList<Integer> getVisited(){
        return visited;
    }
    
    public static int countLines(){
        int counter = 0;
        try{
            Scanner file = new Scanner(new File(FILENAME));
            while(file.hasNext()){
                counter++;
            }
        } catch(IOException e){
            System.out.println("Error: "+e);
        }
        return counter;
        
    }
}