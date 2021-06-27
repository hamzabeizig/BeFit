package Interface;


import javax.swing.*;

import metier.Aliment;
import metier.Utilisateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.*;


public class Plats extends JFrame  {
    private JLabel plat, wallplats , logo;
    private JButton spagetti  , lasagne , couscous , riz , soupe , salade , ojja , viande , poulet , poisson,back ;
    Utilisateur util ; 
    public Plats(Utilisateur util ) 
    {
        this.util = util ; 
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Plats");





        plat = new JLabel("Plats") ;
        plat.setBounds(310,10,400,90);
        plat.setForeground(new Color(255,255,0) ) ;
        plat.setFont(new Font("Rockwell", 1, 60));
        getContentPane().add(plat) ;

        spagetti = new JButton("Spaghetti") ;
        getContentPane().add(spagetti) ;
        spagetti.setBounds(130,100,500,35);
        spagetti.setForeground(new Color(0,0,0) ) ;
        spagetti.setFont(new Font("Serif", 1, 25));
        spagetti.setOpaque(false);
        spagetti.setContentAreaFilled(false);
        spagetti.addActionListener(new Cal(this));

        lasagne = new JButton("Lasagne") ;
        getContentPane().add(lasagne) ;
        lasagne.setBounds(130,140,500,35);
        lasagne.setForeground(new Color(0,0,0) ) ;
        lasagne.setFont(new Font("Serif", 1, 25));
        lasagne.setOpaque(false);
        lasagne.setContentAreaFilled(false);
        lasagne.addActionListener(new Cal(this));


        couscous = new JButton("Couscous") ;
        getContentPane().add(couscous) ;
        couscous.setBounds(130,180,500,35);
        couscous.setForeground(new Color(0,0,0) ) ;
        couscous.setFont(new Font("Serif", 1, 25));
        couscous.setOpaque(false);
        couscous.setContentAreaFilled(false);
        couscous.addActionListener(new Cal(this));


        riz = new JButton("Riz") ;
        getContentPane().add(riz) ;
        riz.setBounds(130,220,500,35);
        riz.setForeground(new Color(0,0,0) ) ;
        riz.setFont(new Font("Serif", 1, 25));
        riz.setOpaque(false);
        riz.setContentAreaFilled(false);
        riz.addActionListener(new Cal(this));


        soupe = new JButton("Soupe") ;
        getContentPane().add(soupe) ;
        soupe.setBounds(130,260,500,35);
        soupe.setForeground(new Color(0,0,0) ) ;
        soupe.setFont(new Font("Serif", 1, 25));
        soupe.setOpaque(false);
        soupe.setContentAreaFilled(false);
        soupe.addActionListener(new Cal(this));


        salade = new JButton("Salade") ;
        getContentPane().add(salade) ;
        salade.setBounds(130,300,500,35);
        salade.setForeground(new Color(0,0,0) ) ;
        salade.setFont(new Font("Serif", 1, 25));
        salade.setOpaque(false);
        salade.setContentAreaFilled(false);
        salade.addActionListener(new Cal(this));


        ojja = new JButton("Ojja") ;
        getContentPane().add(ojja) ;
        ojja.setBounds(130,340,500,35);
        ojja.setForeground(new Color(0,0,0) ) ;
        ojja.setFont(new Font("Serif", 1, 25));
        ojja.setOpaque(false);
        ojja.setContentAreaFilled(false);
        ojja.addActionListener(new Cal(this));


        viande = new JButton("Viande grillée") ;
        getContentPane().add(viande) ;
        viande.setBounds(130,380,500,35);
        viande.setForeground(new Color(0,0,0) ) ;
        viande.setFont(new Font("Serif", 1, 25));
        viande.setOpaque(false);
        viande.setContentAreaFilled(false);
        viande.addActionListener(new Cal(this));


        poulet = new JButton("poulet grillée") ;
        getContentPane().add(poulet) ;
        poulet.setBounds(130,420,500,35);
        poulet.setForeground(new Color(0,0,0) ) ;
        poulet.setFont(new Font("Serif", 1, 25));
        poulet.setOpaque(false);
        poulet.setContentAreaFilled(false);
        poulet.addActionListener(new Cal(this));


        poisson = new JButton("poisson grillée") ;
        getContentPane().add(poisson) ;
        poisson.setBounds(130,460,500,35);
        poisson.setForeground(new Color(0,0,0) ) ;
        poisson.setFont(new Font("Serif", 1, 25));
        poisson.setOpaque(false);
        poisson.setContentAreaFilled(false);
        poisson.addActionListener(new Cal(this));


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
        private Plats g;
        public Cal(Plats g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
        	String s="gramme";
        	
        	if (e.getSource()==spagetti){
        		Aliment spagetti = new Aliment(162,"spagetti");	  		
        		g.setEnabled(false); 
        		Calcul c= new Calcul(s);      		
        		c.confirmer.addActionListener(new ActionListener(){     	  
              	  public void actionPerformed(ActionEvent e) {
              		int a=spagetti.caloriesP((Integer.parseInt(c.area.getText())));
            		System.out.println(a);
            		Utilisateur.ajouterA(spagetti);
            		g.setEnabled(true);
            		c.dispose(); }  
                });
        	}
        	if (e.getSource()==lasagne)
        	{
        		Aliment lasagne = new Aliment(135,"lasagne");
        		g.setEnabled(false); 
        		Calcul c= new Calcul(s);      		
        		c.confirmer.addActionListener(new ActionListener(){     	  
              	  public void actionPerformed(ActionEvent e) {
              		int a=lasagne.caloriesP((Integer.parseInt(c.area.getText())));
            		System.out.println(a);
            		Utilisateur.ajouterA(lasagne);
            		g.setEnabled(true);
            		c.dispose(); }  
                });
        		
        		
        	}
        	if (e.getSource()==couscous)
        	{
        		Aliment couscous = new Aliment(112,"couscous");
        		g.setEnabled(false);
        		Calcul c= new Calcul(s);
        		c.confirmer.addActionListener(new ActionListener(){     	  
                	  public void actionPerformed(ActionEvent e) {
                		int a=couscous.caloriesP((Integer.parseInt(c.area.getText())));
              		System.out.println(a);
              		Utilisateur.ajouterA(couscous);
              		g.setEnabled(true);
              		c.dispose(); }  
                  });
        		
        	}
        	if (e.getSource()==riz)
        	{
        		Aliment riz = new Aliment(130,"riz");
        		g.setEnabled(false); 
        		Calcul c= new Calcul(s);
        		c.confirmer.addActionListener(new ActionListener(){     	  
              	  public void actionPerformed(ActionEvent e) {
              		int a=riz.caloriesP((Integer.parseInt(c.area.getText())));
            		System.out.println(a);
            		Utilisateur.ajouterA(riz);
            		g.setEnabled(true);
            		c.dispose(); }  
                });
        		
        	}
        	if (e.getSource()==soupe)
        	{
        		Aliment soupe = new Aliment(49,"soupe");
        		g.setEnabled(false); 
        		Calcul c= new Calcul(s);
        		c.confirmer.addActionListener(new ActionListener(){     	  
                	  public void actionPerformed(ActionEvent e) {
                		int a=soupe.caloriesP((Integer.parseInt(c.area.getText())));
              		System.out.println(a);
              		Utilisateur.ajouterA(soupe);
              		g.setEnabled(true);
              		c.dispose(); }  
                  });
        		
        	}
        	if (e.getSource()==salade)
        	{
        		Aliment salade = new Aliment(152,"salade");
        		g.setEnabled(false); 
        		Calcul c= new Calcul(s);
        		c.confirmer.addActionListener(new ActionListener(){     	  
              	  public void actionPerformed(ActionEvent e) {
              		int a=salade.caloriesP((Integer.parseInt(c.area.getText())));
            		System.out.println(a);
            		Utilisateur.ajouterA(salade);
            		g.setEnabled(true);
            		c.dispose(); }  
                });
        		
        		
        		
        	}
        	if (e.getSource()==ojja)
        	{
        		Aliment ojja = new Aliment(400,"ojja");
        		g.setEnabled(false); 
        		Calcul c= new Calcul(s);
        		c.confirmer.addActionListener(new ActionListener(){     	  
                	  public void actionPerformed(ActionEvent e) {
                		int a=ojja.caloriesP((Integer.parseInt(c.area.getText())));
              		System.out.println(a);
              		Utilisateur.ajouterA(ojja);
              		g.setEnabled(true);
              		c.dispose(); }  
                  });
        		
        	}
        	if (e.getSource()==viande)
        	{
        		Aliment viande = new Aliment(143,"viande");
        		g.setEnabled(false); 
        		Calcul c= new Calcul(s);
        		c.confirmer.addActionListener(new ActionListener(){     	  
              	  public void actionPerformed(ActionEvent e) {
              		int a=viande.caloriesP((Integer.parseInt(c.area.getText())));
            		System.out.println(a);
            		Utilisateur.ajouterA(viande);
            		g.setEnabled(true);
            		c.dispose(); }  
                });
        		
        	}
        	if (e.getSource()==poulet)
        	{
        		Aliment poulet = new Aliment(143,"poulet");
        		g.setEnabled(false); 
        		Calcul c= new Calcul(s);
        		c.confirmer.addActionListener(new ActionListener(){     	  
                	  public void actionPerformed(ActionEvent e) {
                		int a=poulet.caloriesP((Integer.parseInt(c.area.getText())));
              		System.out.println(a);
              		Utilisateur.ajouterA(poulet);
              		g.setEnabled(true);
              		c.dispose(); }  
                  });
        	
        	}
        	if (e.getSource()==poisson)
        	{
        		Aliment poisson = new Aliment(186,"poisson");
        		g.setEnabled(false); 
        		Calcul c= new Calcul(s);
        		c.confirmer.addActionListener(new ActionListener(){     	  
              	  public void actionPerformed(ActionEvent e) {
              		int a=poisson.caloriesP((Integer.parseInt(c.area.getText())));
            		System.out.println(a);
            		Utilisateur.ajouterA(poisson);
            		g.setEnabled(true);
            		c.dispose(); }  
                });
        		
        	}
   
            
        } }
    public class Back implements ActionListener {
        private Plats  g;
        public Back(Plats g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
            
            Aliments c= new Aliments(util);
            g.dispose();
        } }
   
  
}
