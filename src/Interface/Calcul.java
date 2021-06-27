package Interface;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcul extends JFrame {

             JTextField area ;
             JLabel wallcalcul , portion , x ;
             JButton confirmer ;
    public Calcul(String s ) {
        getContentPane().setLayout(null);
        setSize(450, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Calcul ");

        area = new JTextField();
        area.setBounds(50,120,150,20);
        getContentPane().add(area);

        x = new JLabel("x") ;
        x.setBounds(230,120,60,20);
        x.setForeground(new Color(0,0,0) ) ;
        x.setFont(new Font("Rockwell", 1, 20));
        getContentPane().add(x) ;

        portion = new JLabel(s) ;
        portion.setBounds(300,120,100,22);
        portion.setForeground(new Color(0,0,0) ) ;
        portion.setFont(new Font("Rockwell", 1, 20));
        getContentPane().add(portion) ;

        confirmer = new JButton("Confirmer") ;
        getContentPane().add(confirmer) ;
        confirmer.setBounds(120,180,200,35);
        confirmer.setForeground(new Color(0,0,0) ) ;
        confirmer.setContentAreaFilled(false);

        wallcalcul = new JLabel();
        ImageIcon imgThisImg = new ImageIcon("wallcalcul.jpeg");
        wallcalcul.setIcon(imgThisImg);
        getContentPane().add(wallcalcul);
        wallcalcul.setBounds(0,0,450,300);
    }



       

}