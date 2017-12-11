import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JPasswordField;
    import javax.swing.JTextField;
    import javax.swing.JLabel;
    import java.awt.Container;
    import java.awt.BorderLayout;
    import java.awt.GridLayout;
    
    
    public class UserReg extends JFrame{
    	UserReg(String title){
     		setTitle(title);
      		setSize(500,500);
     		setLocation(500,500);
       		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		
    		JPanel panel = new JPanel();
      		panel.setLayout(new GridLayout(2, 2));
    		
    		JPasswordField jpf = new JPasswordField("",10);
    		JLabel lbl = new JLabel("mail");
      	    JLabel lbl2 = new JLabel("Password");
    		JTextField jtf = new JTextField("",20);
            
            panel.add(lbl);
            panel.add(jtf);
            panel.add(lbl2);
            panel.add(jpf);
            
            Container cp = getContentPane();
            cp.add(panel,BorderLayout.NORTH); 
    	}
    
    	public static void main(String args[]){
     		UserReg window = new UserReg("Window");
       		window.setVisible(true);	
      
      }
    }