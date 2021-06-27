package Interface;


import javax.swing.*;

import metier.Utilisateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;


public class Fastfood extends JFrame  {
    private JLabel fastf, wallplats , logo;
    private JButton  hamburger , sandiwch ,  sandwichvegetarien ,pizza , calzoni , sushi , frites , tacos , hotdogs , leblebi ,back ;
    
    Utilisateur util ;
    public Fastfood(Utilisateur util)
    {
        this.util=util;
 
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Fast food");





        fastf = new JLabel("Fast food") ;
        fastf.setBounds(250,10,400,90);
        fastf.setForeground(new Color(255,255,0) ) ;
        fastf.setFont(new Font("Rockwell", 1, 60));
        getContentPane().add(fastf) ;

        hamburger = new JButton("Hamburger") ;
        getContentPane().add(hamburger) ;
        hamburger.setBounds(130,100,500,35);
        hamburger.setForeground(new Color(0,0,0) ) ;
        hamburger.setFont(new Font("Serif", 1, 25));
        hamburger.setOpaque(false);
        hamburger.setContentAreaFilled(false);
        hamburger.addActionListener(new Cal(this));

        sandiwch = new JButton("Sandiwch") ;
        getContentPane().add(sandiwch) ;
        sandiwch.setBounds(130,140,500,35);
        sandiwch.setForeground(new Color(0,0,0) ) ;
        sandiwch.setFont(new Font("Serif", 1, 25));
        sandiwch.setOpaque(false);
        sandiwch.setContentAreaFilled(false);
        sandiwch.addActionListener(new Cal(this));


        sandwichvegetarien = new JButton("Sandwich vegetarien") ;
        getContentPane().add(sandwichvegetarien) ;
        sandwichvegetarien.setBounds(130,180,500,35);
        sandwichvegetarien.setForeground(new Color(0,0,0) ) ;
        sandwichvegetarien.setFont(new Font("Serif", 1, 25));
        sandwichvegetarien.setOpaque(false);
        sandwichvegetarien.setContentAreaFilled(false);
        sandwichvegetarien.addActionListener(new Cal(this));


        pizza = new JButton("Pizza") ;
        getContentPane().add(pizza) ;
        pizza.setBounds(130,220,500,35);
        pizza.setForeground(new Color(0,0,0) ) ;
        pizza.setFont(new Font("Serif", 1, 25));
        pizza.setOpaque(false);
        pizza.setContentAreaFilled(false);
        pizza.addActionListener(new Cal(this));


        calzoni = new JButton("Calzoni") ;
        getContentPane().add(calzoni) ;
        calzoni.setBounds(130,260,500,35);
        calzoni.setForeground(new Color(0,0,0) ) ;
        calzoni.setFont(new Font("Serif", 1, 25));
        calzoni.setOpaque(false);
        calzoni.setContentAreaFilled(false);
        calzoni.addActionListener(new Cal(this));


        sushi = new JButton("Sushi") ;
        getContentPane().add(sushi) ;
        sushi.setBounds(130,300,500,35);
        sushi.setForeground(new Color(0,0,0) ) ;
        sushi.setFont(new Font("Serif", 1, 25));
        sushi.setOpaque(false);
        sushi.setContentAreaFilled(false);
        sushi.addActionListener(new Cal(this));


        frites = new JButton("Frites") ;
        getContentPane().add(frites) ;
        frites.setBounds(130,340,500,35);
        frites.setForeground(new Color(0,0,0) ) ;
        frites.setFont(new Font("Serif", 1, 25));
        frites.setOpaque(false);
        frites.setContentAreaFilled(false);
        frites.addActionListener(new Cal(this));


        tacos = new JButton("tacos ") ;
        getContentPane().add(tacos) ;
        tacos.setBounds(130,380,500,35);
        tacos.setForeground(new Color(0,0,0) ) ;
        tacos.setFont(new Font("Serif", 1, 25));
        tacos.setOpaque(false);
        tacos.setContentAreaFilled(false);
        tacos.addActionListener(new Cal(this));


        hotdogs = new JButton("Hot dogs") ;
        getContentPane().add(hotdogs) ;
        hotdogs.setBounds(130,420,500,35);
        hotdogs.setForeground(new Color(0,0,0) ) ;
        hotdogs.setFont(new Font("Serif", 1, 25));
        hotdogs.setOpaque(false);
        hotdogs.setContentAreaFilled(false);
        hotdogs.addActionListener(new Cal(this));


        leblebi = new JButton("Leblebi") ;
        getContentPane().add(leblebi) ;
        leblebi.setBounds(130,460,500,35);
        leblebi.setForeground(new Color(0,0,0) ) ;
        leblebi.setFont(new Font("Serif", 1, 25));
        leblebi.setOpaque(false);
        leblebi.setContentAreaFilled(false);
        leblebi.addActionListener(new Cal(this));


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
        private Fastfood g;
        public Cal(Fastfood g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
    String s ="gramme";
            Calcul c= new Calcul(s);
        } }
    public class Back implements ActionListener {
        private Fastfood  g;
        public Back(Fastfood g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
          
            Aliments c= new Aliments(util);
            g.dispose();
        } }

   /* public static void main (String[] args ) {

        Fastfood ff =new Fastfood () ;
    }*/
}
