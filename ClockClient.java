// **********************************************************************
// Programmer:	Erika Tvaskis
// Class:       CS30S
// Assignment:	aX qy
// Description:	a brief description of the program goes here
// Input:		describe any input from keyboard or file
// Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.time.Clock.tick;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockClient
{  // begin class
    public static void main(String args[]) throws IOException
    {  // begin main
    // ***** declaration of constants *****

    // ***** declaration of variables *****
        
    // ***** create objects *****
        
        ClockClass ClockClassTime = new ClockClass();
        ClockClassTime.setTime(0,0,0);
        ClockClass ClockClassAlarmTime = new ClockClass();
        ClockClassAlarmTime.setAlarmTime(1,15,45);
        System.out.println(ClockClassTime.toMilitary());
        System.out.println(ClockClassAlarmTime.toMilitary());
        
      
        
      //  System.out.println(ClockClassSecondsPassed.totick());

     
//        BufferedImage img=ImageIO.read(new File("C:\\Users\\Erika Tvaskis\\Desktop\\JavaInputs\\Clock.png"));
//        ImageIcon icon=new ImageIcon(img);
//        JFrame frame=new JFrame();
//        frame.setLayout(new FlowLayout());
//        frame.setSize(50,150);
//        JLabel lbl=new JLabel();
//        lbl.setIcon(icon);
//        frame.add(lbl);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

