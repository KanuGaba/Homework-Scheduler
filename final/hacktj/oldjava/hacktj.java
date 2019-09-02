import	javax.swing.*;
import	java.awt.*;

public	class hacktj extends JApplet
{
	public	static void main(String args[])
	{
	}
	public void loadPage(JPanel p)
	{
		getContentPane().add(p);
	}
	public void init()
	{
/*
		try	{
	           SwingUtilities.invokeAndWait(new Runnable() {
	               public void run() {
					JPanel home = new HomePage();
					add(home);
				}});
*/
	this.loadPage(new HomePage(this));
	}
}
