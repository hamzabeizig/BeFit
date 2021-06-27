package Interface;


import javax.swing.*;

import metier.Utilisateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;


public class Produitslaitiers extends JFrame  {
    private JLabel prolai, wallplats , logo;
    String s ;
    private JButton lait  ,laitdemi , laitcreme , fromage , beurre , yaourt , oeuf , babeurre , creme ,  camembert ,back ;
    Utilisateur util ;
    public Produitslaitiers(Utilisateur util ) 
    {
        this.util=util;

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Produits laitiers");




         s="ml";
        prolai = new JLabel("Produits laitiers") ;
        prolai.setBounds(150,10,500,90);
        prolai.setForeground(new Color(255,255,0) ) ;
        prolai.setFont(new Font("Rockwell", 1, 60));
        getContentPane().add(prolai) ;

        lait = new JButton("Lait cru") ;
        getContentPane().add(lait) ;
        lait.setBounds(130,100,500,35);
        lait.setForeground(new Color(0,0,0) ) ;
        lait.setFont(new Font("Serif", 1, 25));
        lait.setOpaque(false);
        lait.setContentAreaFilled(false);
        lait.addActionListener(new Cal(this,s));

        laitdemi = new JButton("Lait demi-ecreme") ;
        getContentPane().add(laitdemi) ;
        laitdemi.setBounds(130,140,500,35);
        laitdemi.setForeground(new Color(0,0,0) ) ;
        laitdemi.setFont(new Font("Serif", 1, 25));
        laitdemi.setOpaque(false);
        laitdemi.setContentAreaFilled(false);
        laitdemi.addActionListener(new Cal(this,s));


        laitcreme = new JButton("Lait ecreme") ;
        getContentPane().add(laitcreme) ;
        laitcreme.setBounds(130,180,500,35);
        laitcreme.setForeground(new Color(0,0,0) ) ;
        laitcreme.setFont(new Font("Serif", 1, 25));
        laitcreme.setOpaque(false);
        laitcreme.setContentAreaFilled(false);
        laitcreme.addActionListener(new Cal(this,s));

       s="gramme";
        fromage = new JButton("Fromage") ;
        getContentPane().add(fromage) ;
        fromage.setBounds(130,220,500,35);
        fromage.setForeground(new Color(0,0,0) ) ;
        fromage.setFont(new Font("Serif", 1, 25));
        fromage.setOpaque(false);
        fromage.setContentAreaFilled(false);
        fromage.addActionListener(new Cal(this,s));


        beurre = new JButton("Beurre") ;
        getContentPane().add(beurre) ;
        beurre.setBounds(130,260,500,35);
        beurre.setForeground(new Color(0,0,0) ) ;
        beurre.setFont(new Font("Serif", 1, 25));
        beurre.setOpaque(false);
        beurre.setContentAreaFilled(false);
        beurre.addActionListener(new Cal(this,s));


        yaourt = new JButton("Yaourt") ;
        getContentPane().add(yaourt) ;
        yaourt.setBounds(130,300,500,35);
        yaourt.setForeground(new Color(0,0,0) ) ;
        yaourt.setFont(new Font("Serif", 1, 25));
        yaourt.setOpaque(false);
        yaourt.setContentAreaFilled(false);
        yaourt.addActionListener(new Cal(this,s ));


        oeuf = new JButton("Oeuf ") ;
        getContentPane().add(oeuf) ;
        oeuf.setBounds(130,340,500,35);
        oeuf.setForeground(new Color(0,0,0) ) ;
        oeuf.setFont(new Font("Serif", 1, 25));
        oeuf.setOpaque(false);
        oeuf.setContentAreaFilled(false);
        oeuf.addActionListener(new Cal(this,s ));


        babeurre = new JButton("Babeurre") ;
        getContentPane().add(babeurre) ;
        babeurre.setBounds(130,380,500,35);
        babeurre.setForeground(new Color(0,0,0) ) ;
        babeurre.setFont(new Font("Serif", 1, 25));
        babeurre.setOpaque(false);
        babeurre.setContentAreaFilled(false);
        babeurre.addActionListener(new Cal(this,s));


        creme = new JButton("creme") ;
        getContentPane().add(creme) ;
        creme.setBounds(130,420,500,35);
        creme.setForeground(new Color(0,0,0) ) ;
        creme.setFont(new Font("Serif", 1, 25));
        creme.setOpaque(false);
        creme.setContentAreaFilled(false);
        creme.addActionListener(new Cal(this,s ));


        camembert = new JButton("Camembert") ;
        getContentPane().add(camembert) ;
        camembert.setBounds(130,460,500,35);
        camembert.setForeground(new Color(0,0,0) ) ;
        camembert.setFont(new Font("Serif", 1, 25));
        camembert.setOpaque(false);
        camembert.setContentAreaFilled(false);
        camembert.addActionListener(new Cal(this,s));


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
        private Produitslaitiers g;
        String s ;
        public Cal(Produitslaitiers g,String s )
        {
        	this.s=s;
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

            Calcul c= new Calcul(s);
        } }
    public class Back implements ActionListener {
        private Produitslaitiers  g;
        public Back(Produitslaitiers g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
           
            Aliments c= new Aliments(util);
            g.dispose();
        } }

   /* public static void main (String[] args ) {

        Produitslaitiers pl =new Produitslaitiers () ;
    }*/
}
