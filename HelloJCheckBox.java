import javax.swing.*;
  import java.awt.*;
  public class HelloJCheckBox extends JFrame{
      HelloJCheckBox(String title){
        setTitle(title);
        setSize(500,500);
        setLocation(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pnl = new JPanel();
        pnl.setLayout(new GridLayout(3,1));
        
        JCheckBox cb1 = new JCheckBox("A");
        JCheckBox cb2 = new JCheckBox("B");
        JCheckBox cb3 = new JCheckBox("C");
  
        pnl.add(cb1);
        pnl.add(cb2);
        pnl.add(cb3);
  
        Container cp = getContentPane();
        cp.add(pnl,BorderLayout.NORTH);
        
      }
    public static void main(String[] args) {
        HelloJCheckBox window = new HelloJCheckBox("CB");
        window.setVisible(true);
    }
  }