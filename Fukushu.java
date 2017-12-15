import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.awt.BorderLayout;
import java.awr.event.ActionListener;
import javax.awt.ActionEvent;
import javax.awt.GridLayout;
import javax.awt.event.Container;

public class Fukushu extends JFrame{
	public class Fukushu extends JFrame implements ActionListener{
   	private JLabel lbl;
   	private JCheckBox check;
   	public static void main(String[] args){
   		Fukushu fs = new Fukushu("復習！");
   		fs.setVisible(true);
   	}
   	public void actionPerformed(ActionEvent e){
   		if(this.check.isSelected()){
   			this.lbl.setText(this.check.getText()+"が選択されています。");
   		}else{
   			this.lbl.setText("何も選択されてません。");
   		}
   	}
   	Fukushu(String title){
   		setTitle(title);
   		setSize(300,100);
   		setLocation(0,0);
   		setDefaultCloseOperation(EXIT_ON_CLOSE);
   
   		this.check = new JCheckBox("test");
   		this.lbl = new JLabel("Hello");
   		JPanel pnl = new JPanel();
   		JPanel pnl1 = new JPanel();
   		JButton btn = new JButton("Click!");
   		btn.addActionListener(this);
   
   		pnl.add(check);
   		pnl.add(this.lbl);
   		pnl1.add(btn);
   
   		Container cp = getContentPane();
   		cp.add(pnl,BorderLayout.NORTH);
   		cp.add(pnl1,BorderLayout.SOUTH);
   	}
   }
  


}