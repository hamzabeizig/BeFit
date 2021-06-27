package Interface;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import metier.Utilisateur;

public class Connecter extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel pseudo;
    private JLabel password  ;
    private JButton valider ;
    private JButton annuler ;
    private JButton back;
    private JTextField textpseudo ;
    private JPasswordField textpassword ;
    private JLabel title ;
    private JLabel logo  ;
    private JLabel meryam  ;
    public static  Utilisateur util ;
	
	
	
	
	public Connecter(Utilisateur util)
	{
		Connecter.util=util;
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

	        title = new JLabel("Connecter ") ;
	        title.setBounds(200,70,400,90);
	        title.setForeground(new Color(255,255,255) ) ;
	        title.setFont(new Font("Rockwell", 1, 60));
	        getContentPane().add(title) ;
		
		
		
	        pseudo = new JLabel("Pseudo :") ;
	        pseudo.setFont(new Font("Arial", 3, 20));
	        pseudo.setForeground(new Color(255,255 ,255) ) ;
	        pseudo.setBounds(200,200,100,20);
	        getContentPane().add(pseudo) ;

	        password = new JLabel("Mot de passe :") ;
	        password.setFont(new Font("Arial", 3, 20));
	        password.setForeground(new Color(255,255 ,255) ) ;
	        password.setBounds(200,240,140,20);
	        getContentPane().add(password) ;
	        
	        
	        
	        
	        
	        back = new JButton();
	        back.setIcon(new ImageIcon("back2.png"));
	        back.setBounds(10,20,80,70);
	        back.setOpaque(false);
	        back.setContentAreaFilled(false);
	        back.setBorderPainted(false);
	        getContentPane().add(back);
	        back.addActionListener(new Back(this));
	        
	        
	        
	        
	        textpseudo = new JTextField() ;
	        textpseudo.setForeground(new Color(50,50 ,50) ) ;
	        textpseudo.setBounds(350,200,150,20);
	        getContentPane().add(textpseudo) ;
	        

	        textpassword = new JPasswordField() ;
	        textpassword.setForeground(new Color(50,50 ,50) ) ;
	        textpassword.setBounds(350,240,150,20);
	        getContentPane().add(textpassword) ;
	        
	        
	        valider= new JButton("Valider") ;
	        valider.setFont(new Font("Arial", 3, 16));
	        getContentPane().add(valider) ;
	        valider.setBounds(350,300,180,50);
	        valider.setIcon(new ImageIcon("Valider.png"));
	        valider.setOpaque(false);
	        valider.setContentAreaFilled(false);
	        valider.addActionListener(new Valider(this));
	        
	        

	        annuler= new JButton("reinitialiser") ;
	        annuler.setFont(new Font("Arial", 3, 16));
	        getContentPane().add(annuler) ;
	        annuler.setBounds(150,300,180,50);
	        annuler.setIcon(new ImageIcon("re.png"));
	        annuler.setOpaque(false);
	        annuler.setContentAreaFilled(false);
	        annuler.addActionListener(new Annuler(this));
	        
	        
	        
	        meryam = new JLabel();
	        ImageIcon imgThisImg = new ImageIcon("meryam2.jpg");
	        meryam.setIcon(imgThisImg);
	        getContentPane().add(meryam);
	        meryam.setBounds(0,0,750,600);
		
		
	}
	
	
	public class Back implements ActionListener {
        private Connecter  g;
        public Back(Connecter g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

            First c= new First();
            g.dispose();
        } }
	public class Annuler implements ActionListener {
        private Connecter  g;
        public Annuler(Connecter g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

          textpseudo.setText("");
          textpassword.setText("");
          		
        } }
	
	public class Valider implements ActionListener {
        private Connecter  g;
        public Valider(Connecter g)
        {
            this.g=g;
        }
        public void actionPerformed(ActionEvent e) {

          String psuedo=textpseudo.getText();
          @SuppressWarnings("deprecation")
		String password=textpassword.getText();
 
          if ( Utilisateur.verification(psuedo, password))
          {
        	  Bilan c= new Bilan(util);
        	  g.dispose();
          }
          else 
          {
        	  JOptionPane.showMessageDialog(null,"info incorrecte");
          }
        }
        }
	
	

}
