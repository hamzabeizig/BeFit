package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculsport extends JFrame {

     
     JLabel wallcalcul , portion , x ;
     JButton confirmer ;
     JComboBox time ;
    public Calculsport() {
        getContentPane().setLayout(null);
        setSize(400, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Calcul ");



        x = new JLabel("Selectionner le temps ") ;
        x.setBounds(100,50,400,30);
        x.setForeground(new Color(0,0,0) ) ;
        x.setFont(new Font("Rockwell", 1, 20));
        getContentPane().add(x) ;

        portion = new JLabel("(minutes)") ;
        portion.setBounds(270,100,50,22);
        portion.setForeground(new Color(0,0,0) ) ;
        portion.setFont(new Font("Rockwell", 1, 10));
        getContentPane().add(portion) ;

        time = new JComboBox() ;
        add(time) ;
        time.setBounds(150,100,120,20);
        time.addItem(10);
        time.addItem(20);
        time.addItem(30);
        time.addItem(40);
        time.addItem(50);
        time.addItem(60);
        time.addItem(70);
        time.addItem(80);
        time.addItem(90);
        time.addItem(100);
        time.addItem(110);
        time.addItem(120);

        confirmer = new JButton("Confirmer") ;
        getContentPane().add(confirmer) ;
        confirmer.setBounds(150,350,100,35);
        confirmer.setForeground(new Color(250,255,255) ) ;
        confirmer.setContentAreaFilled(false);

        wallcalcul = new JLabel();
        ImageIcon imgThisImg = new ImageIcon("wallspo.jpg");
        wallcalcul.setIcon(imgThisImg);
        getContentPane().add(wallcalcul);
        wallcalcul.setBounds(0,0,400,500);
    }



   

}