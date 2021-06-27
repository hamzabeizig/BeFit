package Interface;
import javax.swing.*;

import metier.Utilisateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.*;


 public class Poidsideale extends JFrame  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel wall,logo,poids;
    private JButton poidsS,poidsM ;
    private JButton back ;
    Utilisateur util ;
    public Poidsideale(Utilisateur util) {

        this.util=util ;
    	
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Be Fit ");
        
        
        
        logo = new JLabel();
        ImageIcon log = new ImageIcon("logoo99.png");
        logo.setIcon(log);
        getContentPane().add(logo);
        logo.setBounds(650,450,508,200);

      
        
        poids = new JLabel("Poids Idéale") ;
        poids.setBounds(70,100,400,90);
        poids.setForeground(new Color(157,157,157) ) ;
        poids.setFont(new Font("Rockwell", 1, 60));
        getContentPane().add(poids) ;
        
        
       poidsS = new JButton(" par sexe ") ;
       ImageIcon poids33 = new ImageIcon("poids33.png");
        getContentPane().add(poidsS) ;
        poidsS.setIcon(poids33);
        poidsS.setBounds(50,250,400,70);
        poidsS.setForeground(new Color(0,0,0) ) ;
        poidsS.setFont(new Font("Calibri", 1, 20));
        poidsS.setOpaque(false);
        poidsS.setContentAreaFilled(false);
        poidsS.addActionListener(new Poidss(this));
        

        


        poidsM = new JButton(" par morphologie ") ;
        ImageIcon poids22 = new ImageIcon("poids22.png");
        getContentPane().add(poidsM) ;
       poidsM.setIcon(poids22);
        poidsM.setBounds(50,340,400,70);
        poidsM.setForeground(new Color(0,0,0) ) ;
        poidsM.setFont(new Font("Calibri", 1, 20));
        poidsM.setOpaque(false);
        poidsM.setContentAreaFilled(false);
        poidsM.addActionListener(new PoidsM(this));

        
        back = new JButton();
        back.setIcon(new ImageIcon("back2.png"));
        back.setBounds(0,0,80,70);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        getContentPane().add(back);
        back.addActionListener(new Back(this));
        
        
        
        
       wall = new JLabel();
       getContentPane().add(wall);
       wall.setBounds(0,0,800,540);
       ImageIcon imgThisImg = new ImageIcon("poids1.jpg");
       wall.setIcon(imgThisImg);

    }
    public class Back implements ActionListener {
        private Poidsideale  g;
        public Back(Poidsideale g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

            Bilan c= new Bilan(util);
            g.dispose();
        } }
    public class Poidss implements ActionListener {
        private Poidsideale  g;
        public Poidss(Poidsideale g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

            
            poidsM.setVisible(false);
            poidsS.setVisible(false);
            wall.setVisible(false);
         
        	  JLabel poidssexe = new JLabel(String.valueOf((int)util.poids_ideal_sexe())+"  KG  ") ;
              poidssexe.setBounds(170,250,200,70);
              poidssexe.setForeground(new Color(0,0,0) ) ;
              poidssexe.setFont(new Font("Serif", 1, 40));
              getContentPane().add(poidssexe);
             
              
              back.setVisible(false);
              back = new JButton();
              back.setIcon(new ImageIcon("back2.png"));
              back.setBounds(0,0,80,70);
              back.setOpaque(false);
              back.setContentAreaFilled(false);
              back.setBorderPainted(false);
              getContentPane().add(back);
              back.addActionListener(new ActionListener() {
            	  
            	  public void actionPerformed(ActionEvent e) {
            		  
            		  g.dispose();
            	    	 Poidsideale test =new Poidsideale (util) ;

            	  }  
              });
           
           
              
              
              wall = new JLabel();
              getContentPane().add(wall);
              wall.setBounds(0,0,800,540);
              ImageIcon imgThisImg = new ImageIcon("poids1.jpg");
              wall.setIcon(imgThisImg);

        	  
        }
    }
    public class PoidsM implements ActionListener {
        private Poidsideale  g;
        public PoidsM(Poidsideale g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

            
            poidsM.setVisible(false);
            poidsS.setVisible(false);
            wall.setVisible(false);
        
        	  JLabel poidsM = new JLabel(String.valueOf((int)util.poids_ideal_morphologie("NORMALE")+"  KG  ")) ;
              poidsM.setBounds(170,250,200,70);
              poidsM.setForeground(new Color(0,0,0) ) ;
              poidsM.setFont(new Font("Serif", 1, 40));
              getContentPane().add(poidsM);
              
              
              back.setVisible(false);
              back = new JButton();
              back.setIcon(new ImageIcon("back2.png"));
              back.setBounds(0,0,80,70);
              back.setOpaque(false);
              back.setContentAreaFilled(false);
              back.setBorderPainted(false);
              getContentPane().add(back);
              back.addActionListener(new ActionListener() {
            	  
            	  public void actionPerformed(ActionEvent e) {
            		  String s=null ;
            		      g.dispose(); 
            	    	 Poidsideale test =new Poidsideale (util) ;

            	  }  
              });
              
              wall = new JLabel();
              getContentPane().add(wall);
              wall.setBounds(0,0,800,540);
              ImageIcon imgThisImg = new ImageIcon("poids1.jpg");
              wall.setIcon(imgThisImg);

        	  
        }
    }
    
    
     public static void main (String[] args ) {
         Utilisateur util=null ;
    	 Poidsideale test =new Poidsideale (util) ;
     }
 }
