import javax.swing.JApplet;
import java.awt.Graphics;

public class GulenYuz extends JApplet
{
	public void paint(Graphics tuval)
	{
	tuval.drawOval(100,50,200,200);
	tuval.fillOval(155,100,10,20);
	tuval.fillOval(230,100,10,20);
	tuval.drawArc(150,160,100,50,180,180);
	}
}
