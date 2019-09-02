import javax.swing.*;
import javax.swing.JFrame;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.net.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
public class HomePage extends JPanel
{
   private JPanel login;
   public HomePage(hacktj instance)
   {
      setLayout(new BorderLayout());
      BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);;
      try
      {
         image = ImageIO.read(new URL("http://jhoughton.me/hacktj/images/tjlogo.jpg"));
      }
      catch(IOException ex)
      {
         System.out.println (ex.toString());
         System.out.println("Could not find file");
      }
      JLabel label = new JLabel(new ImageIcon(image));
      add(label, BorderLayout.PAGE_START);
      login = new JPanel();
      //login.setLayout(new GridLayout(5, 1));
      /*
      JLabel blank = new JLabel("");
      login.setLayout(new BoxLayout(login, BoxLayout.Y_AXIS));
      JLabel labellog = new JLabel("Login using your Intranet credidentials");
      login.add(labellog);
      JLabel labeluser = new JLabel("Username:");
      login.add(labeluser);
      JTextField user = new JTextField();
      login.add(user);
      JLabel labelpass = new JLabel("Password:");
      login.add(labelpass);
      JTextField pass = new JTextField();
      login.add(pass);
      JButton loginbutton = new JButton("LOGIN");
      login.add(loginbutton);
      */
      JLabel userLabel = new JLabel("User");
      userLabel.setBounds(10, 10, 80, 25);
      login.add(userLabel);
   
      JTextField userText = new JTextField(20);
      userText.setBounds(100, 10, 160, 25);
      login.add(userText);
   
      JLabel passwordLabel = new JLabel("Password");
      passwordLabel.setBounds(10, 40, 80, 25);
      login.add(passwordLabel);
   
      JPasswordField passwordText = new JPasswordField(20);
      passwordText.setBounds(100, 40, 160, 25);
      login.add(passwordText);
   
      JButton loginButton = new JButton("login");
      loginButton.setBounds(10, 80, 80, 25);
	  loginButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
			{
				instance.loadPage(new TeacherPage(instance));
			}
		}
		);
      login.add(loginButton);
	  add(login, BorderLayout.CENTER);
   }
}
