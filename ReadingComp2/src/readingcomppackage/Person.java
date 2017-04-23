/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingcomp2;

/**
 *
 * @author grant
 */
public class Person {
    private String studentName;
    private int score;
    
    public Person(String name){
        setName(name);
    }
    
    private void setName(String n){
        studentName = n;
    }
    
    public String getName(){
        return this.studentName;
    }
    
    public void addScore(){
        score++;
    }
    
    public int getScore(){
        return this.score;
    }
}
