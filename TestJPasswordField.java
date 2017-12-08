import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestJPasswordField extends JFrame implements ActionListener{
  JPasswordField pass;
  JPasswordField pass2;

  public static void main(String args[]){
    TestJPasswordField frame = new TestJPasswordField("タイトル");
    frame.setVisible(true);
  }

  TestJPasswordField(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JLabel label = new JLabel("パスワードを入力:");
    pass = new JPasswordField(10);

    JLabel label2 = new JLabel("メールアドレスを入力:");
    pass2 = new JPasswordField(20);


    JButton button = new JButton("確認");
    button.addActionListener(this);

    p.add(label);
    p.add(label);
    p.add(pass);
    p.add(button);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e){
    String password = new String(pass.getPassword());

    if (password.equals("0000")){
      JLabel label = new JLabel("認証に成功しました");
      JOptionPane.showMessageDialog(this, label, "成功", JOptionPane.INFORMATION_MESSAGE);
    }else{
      JLabel label = new JLabel("パスワードが違います");
      JOptionPane.showMessageDialog(this, label, "失敗", JOptionPane.ERROR_MESSAGE);
      pass.setText("");
    }
  }
}