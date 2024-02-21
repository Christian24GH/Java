import javax.swing.*;

public class DisplayGraphics{

   public static void main(String[] args){
      JFrame frame = new JFrame("Login Form");
      
      JPanel panel = new JPanel();
      panel.setLayout(null);

      JLabel header = new JLabel("Applet");
      header.setBounds(10, 10 ,100, 25);
      panel.add(header);

      JLabel userlabel = new JLabel("User");
      userlabel.setBounds(20, 50, 80, 25);
      panel.add(userlabel);

      JTextField userText = new JTextField(20);
      userText.setBounds(100, 50, 165, 25);
      panel.add(userText);

      JLabel passwordLabel = new JLabel("Password");
      passwordLabel.setBounds(20, 80, 80, 25);
      panel.add(passwordLabel);

      JPasswordField PasswordText = new JPasswordField(20);
      PasswordText.setBounds(100, 80, 165, 25);
      panel.add(PasswordText);
      
      JButton login = new JButton("Login");
      login.setBounds(20, 120, 80, 25);
      panel.add(login);

      frame.add(panel);
      frame.setSize(300, 250);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}