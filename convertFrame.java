

/*Import java*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class convertFrame extends JFrame {

    convertFrame(){
        /*MAke frame with title*/
        JFrame frame = new JFrame("Converter");
        /*Display label*/
        JLabel Fah_temp = new JLabel();
        Fah_temp.setText("Enter temperature in Fahrenheit: ");
        /*Make a text field*/
        JTextField Temp = new JTextField(5);
        JButton button,button1;
        /*Make convert button*/
        button = new JButton("Convert");
        JLabel Cel_temp= new JLabel();
        Cel_temp.setText("Temperature in Celsius: ");
        JLabel Temp_cel= new JLabel();
        JLabel Inch_length= new JLabel();
        Inch_length.setText("Enter length in inch: ");
        JTextField Length = new JTextField(5);
        /*Make convert button for centimeter*/
        button1 = new JButton("Convert");
        JLabel Centi_len = new JLabel();
        Centi_len.setText("Length in centimeter: ");
        JLabel Length_in_centi = new JLabel();
        /*Add elements to frame*/ 
        frame.add(Fah_temp);
        frame.add(Temp);
        frame.add(button);
        frame.add(Cel_temp);
        frame.add(Temp_cel);
        frame.add(Inch_length);
        frame.add(Length);
        frame.add(button1);
        frame.add(Centi_len);
        frame.add(Length_in_centi);
        /*Set FlowLayout*/
        frame.setLayout(new FlowLayout());
        /*Set Location of window*/
        frame.setLocation(600, 400);
        /*Set Size of Window*/
        frame.setSize(550, 180);
        /*Set frame to be visble*/
        frame.setVisible(true);

        /*Add action listener for temp convert button*/
         button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                   String temp;
                   temp = Temp.getText();
                   float Fah_temp;
                   /*Convert string to float*/
                   Fah_temp = Float.valueOf(temp);
                   float CelTemp;
                   /*Calc the celsius temp*/
                   CelTemp = ((Fah_temp - 32)*5)/9;
                   String cel_temp = String.format("%.2s", CelTemp);
                   Temp_cel.setText(cel_temp);             
            } 
         });
         /*Add action listener for Lenght convert button*/
         button1.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent arg0) {
                /*Get length from text field*/
                String length;
                length = Length.getText();
                float inch_length;
                /*Calc centimeter from inch*/
                inch_length = Float.valueOf(length);
                float centi;
                centi = (float) (inch_length * 2.54);
                String centimeter = String.format("%.2f", centi);
                /*Print results*/
                Length_in_centi.setText(centimeter);
             }
         });
         /*Add action listener for temp text field*/
         Temp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                    String temp;
                    temp = Temp.getText();
                    float Fah_temp;
                    /*Convert string to float*/
                    Fah_temp = Float.valueOf(temp);
                    float CelTemp;
                    /*Calc the celsius temp*/
                    CelTemp = ((Fah_temp - 32)*5)/9;
                    String cel_temp = String.format("%.2s", CelTemp);
                    Temp_cel.setText(cel_temp); 
                  } 
         });
        /*Add action listener for length text field*/
        Length.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    /*Get length from text field*/
                    String length;
                    length = Length.getText();
                    float inch_length;
                    /*Calc centimeter from inch*/
                    inch_length = Float.valueOf(length);
                    float centi;
                    centi = (float) (inch_length * 2.54);
                    String centimeter = String.format("%.2f", centi);
                    /*Print results*/
                    Length_in_centi.setText(centimeter);
                  } 
         });
    }
        /*Main class*/
        public static void main(String[] args) {
            /*Creates new frame*/
            new convertFrame(); 
        }
    }
/*@Dustin Nguyen*/
/**/