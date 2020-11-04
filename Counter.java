 import java.awt.*; 
 import java.awt.event.*;
 import javax.swing.*;

 public class Counter implements ActionListener {
   JLabel label;
   
   JLabel leftLabel = new JLabel ("left");
   JLabel rightLabel = new JLabel ("right");

   JCount leftCount = new JCount ("left");
   JCount rightCount = new JCount ("right");

   Counter ();
   JFrame frame = new JFrame ("Let's count!");
   frame.setLayout(new FLowLayout());
   frame.setSize (200,110);

   JButton left = new JButton ("Left");
   JButton right = new JButton ("Right");
   //don't know how to initalize to 0
   
   Left.addActionListener(this);
   Right.addActionListener(this);

   frame.add(Left);
   frame.add(Right);
   //don't know how to initialize leftLabel with the text "Count" + the left/right count variable

   frame.add(leftLabel);
   frame.add(rightLabel);

   JButton reset = new JButton ("Reset");
   reset.addActionListener(this);
   frame.add(reset);
   frame.setVisible(true);

   public void actionPerformed (ActionEvent  ae) {
     if (ae.getActionCommand().equals("Left")) {
          leftLabel.setText("Add one");
        if (ae.getActionCommand().equals ("Right")) {
          rightLabel.setText ("Add one");
        if (ae.getActionCommand().equals("Reset")) {
          resetlabel.setText ("0");
        }
      }
     }
   }
      //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //code won't run, I'm not sure why besides not adding in the initializtions and the increases/reset at the end. I don't understand what the console window is computing. No matter if I only try to run a small amount of this code, it still computes the same information as if I try to run the full code

 }