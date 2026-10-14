import javax.swing.JApplet;
import java.awt.Color;                 //ek
import java.awt.Graphics;

public class GulenYuz3 extends JApplet
{
	public static final int YUZ_CAP=200;
	public static final int X_YUZ=100;
	public static final int Y_YUZ=50;
	
	public static final int GOZ_GENISLIK=10;
	public static final int GOZ_YUKSEKLIK=20;
	public static final int X_SAG_GOZ=155;
	public static final int Y_SAG_GOZ=100;
	public static final int X_SOL_GOZ=230;
	public static final int Y_SOL_GOZ=Y_SAG_GOZ;
	
	public static final int BURUN_CAP=10; //ek
	public static final int X_BURUN=195;  //ek
	public static final int Y_BURUN=135;  //ek
	
	public static final int AGIZ_GENISLIK=100;
	public static final int AGIZ_YUKSEKLIK=50;
	public static final int X_AGIZ=150;
	public static final int Y_AGIZ=160;
	public static final int AGIZ_BASLAMA_ACISI=180;
	public static final int AGIZ_BITIS_ACISI=180;
		
	
	public void paint(Graphics tuval)
	{
		//Yüz çiziliyor
		tuval.setColor(Color.YELLOW);//ek
		tuval.fillOval(X_YUZ,Y_YUZ,YUZ_CAP,YUZ_CAP);//ek
		tuval.setColor(Color.BLACK);//ek
		tuval.drawOval(X_YUZ,Y_YUZ,YUZ_CAP,YUZ_CAP);//ek
		
		
		//Gözler çiziliyor
		tuval.setColor(Color.BLUE);//ek
		tuval.fillOval(X_SAG_GOZ,Y_SAG_GOZ,GOZ_GENISLIK,GOZ_YUKSEKLIK);
		tuval.fillOval(X_SOL_GOZ,Y_SOL_GOZ,GOZ_GENISLIK,GOZ_YUKSEKLIK);
		
		//Burun çiziliyor
		tuval.setColor(Color.BLACK);//ek
		tuval.fillOval(X_BURUN,Y_BURUN,BURUN_CAP,BURUN_CAP);//ek
		
		//Aðýz çiziliyor
		tuval.setColor(Color.RED);//ek
		tuval.drawArc(X_AGIZ,Y_AGIZ,AGIZ_GENISLIK,AGIZ_YUKSEKLIK,AGIZ_BASLAMA_ACISI,AGIZ_BITIS_ACISI);
		
	}
}