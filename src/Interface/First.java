package Interface;
import javax.swing.*;

import metier.Utilisateur;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class First extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton insri ;
    private JButton connect ;
    private JLabel  wallinscri ;
    private JLabel logo ;
    private JLabel quote ;
    private JLabel quote2 ;
   static  Utilisateur util ;
    public First () {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Be Fit ");
     
        logo = new JLabel();
        ImageIcon log = new ImageIcon("logoo.png");
        logo.setIcon(log);
        getContentPane().add(logo);
        logo.setBounds(0,70,508,200);


        insri= new JButton("Inscription") ;
        ImageIcon inscrii = new ImageIcon("iscri11.png");
        getContentPane().add(insri) ;
        insri.setIcon(inscrii);
        insri.setBounds(300,400,220,80);
        insri.setForeground(new Color(0,0,0) ) ;
        insri.setFont(new Font("Calibri",2,20));
        insri.setOpaque(false);
        insri.setContentAreaFilled(false);
        insri.addActionListener(new Inscri(this));


        connect= new JButton("Se connecter") ;
        ImageIcon connecter = new ImageIcon("connect11.png");
        getContentPane().add(connect) ;
        connect.setIcon(connecter);
        connect.setBounds(50,400,220,80);
        connect.setForeground(new Color(0,0,0) ) ;
        connect.setFont(new Font("Calibri",2,20));
        connect.setOpaque(false);
        connect.setContentAreaFilled(false);
        connect.addActionListener(new Connect(this));

        quote = new JLabel("YOU DON'T HAVE TO EAT LESS ...") ;
        quote.setBounds(45,250,600,30);
        quote.setForeground(new Color(150,200,170) ) ;
        quote.setFont(new Font("Pristina", 1, 25));
        getContentPane().add(quote) ;
        
        
        
        quote2 = new JLabel(" YOU JUST HAVE TO EAT RIGHT ..." ) ;
        quote2.setBounds(40,290,600,30);
        quote2.setForeground(new Color(150,200 ,170) ) ;
        quote2.setFont(new Font("Pristina", 1, 25));
        getContentPane().add(quote2) ;



        wallinscri = new JLabel();
        ImageIcon imgThisImg = new ImageIcon("wallinscri.jpg");
        wallinscri.setIcon(imgThisImg);
        getContentPane().add(wallinscri);
        wallinscri.setBounds(0,0,750,600);


    }
    public class Inscri implements ActionListener {
        private First g;
        public Inscri(First g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
            
            Inscription c= new Inscription(util);
            g.dispose();
        } }
    public class Connect implements ActionListener {
        private First g;
        public Connect(First g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

           Connecter c= new Connecter(util);
            g.dispose();
        } }
    public static void main (String [] args){
        First f1 = new First() ;
    }
}

