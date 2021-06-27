package Interface;

import javax.swing.*;

import metier.Utilisateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;


public class Gateaux extends JFrame  {
    private JLabel gateau, wallplats , logo;
    private JButton gateauchocolat  , gateaufruit , tartefruit , tartecreme , chessecake , genoise , chaussonfruits , chaussonchocolat , gaufre , millefeuille,back ;
    
    Utilisateur util ;
    public Gateaux(Utilisateur util ) 
    {
        this.util=util ;

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(750 , 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Gateaux");





        gateau = new JLabel("Gateaux") ;
        gateau.setBounds(250,10,400,90);
        gateau.setForeground(new Color(255,255,0) ) ;
        gateau.setFont(new Font("Rockwell", 1, 60));
        getContentPane().add(gateau) ;

        gateauchocolat = new JButton("Gateau au chocolat") ;
        getContentPane().add(gateauchocolat) ;
        gateauchocolat.setBounds(130,100,500,35);
        gateauchocolat.setForeground(new Color(0,0,0) ) ;
        gateauchocolat.setFont(new Font("Serif", 1, 25));
        gateauchocolat.setOpaque(false);
        gateauchocolat.setContentAreaFilled(false);
        gateauchocolat.addActionListener(new Cal(this));

        gateaufruit = new JButton("Gateau aux fruits") ;
        getContentPane().add(gateaufruit) ;
        gateaufruit.setBounds(130,140,500,35);
        gateaufruit.setForeground(new Color(0,0,0) ) ;
        gateaufruit.setFont(new Font("Serif", 1, 25));
        gateaufruit.setOpaque(false);
        gateaufruit.setContentAreaFilled(false);
        gateaufruit.addActionListener(new Cal(this));


        tartefruit = new JButton("Tarte de fruit") ;
        getContentPane().add(tartefruit) ;
        tartefruit.setBounds(130,180,500,35);
        tartefruit.setForeground(new Color(0,0,0) ) ;
        tartefruit.setFont(new Font("Serif", 1, 25));
        tartefruit.setOpaque(false);
        tartefruit.setContentAreaFilled(false);
        tartefruit.addActionListener(new Cal(this));


        tartecreme = new JButton("Tarte de crème") ;
        getContentPane().add(tartecreme) ;
        tartecreme.setBounds(130,220,500,35);
        tartecreme.setForeground(new Color(0,0,0) ) ;
        tartecreme.setFont(new Font("Serif", 1, 25));
        tartecreme.setOpaque(false);
        tartecreme.setContentAreaFilled(false);
        tartecreme.addActionListener(new Cal(this));


        chessecake = new JButton("Chessecake") ;
        getContentPane().add(chessecake) ;
        chessecake.setBounds(130,260,500,35);
        chessecake.setForeground(new Color(0,0,0) ) ;
        chessecake.setFont(new Font("Serif", 1, 25));
        chessecake.setOpaque(false);
        chessecake.setContentAreaFilled(false);
        chessecake.addActionListener(new Cal(this));


        genoise = new JButton("Genoise") ;
        getContentPane().add(genoise) ;
        genoise.setBounds(130,300,500,35);
        genoise.setForeground(new Color(0,0,0) ) ;
        genoise.setFont(new Font("Serif", 1, 25));
        genoise.setOpaque(false);
        genoise.setContentAreaFilled(false);
        genoise.addActionListener(new Cal(this));


        chaussonfruits = new JButton("Chausson aux fruits") ;
        getContentPane().add(chaussonfruits) ;
        chaussonfruits.setBounds(130,340,500,35);
        chaussonfruits.setForeground(new Color(0,0,0) ) ;
        chaussonfruits.setFont(new Font("Serif", 1, 25));
        chaussonfruits.setOpaque(false);
        chaussonfruits.setContentAreaFilled(false);
        chaussonfruits.addActionListener(new Cal(this));


        chaussonchocolat = new JButton("Chausson au chocolat") ;
        getContentPane().add(chaussonchocolat) ;
        chaussonchocolat.setBounds(130,380,500,35);
        chaussonchocolat.setForeground(new Color(0,0,0) ) ;
        chaussonchocolat.setFont(new Font("Serif", 1, 25));
        chaussonchocolat.setOpaque(false);
        chaussonchocolat.setContentAreaFilled(false);
        chaussonchocolat.addActionListener(new Cal(this));


        gaufre = new JButton("Gaufre") ;
        getContentPane().add(gaufre) ;
        gaufre.setBounds(130,420,500,35);
        gaufre.setForeground(new Color(0,0,0) ) ;
        gaufre.setFont(new Font("Serif", 1, 25));
        gaufre.setOpaque(false);
        gaufre.setContentAreaFilled(false);
        gaufre.addActionListener(new Cal(this));


        millefeuille = new JButton("Millefeuille") ;
        getContentPane().add(millefeuille) ;
        millefeuille.setBounds(130,460,500,35);
        millefeuille.setForeground(new Color(0,0,0) ) ;
        millefeuille.setFont(new Font("Serif", 1, 25));
        millefeuille.setOpaque(false);
        millefeuille.setContentAreaFilled(false);
        millefeuille.addActionListener(new Cal(this));


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
        private Gateaux g;
        public Cal(Gateaux g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
   String s ="gramme";
            Calcul c= new Calcul(s);
        } }
    public class Back implements ActionListener {
        private Gateaux  g;
        public Back(Gateaux g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {
           
            Aliments c= new Aliments(util);
            g.dispose();
        } }

  /*  public static void main (String[] args ) {

        Gateaux gat =new Gateaux () ;
    }*/
}
