package Interface;
import javax.swing.*;

import metier.*;
import metier.Utilisateur;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sport extends JFrame {

    private JLabel wallsport  ;
    private JLabel sports ;
    private JButton foot ;
    private JButton hand ;
    private JButton basket ;
    private JButton volley ;
    private JButton tennis ;
    private JButton marche ;
    private JButton velo ;
    private JButton nataion ;
    private JButton dance ;
    private JButton judo ;
    private JButton course ;
    private JButton box ;
    private JButton gym ;
    private JButton musculation ;
    private JLabel logo ;
    private JButton back ;
    Utilisateur util ;

     public Sport (Utilisateur util) {
    	 this.util=util;
     setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
     getContentPane().setLayout(null);
     setSize(750 , 600);
     setLocationRelativeTo(null);
     setResizable(false);
     setVisible(true);
     setTitle("Be Fit ");

     sports = new JLabel("Sports") ;
     sports.setBounds(100,10,400,90);
     sports.setForeground(new Color(157,157,157) ) ;
     sports.setFont(new Font("Rockwell", 1, 60));
     getContentPane().add(sports) ;

        marche = new JButton("Marche") ;
        ImageIcon marches = new ImageIcon("marche.png");
        getContentPane().add(marche) ;
        marche.setIcon(marches);
        marche.setBounds(10,130,150,50);
        marche.setForeground(new Color(0,0,0) ) ;
        marche.setFont(new Font("Serif", 1, 15));
        marche.setOpaque(false);
        marche.setContentAreaFilled(false);
        marche.addActionListener(new Calspo(this));


         velo = new JButton("Velo") ;
        ImageIcon velos = new ImageIcon("velo.png");
        getContentPane().add(velo) ;
        velo.setIcon(velos);
        velo.setBounds(180,130,150,50);
        velo.setForeground(new Color(0,0,0) ) ;
        velo.setFont(new Font("Serif", 1, 15));
        velo.setOpaque(false);
        velo.setContentAreaFilled(false);
        velo.addActionListener(new Calspo(this));

        foot = new JButton("Football") ;
        ImageIcon football = new ImageIcon("foot.png");
        getContentPane().add(foot) ;
        foot.setIcon(football);
        foot.setBounds(10,190,150,50);
        foot.setForeground(new Color(0,0,0) ) ;
        foot.setFont(new Font("Serif", 1, 15));
        foot.setOpaque(false);
        foot.setContentAreaFilled(false);
        foot.addActionListener(new Calspo(this));


        hand = new JButton("Handball") ;
        ImageIcon handball = new ImageIcon("hand.png");
        getContentPane().add(hand) ;
        hand.setIcon(handball);
        hand.setBounds(180,190,150,50);
        hand.setForeground(new Color(0,0,0) ) ;
        hand.setFont(new Font("Serif", 1, 15));
        hand.setOpaque(false);
        hand.setContentAreaFilled(false);
        hand.addActionListener(new Calspo(this));


         basket = new JButton("Basketball") ;
        ImageIcon basketball = new ImageIcon("basket.png");
        getContentPane().add(basket) ;
        basket.setIcon(basketball);
        basket.setBounds(10,250,150,50);
        basket.setForeground(new Color(0,0,0) ) ;
        basket.setFont(new Font("Serif", 1, 15));
        basket.setOpaque(false);
        basket.setContentAreaFilled(false);
        basket.addActionListener(new Calspo(this));


         volley = new JButton("Volleyball") ;
         ImageIcon volleyball = new ImageIcon("volley.png");
         getContentPane().add(volley) ;
         volley.setIcon(volleyball);
         volley.setBounds(180,250,150,50);
         volley.setForeground(new Color(0,0,0) ) ;
         volley.setFont(new Font("Serif", 1, 15));
         volley.setOpaque(false);
         volley.setContentAreaFilled(false);
         volley.addActionListener(new Calspo(this));


         tennis = new JButton("Tennis") ;
         ImageIcon tenis = new ImageIcon("tennis.png");
         getContentPane().add(tennis) ;
         tennis.setIcon(tenis);
         tennis.setBounds(10,310,150,50);
         tennis.setForeground(new Color(0,0,0) ) ;
         tennis.setFont(new Font("Serif", 1, 15));
         tennis.setOpaque(false);
         tennis.setContentAreaFilled(false);
         tennis.addActionListener(new Calspo(this));

         nataion = new JButton("Natation") ;
         ImageIcon natations = new ImageIcon("natation.png");
         getContentPane().add(nataion) ;
         nataion.setIcon(natations);
         nataion.setBounds(180,310,150,50);
         nataion.setForeground(new Color(0,0,0) ) ;
         nataion.setFont(new Font("Serif", 1, 15));
         nataion.setOpaque(false);
         nataion.setContentAreaFilled(false) ;
         nataion.addActionListener(new Calspo(this));


         box = new JButton("Boxe") ;
         ImageIcon boxe = new ImageIcon("box.png");
         getContentPane().add(box) ;
         box.setIcon(boxe);
         box.setBounds(10,370,150,50);
         box.setForeground(new Color(0,0,0) ) ;
         box.setFont(new Font("Serif", 1, 15));
         box.setOpaque(false);
         box.setContentAreaFilled(false) ;
         box.addActionListener(new Calspo(this));


         dance = new JButton("Dance") ;
         ImageIcon dancing = new ImageIcon("dance.png");
         getContentPane().add(dance) ;
         dance.setIcon(dancing);
         dance.setBounds(180,370,150,50);
         dance.setForeground(new Color(0,0,0) ) ;
         dance.setFont(new Font("Serif", 1, 15));
         dance.setOpaque(false);
         dance.setContentAreaFilled(false) ;
         dance.addActionListener(new Calspo(this));


         judo = new JButton("Judo") ;
         ImageIcon judos = new ImageIcon("judo.png");
         getContentPane().add(judo) ;
         judo.setIcon(judos);
         judo.setBounds(10,430,150,50);
         judo.setForeground(new Color(0,0,0) ) ;
         judo.setFont(new Font("Serif", 1, 15));
         judo.setOpaque(false);
         judo.setContentAreaFilled(false) ;
         judo.addActionListener(new Calspo(this));


         course = new JButton("Course") ;
         ImageIcon courses = new ImageIcon("course.png");
         getContentPane().add(course) ;
         course.setIcon(courses);
         course.setBounds(180,430,150,50);
         course.setForeground(new Color(0,0,0) ) ;
         course.setFont(new Font("Serif", 1, 15));
         course.setOpaque(false);
         course.setContentAreaFilled(false) ;
         course.addActionListener(new Calspo(this));


         gym = new JButton("Gymnastique") ;
        ImageIcon gymm = new ImageIcon("gym.png");
        getContentPane().add(gym) ;
        gym.setIcon(gymm);
        gym.setBounds(10,490,150,50);
        gym.setForeground(new Color(0,0,0) ) ;
        gym.setFont(new Font("Serif", 1, 14));
        gym.setOpaque(false);
        gym.setContentAreaFilled(false);
        gym.addActionListener(new Calspo(this));


         musculation = new JButton("Musculation") ;
         ImageIcon muscle = new ImageIcon("musculation.png");
         getContentPane().add(musculation) ;
         musculation.setIcon(muscle);
         musculation.setBounds(180,490,150,50);
         musculation.setForeground(new Color(0,0,0) ) ;
         musculation.setFont(new Font("Serif", 1, 15));
         musculation.setOpaque(false);
         musculation.setContentAreaFilled(false);
         musculation.addActionListener(new Calspo(this));


         back = new JButton();
         back.setIcon(new ImageIcon("back2.png"));
         back.setBounds(10,20,80,70);
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



         wallsport = new JLabel();
     ImageIcon imgThisImg = new ImageIcon("wallsport.jpg");
     wallsport.setIcon(imgThisImg);
     getContentPane().add(wallsport);
     wallsport.setBounds(0,0,750,600);
 }

    public class Calspo implements ActionListener {
        private Sport g;
        public Calspo(Sport g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
        	
        	
        	if (e.getSource()==marche){
        		metier.Sport marche = new metier.Sport(162,"marche");	  		
        		g.setEnabled(false); 
        		Calculsport c= new Calculsport();      		
        		c.confirmer.addActionListener(new ActionListener(){     	  
              	  public void actionPerformed(ActionEvent e) {
              		
              		int a=marche.caloriesP((Integer.parseInt(c.time.getSelectedItem().toString())));
            		System.out.println(a);
            		Utilisateur.ajouterS(marche);
            		g.setEnabled(true);
            		c.dispose(); }  
                });
        	}
        	if (e.getSource()==velo){
        		metier.Sport velo = new metier.Sport(162,"velo");	  		
        		g.setEnabled(false); 
        		Calculsport c= new Calculsport();      		
        		c.confirmer.addActionListener(new ActionListener(){     	  
              	  public void actionPerformed(ActionEvent e) {
              		int a=velo.caloriesP((Integer.parseInt(c.time.getSelectedItem().toString())));
              		
            		System.out.println(a);
            		Utilisateur.ajouterS(velo);
            		g.setEnabled(true);
            		c.dispose(); }  
                });
        	}
        	if (e.getSource()==foot){
        		metier.Sport foot = new metier.Sport(162,"foot");	  		
        		g.setEnabled(false); 
        		Calculsport c= new Calculsport();      		
        		c.confirmer.addActionListener(new ActionListener(){     	  
              	  public void actionPerformed(ActionEvent e) {
              		int a=foot.caloriesP((Integer.parseInt(c.time.getSelectedItem().toString())));
              		
            		System.out.println(a);
            		Utilisateur.ajouterS(foot);
            		g.setEnabled(true);
            		c.dispose(); }  
                });
        	}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	

            
        } }
    public class Back implements ActionListener {
        private Sport g;
        public Back(Sport g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
            
            Bilan c= new Bilan(util);
            g.dispose();
        } }

    public void actionPerformed(ActionEvent e) {

    }
}
