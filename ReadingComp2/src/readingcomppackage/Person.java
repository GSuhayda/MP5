/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingcomppackage;

/** Stores the information of the user of the program
 *
 * @author Grant Pfeifer
 * @version 1.0 - 23 April 2017
 */
public class Person {
    // A string for storing the person's name 
    private String studentName;
    
    /**
     * Instantiates a new person object and sets the name
     * @param name the name of the person
     */
    public Person(String name){
        setName(name);
    }
    
    /**
     * Sets the name of the person
     * @param n a string containing the name
     */
    private void setName(String n){
        studentName = n;
    }
    
    /**
     * Used to return the name of the person
     * @return a string containing the persons name
     */
    public String getName(){
        return this.studentName;
    }
    
}
