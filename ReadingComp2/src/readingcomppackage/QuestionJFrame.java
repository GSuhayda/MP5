/*
 * QuestionJFrame definition 
 */
package readingcomppackage;

import javax.swing.JOptionPane;

/**
 * QuestionJFrame -Swing frame that shows the questions and answers for the questions for each room.
 *      It governs the switching between questions. 
 * @author Gregory Fritts
 */
public class QuestionJFrame extends javax.swing.JFrame {

    //Constants 
    private final int ANSWER_A_NUMBER = 1;      //Constant that represents answer A
    private final int ANSWER_B_NUMBER = 2;      //Constant that represents answer B
    private final int ANSWER_C_NUMBER = 3;      //Constant that represents answer C
    private final int ANSWER_D_NUMBER = 4;      //Constant that represents answer D
    
    //Data members 
    private int correctAnswer1;     //Integer that has the correct answer for question 1
    private int correctAnswer2;     //Integer that has the correct answer for question 2
    private int correctAnswer3;     //Integer that has the correct answer for question 3
    private int correctAnswer4;     //Integer that has the correct answer for question 4
    
    private String explenation1;    //Explenation for question 1
    private String explenation2;    //Explenation for question 2
    private String explenation3;    //Explenation for question 3
    private String explenation4;    //Explenation for question 4
    
    private int questionNumber;             //Stores which question number it is
    private int correctAnswerCurrent;       //Holds current correct answer
    private String currentExplenation;      //Holds current explenation 
    
    private String[] question2;     //Holds question and answers for question 2
    private String[] question3;     //Holds question and answers for question 3
    private String[] question4;     //Holds question and answers for question 4
    
    /**
     * Creates new form QuestionJFrame
     */
    public QuestionJFrame() {
        
        initComponents();
        questionNumber = 0;     //Set question number to zero to start  
    }
    
    /**
     * displayText -Displays the text for the room. 
     * @param roomText -A string that contains the text to be display for the room. All questions
     *   are based on this text. 
     */
    public void displayText(String roomText){
        locationTextField.setText(roomText);        //Display text for the room
    }
    
    /**
     * dispalyQuestion -Displays the question and the answers. 
     * @param question -String that holds the question.
     * @param answerA  -String that holds answer choice A
     * @param answerB  -String that holds answer choice B
     * @param answerC  -String that holds answer choice C
     * @param answerD  -String that holds answer choice D 
     */
    public void displayQuestion(String question, String answerA, String answerB, String answerC, String answerD) {
        
        //Display question and answer choices 
        questionTextField.setText(question);
        answerALabel.setText(answerA);
        answerBLabel.setText(answerB);
        answerCLabel.setText(answerC);
        answerDLabel.setText(answerD);
    }
    
    /**
     * setAnswers -Sets the answers for each question
     * @param correctAnswer1 -Integer holding answer for question 1
     * @param correctAnswer2 -Integer holding answer for question 2
     * @param correctAnswer3 -Integer holding answer for question 3
     * @param correctAnswer4 -Integer holding answer for question 4
     */
    public void setAnswers (int correctAnswer1, int correctAnswer2, int correctAnswer3, int correctAnswer4) {
       
        //Set input answers to instance variables for storage and recall
        this.correctAnswer1 = correctAnswer1;         
        this.correctAnswer2 = correctAnswer2; 
        this.correctAnswer3 = correctAnswer3;
        this.correctAnswer4 = correctAnswer4; 
    }
    
    /**
     * setExplenations -Sets the explenations for each question. 
     * @param explenation1  -String holding explenation 1
     * @param explenation2  -String holding explenation 2
     * @param explenation3  -String holding explenation 3
     * @param explenation4  -String holding explenation 4
     */
    public void setExplenations(String explenation1, String explenation2, String explenation3, String explenation4) {
        
        //Set expleantion data members
        this.explenation1 = explenation1;
        this.explenation2 = explenation2; 
        this.explenation3 = explenation3; 
        this.explenation4 = explenation4;  
    }
    
    /**
     * setQuestion2Array -Sets array to hold data members needed for question 2
     * @param question2 -String holding question 2.
     * @param answer2A  -String holding answer choice A for question 2.
     * @param answer2B  -String holding answer choice B for question 2.
     * @param answer2C  -String holding answer choice C for question 2.
     * @param answer2D  -String holding answer choice D for question 2.
     */
    public void setQuestion2Array(String question2, String answer2A, String answer2B, String answer2C, String answer2D) {
        
        //Read in data members and store to question 2 data member array
        this.question2[0] = question2; 
        this.question2[1] = answer2A;
        this.question2[2] = answer2B;
        this.question2[3] = answer2C;
        this.question2[4] = answer2D;
    }
    
    /**
     * setQuestion3Array -Sets array to hold data members needed for question 3
     * @param question3 -String holding question 3.
     * @param answer3A  -String holding answer choice A for question 3.
     * @param answer3B  -String holding answer choice B for question 3.
     * @param answer3C  -String holding answer choice C for question 3.
     * @param answer3D  -String holding answer choice D for question 3.
     */
    public void setQuestion3Array(String question3, String answer3A, String answer3B, String answer3C, String answer3D) {
       
        //Read in data members and store to question 3 data member array
        this.question3[0] = question3;
        this.question3[1] = answer3A;
        this.question3[2] = answer3B;
        this.question3[3] = answer3C;
        this.question3[4] = answer3D;
    }
    
    /**
     * setQuestion4Array -Sets array to hold data members needed for question 4
     * @param question4 -String holding question 4.
     * @param answer4A  -String holding answer choice A for question 4.
     * @param answer4B  -String holding answer choice B for question 4.
     * @param answer4C  -String holding answer choice C for question 4.
     * @param answer4D  -String holding answer choice D for question 4. 
     */
    public void setQuestion4Array(String question4, String answer4A, String answer4B, String answer4C, String answer4D) {
       
        //Read in data members and store to question 4 data member array
        this.question4[0] = question4;
        this.question4[1] = answer4A;
        this.question4[2] = answer4B;
        this.question4[3] = answer4C;
        this.question4[4] = answer4D;
    }
    
    /**
     * incrementQuestionNumber -Increments question number to keep track of which question is current.
     */
    public void incrementQuestionNumber () {
        this.questionNumber++; 
    }
        
    /**
     * setCurrentStart -Sets the current answer and explenation to the start at question 1.
     */
    public void setCurrentsStart (){
        
        this.correctAnswerCurrent = this.correctAnswer1; 
        this.currentExplenation = this.explenation1; 
    }
    
    /**
     * answerSelected -Runs if an answer is selected, determines if it is correct or not. 
     *                  The method then determines the appropriate course of action.
     * @param answer -An integer that corresponds to the selected answer A-D, 1-4 respectively. 
     */
    public void answerSelected(int answer) {
        
        //Correct answer selected, but not question 4
        if (this.correctAnswerCurrent == answer && this.questionNumber != 4) {
            correctAnswer();
        }
        
        //Incorrect answer selected
        if (this.correctAnswerCurrent != answer){
            incorrectAnswer(); 
        }
        
        //Correct answer selected, question 4
        if (this.correctAnswerCurrent == answer && this.questionNumber == 4) {
            JOptionPane.showMessageDialog(null, "Good job, that is correct. You have completed this room.");    //Display message
            setVisible(false);      //Close room frame
        }
    }   
    
    /**
     * correctAnswer -Runs when answer is correct, displays correct dialog and prepares
     * frame for next question.
     */
    public void correctAnswer() {
        
        JOptionPane.showMessageDialog(null, "Good job, that is correct.");      //Display correct message
        nextQuestion();                                                         //Setup for next question 
    }

    /**
     * nextQuestion -Loads data members and displays next question's texts. 
     */
    public void nextQuestion () {
        
        incrementQuestionNumber();          //Move to next question
        
        //Setup question 2
        if (this.questionNumber == 2) {
            displayQuestion(this.question2[0], this.question2[1], this.question2[2], this.question2[3], this.question2[4]);     //Copy in data members
            explenationTextField.setText("");       //Clear explenation field
        }
        
        //Setup question 3
        if (this.questionNumber == 3) {
            displayQuestion(this.question3[0], this.question3[1], this.question3[2], this.question3[3], this.question3[4]);     //Copy in data members
            explenationTextField.setText("");       //Clear explenation field
        }
        
        //Setup question 4 
        if (this.questionNumber == 4) {
            displayQuestion(this.question4[0], this.question4[1], this.question4[2], this.question4[3], this.question4[4]);     //Copy in data members
            explenationTextField.setText("");       //Clear explenation field
        }
    }
    
    /**
     * incorrectAnswer -Displays dialog prompting user to try again. 
     */
    public void incorrectAnswer (){
        
        JOptionPane.showMessageDialog(null,"Please try again, view hint if necessary.");
        explenationTextField.setText(currentExplenation);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        locationNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        locationTextField = new javax.swing.JTextArea();
        selectAnswerLabel = new javax.swing.JLabel();
        answerAButton = new javax.swing.JButton();
        answerBButton = new javax.swing.JButton();
        answerCButton = new javax.swing.JButton();
        answerDButton = new javax.swing.JButton();
        questionLabel = new javax.swing.JLabel();
        aLabel = new javax.swing.JLabel();
        bLabel = new javax.swing.JLabel();
        cLabel = new javax.swing.JLabel();
        dLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        hintLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        explenationTextField = new javax.swing.JTextArea();
        answerALabel = new javax.swing.JLabel();
        answerBLabel = new javax.swing.JLabel();
        answerCLabel = new javax.swing.JLabel();
        answerDLabel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        questionTextField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Questions");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(890, 650));
        getContentPane().setLayout(null);

        locationNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        locationNameLabel.setText("Location Name");
        getContentPane().add(locationNameLabel);
        locationNameLabel.setBounds(10, 11, 249, 29);

        locationTextField.setEditable(false);
        locationTextField.setColumns(20);
        locationTextField.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        locationTextField.setRows(5);
        locationTextField.setWrapStyleWord(true);
        jScrollPane1.setViewportView(locationTextField);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 840, 180);

        selectAnswerLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectAnswerLabel.setText("Select Answer");
        getContentPane().add(selectAnswerLabel);
        selectAnswerLabel.setBounds(730, 280, 110, 22);

        answerAButton.setText("Answer A");
        answerAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerAButtonActionPerformed(evt);
            }
        });
        getContentPane().add(answerAButton);
        answerAButton.setBounds(750, 320, 90, 23);

        answerBButton.setText("Answer B");
        answerBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerBButtonActionPerformed(evt);
            }
        });
        getContentPane().add(answerBButton);
        answerBButton.setBounds(750, 370, 90, 23);

        answerCButton.setText("Answer C");
        answerCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerCButtonActionPerformed(evt);
            }
        });
        getContentPane().add(answerCButton);
        answerCButton.setBounds(750, 420, 90, 23);

        answerDButton.setText("Answer D");
        answerDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerDButtonActionPerformed(evt);
            }
        });
        getContentPane().add(answerDButton);
        answerDButton.setBounds(750, 470, 90, 23);

        questionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        questionLabel.setText("Question:");
        getContentPane().add(questionLabel);
        questionLabel.setBounds(10, 280, 80, 22);

        aLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aLabel.setText("A:");
        getContentPane().add(aLabel);
        aLabel.setBounds(10, 330, 20, 22);

        bLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bLabel.setText("B:");
        getContentPane().add(bLabel);
        bLabel.setBounds(10, 380, 20, 22);

        cLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cLabel.setText("C:");
        getContentPane().add(cLabel);
        cLabel.setBounds(10, 430, 40, 22);

        dLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dLabel.setText("D:");
        getContentPane().add(dLabel);
        dLabel.setBounds(10, 470, 40, 22);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 358, 830, 2);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 410, 830, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 460, 830, 20);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(10, 310, 830, 10);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(10, 500, 830, 2);

        hintLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hintLabel.setText("Hint:");
        getContentPane().add(hintLabel);
        hintLabel.setBounds(10, 510, 70, 22);

        explenationTextField.setColumns(20);
        explenationTextField.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        explenationTextField.setRows(2);
        explenationTextField.setWrapStyleWord(true);
        jScrollPane2.setViewportView(explenationTextField);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 510, 790, 60);

        answerALabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(answerALabel);
        answerALabel.setBounds(40, 320, 700, 30);

        answerBLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(answerBLabel);
        answerBLabel.setBounds(40, 380, 700, 20);

        answerCLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(answerCLabel);
        answerCLabel.setBounds(40, 430, 700, 20);

        answerDLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(answerDLabel);
        answerDLabel.setBounds(40, 470, 700, 30);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(30, 310, 10, 190);

        questionTextField.setColumns(20);
        questionTextField.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        questionTextField.setRows(2);
        jScrollPane3.setViewportView(questionTextField);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(100, 250, 610, 56);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answerAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerAButtonActionPerformed
        answerSelected(ANSWER_A_NUMBER);
    }//GEN-LAST:event_answerAButtonActionPerformed

    private void answerBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerBButtonActionPerformed
        answerSelected(ANSWER_B_NUMBER);
    }//GEN-LAST:event_answerBButtonActionPerformed

    private void answerCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerCButtonActionPerformed
        answerSelected(ANSWER_C_NUMBER);
    }//GEN-LAST:event_answerCButtonActionPerformed

    private void answerDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerDButtonActionPerformed
        answerSelected(ANSWER_D_NUMBER);
    }//GEN-LAST:event_answerDButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aLabel;
    private javax.swing.JButton answerAButton;
    private javax.swing.JLabel answerALabel;
    private javax.swing.JButton answerBButton;
    private javax.swing.JLabel answerBLabel;
    private javax.swing.JButton answerCButton;
    private javax.swing.JLabel answerCLabel;
    private javax.swing.JButton answerDButton;
    private javax.swing.JLabel answerDLabel;
    private javax.swing.JLabel bLabel;
    private javax.swing.JLabel cLabel;
    private javax.swing.JLabel dLabel;
    private javax.swing.JTextArea explenationTextField;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel locationNameLabel;
    private javax.swing.JTextArea locationTextField;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JTextArea questionTextField;
    private javax.swing.JLabel selectAnswerLabel;
    // End of variables declaration//GEN-END:variables
}
