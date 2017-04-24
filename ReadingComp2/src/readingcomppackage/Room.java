/*
 *  Room class definition 
 */
package readingcomppackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Room -This class collects and stores the data members associated 
 * with the specified room. It reads in data members from the specified data file
 * and constructs the JFrame that runs the questions exercise. 
 * @author Gregory Fritts
 */
public class Room {
    
    private File            inFile;             //File object
    private FileReader      inputFileReader;    //FileReader object
    private BufferedReader  inputBuffer;        //BufferedReader object
    
    private String          locationName;       //Holds location name
    private String          locationText;       //Holds text for the location 
    
    private String          question1;          //Holds question 1
    private String          question2;          //Holds question 2
    private String          question3;          //Holds question 3
    private String          question4;          //Holds question 4
    
    private String          answer1A;           //Holds text for answer A, question 1
    private String          answer1B;           //Holds text for answer B, question 1
    private String          answer1C;           //Holds text for answer C, question 1
    private String          answer1D;           //Holds text for answer D, question 1
    
    private String          answer2A;           //Holds text for answer A, question 2
    private String          answer2B;           //Holds text for answer B, question 2
    private String          answer2C;           //Holds text for answer C, question 2
    private String          answer2D;           //Holds text for answer D, question 2
    
    private String          answer3A;           //Holds text for answer A, question 3
    private String          answer3B;           //Holds text for answer B, question 3
    private String          answer3C;           //Holds text for answer C, question 3
    private String          answer3D;           //Holds text for answer D, question 3
    
    private String          answer4A;           //Holds text for answer A, question 4
    private String          answer4B;           //Holds text for answer B, question 4
    private String          answer4C;           //Holds text for answer C, question 4
    private String          answer4D;           //Holds text for answer D, question 4
    
    private String          explenation1;       //Holds explenation for question 1
    private String          explenation2;       //Holds explenation for question 2
    private String          explenation3;       //Holds explenation for question 3
    private String          explenation4;       //Holds explenation for question 4
    
    private int             correctAnswer1;     //Tells which choice is correct for 1
    private int             correctAnswer2;     //Tells which choice is correct for 2
    private int             correctAnswer3;     //Tells which choice is correct for 3
    private int             correctAnswer4;     //Tells which choice is correct for 4
    
    
    /**
     * Question-Constructs the questions for each room.
     * @param roomName -String that has the name of the room. It corresponds to 
     *                  a txt file that has the questions and text.
     */
    public Room (String roomName) {
        
        //Setup question session for given room
        inFile = new File(roomName + ".txt");   //Open data file
        readInData();                           //Read in data method
        setFirstQuestion();                     //Prepare first question and JFrame 
        
    } 
    
    /**
     * readInData -Reads in all of the data for the room into variables. 
     */
    public void readInData () {
        
        try{
            FileReader inputFileReader = new FileReader(inFile);    //Open file
            inputBuffer = new BufferedReader (inputFileReader);     //Start buffered reader
            
            //Read in all data from file 
            locationName = inputBuffer.readLine();
            locationText = inputBuffer.readLine();
            
            question1 = inputBuffer.readLine();
            question2 = inputBuffer.readLine();
            question3 = inputBuffer.readLine();
            question4 = inputBuffer.readLine();
            
            answer1A = inputBuffer.readLine();
            answer1B = inputBuffer.readLine();
            answer1C = inputBuffer.readLine();
            answer1D = inputBuffer.readLine();
            
            answer2A = inputBuffer.readLine();
            answer2B = inputBuffer.readLine();
            answer2C = inputBuffer.readLine();
            answer2D = inputBuffer.readLine();
            
            answer3A = inputBuffer.readLine();
            answer3B = inputBuffer.readLine();
            answer3C = inputBuffer.readLine();
            answer3D = inputBuffer.readLine();
            
            answer4A = inputBuffer.readLine();
            answer4B = inputBuffer.readLine();
            answer4C = inputBuffer.readLine();
            answer4D = inputBuffer.readLine();
            
            explenation1 = inputBuffer.readLine();
            explenation2 = inputBuffer.readLine();
            explenation3 = inputBuffer.readLine();
            explenation4 = inputBuffer.readLine();
            
            correctAnswer1 = Integer.parseInt(inputBuffer.readLine());
            correctAnswer2 = Integer.parseInt(inputBuffer.readLine());
            correctAnswer3 = Integer.parseInt(inputBuffer.readLine());
            correctAnswer4 = Integer.parseInt(inputBuffer.readLine());
        }
        catch (IOException e) {
            System.out.println("Error-File not Found");
            System.exit( 1 );
        }        
    }
    
    /**
     * setFirstQuestion -Constructs JFrame and prepares it for the first question. 
     */
    public void setFirstQuestion (){
        
        //Prepare and display questionJFrame
        QuestionJFrame frame = new QuestionJFrame(); 
        frame.pack();
        frame.setVisible(true);
        
        //Set data members
        setDataMembers (frame);
        
        //Display the first question and its answers
        frame.displayText(locationText);
        frame.displayQuestion(question1, answer1A, answer1B, answer1C, answer1D);
        
    }
    
    /**
     * setDataMembers -Sets data members in QuestionJFrame object
     * @param frame -The frame object reference
     */
    public void setDataMembers (QuestionJFrame frame) {
        
        frame.setAnswers(correctAnswer1, correctAnswer2, correctAnswer3, correctAnswer4);   //Sets answers
        frame.setExplenations(explenation1, explenation2, explenation3, explenation4);      //Sets explenations
        frame.incrementQuestionNumber();                                                    //Set question number to 1
        frame.setCurrentsStart();                                                           //Set start status for room
        
        //Set data members for questions 2-4 arrays in QuestionJFrame
        frame.setQuestion2Array(question2, answer2A, answer2B, answer2C, answer2D);
        frame.setQuestion3Array(question3, answer3A, answer3B, answer3C, answer3D);
        frame.setQuestion4Array(question4, answer4A, answer4B, answer4C, answer4D);
    }   
}