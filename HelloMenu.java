import javax.swing.*;
   import java.awt.*;
   
   public class HelloMenu extends JFrame {
     
     HelloMenu(String title) {
    
       setTitle(title);
       setSize(400, 400);
       setLocation(400, 400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
       JMenuBar menubar = new JMenuBar();
       
    
       JMenu menu1 = new JMenu("File");
       
      
       JMenuItem menuItem1 = new JMenuItem("new");
       JMenuItem menuItem2 = new JMenuItem("open");
       
    
       setJMenuBar(menubar);
       menubar.add(menu1);
       menu1.add(menuItem1);
       menu1.add(menuItem2);
     }
  
     public static void main(String[] args) {
       HelloMenu frame = new HelloMenu("ALOHA");
       frame.setVisible(true);
     }
   }