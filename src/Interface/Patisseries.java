package Interface;


import javax.swing.*;

import metier.Utilisateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;


public class Patisseries extends JFrame  {
    private JLabel patt, wallplats , logo;
    private JButton painblanc ,painble , painseigle ,cookie , brownie , sables , gaufrettes , biscuits , croissant , crackers ,back ;
    Utilisateur util ;
    public Patisseries(Utilisateur util ) 
    {
        this.util = util ;  
           
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Patisseries");





        patt = new JLabel("Patisseries") ;
        patt.setBounds(250,10,400,90);
        patt.setForeground(new Color(255,255,0) ) ;
        patt.setFont(new Font("Rockwell", 1, 60));
        getContentPane().add(patt) ;

        painblanc = new JButton("Pain blanc") ;
        getContentPane().add(painblanc) ;
        painblanc.setBounds(130,100,500,35);
        painblanc.setForeground(new Color(0,0,0) ) ;
        painblanc.setFont(new Font("Serif", 1, 25));
        painblanc.setOpaque(false);
        painblanc.setContentAreaFilled(false);
        painblanc.addActionListener(new Cal(this));

        painble = new JButton("Pain de ble ") ;
        getContentPane().add(painble) ;
        painble.setBounds(130,140,500,35);
        painble.setForeground(new Color(0,0,0) ) ;
        painble.setFont(new Font("Serif", 1, 25));
        painble.setOpaque(false);
        painble.setContentAreaFilled(false);
        painble.addActionListener(new Cal(this));


        painseigle = new JButton("Pain de seigle") ;
        getContentPane().add(painseigle) ;
        painseigle.setBounds(130,180,500,35);
        painseigle.setForeground(new Color(0,0,0) ) ;
        painseigle.setFont(new Font("Serif", 1, 25));
        painseigle.setOpaque(false);
        painseigle.setContentAreaFilled(false);
        painseigle.addActionListener(new Cal(this));


        cookie = new JButton("Cookie") ;
        getContentPane().add(cookie) ;
        cookie.setBounds(130,220,500,35);
        cookie.setForeground(new Color(0,0,0) ) ;
        cookie.setFont(new Font("Serif", 1, 25));
        cookie.setOpaque(false);
        cookie.setContentAreaFilled(false);
        cookie.addActionListener(new Cal(this));


        brownie = new JButton("Brownie") ;
        getContentPane().add(brownie) ;
        brownie.setBounds(130,260,500,35);
        brownie.setForeground(new Color(0,0,0) ) ;
        brownie.setFont(new Font("Serif", 1, 25));
        brownie.setOpaque(false);
        brownie.setContentAreaFilled(false);
        brownie.addActionListener(new Cal(this));


        sables = new JButton("Sablés") ;
        getContentPane().add(sables) ;
        sables.setBounds(130,300,500,35);
        sables.setForeground(new Color(0,0,0) ) ;
        sables.setFont(new Font("Serif", 1, 25));
        sables.setOpaque(false);
        sables.setContentAreaFilled(false);
        sables.addActionListener(new Cal(this));


        gaufrettes = new JButton("Gaufrettes") ;
        getContentPane().add(gaufrettes) ;
        gaufrettes.setBounds(130,340,500,35);
        gaufrettes.setForeground(new Color(0,0,0) ) ;
        gaufrettes.setFont(new Font("Serif", 1, 25));
        gaufrettes.setOpaque(false);
        gaufrettes.setContentAreaFilled(false);
        gaufrettes.addActionListener(new Cal(this));


        biscuits = new JButton("Biscuits") ;
        getContentPane().add(biscuits) ;
        biscuits.setBounds(130,380,500,35);
        biscuits.setForeground(new Color(0,0,0) ) ;
        biscuits.setFont(new Font("Serif", 1, 25));
        biscuits.setOpaque(false);
        biscuits.setContentAreaFilled(false);
        biscuits.addActionListener(new Cal(this));


        croissant = new JButton("Croissant") ;
        getContentPane().add(croissant) ;
        croissant.setBounds(130,420,500,35);
        croissant.setForeground(new Color(0,0,0) ) ;
        croissant.setFont(new Font("Serif", 1, 25));
        croissant.setOpaque(false);
        croissant.setContentAreaFilled(false);
        croissant.addActionListener(new Cal(this));


        crackers = new JButton("Crackers") ;
        getContentPane().add(crackers) ;
        crackers.setBounds(130,460,500,35);
        crackers.setForeground(new Color(0,0,0) ) ;
        crackers.setFont(new Font("Serif", 1, 25));
        crackers.setOpaque(false);
        crackers.setContentAreaFilled(false);
        crackers.addActionListener(new Cal(this));


        back = new JButton();
        back.setIcon(new ImageIcon("back1.png"));
        back.setBounds(30,20,80,70);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        getContentPane().add(back);
        back.addActionListener(new Back(this));

        logo = new JLabel();
        ImageIcon log = new ImageIcon("logoo99.png");
        logo.setIcon(log);
        getContentPane().add(logo);
        logo.setBounds(650,450,508,200);

        wallplats = new JLabel();
        ImageIcon imgThisImg = new ImageIcon("wallplats.jpg");
        wallplats.setIcon(imgThisImg);
        getContentPane().add(wallplats);
        wallplats.setBounds(0,0,750,600);



    }


    public class Cal implements ActionListener {
        private Patisseries g;
        public Cal(Patisseries g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
         String s ="gramme";
            Calcul c= new Calcul(s);
        } }
    public class Back implements ActionListener {
        private Patisseries  g;
        public Back(Patisseries g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
            
            Aliments c= new Aliments(util);
            g.dispose();
        } }


   /* public static void main (String[] args ) {

        Patisseries pat =new Patisseries () ;
    }*/
}
